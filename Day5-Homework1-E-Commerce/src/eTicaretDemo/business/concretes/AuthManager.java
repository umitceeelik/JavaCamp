package eTicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.business.abstracts.UserValidationService;
import eTicaretDemo.core.abstracts.AuthService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class AuthManager implements AuthService {
	UserValidationService userValidationService;
	private UserDao userDao;
	List<User> users = new ArrayList<>();
	
	public AuthManager(UserValidationService userValidationService, UserDao userDao) {
		super();
		this.userValidationService = userValidationService;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		
		if(!userValidationService.isUserValid(user)) {
			System.out.println("Hatalý iþlem yaptýnýz , kayýt olma iþlemi baþarýsýz, lütfen tüm alanlarý kontrol ediniz!");
			return;
		}
		if(!isEmailUnique(user)) {
			System.out.println("Kayýt olma iþlemi baþarýsýz , bu email daha önce kullanýlmýþ !");
			return;
		}
		System.out.println("Kaydýnýz baþarýyla gerçekleþti.");
		
		sendEmailToAuth(user);
		System.out.println("Kaydýnýz doðrulandý !!");
		userDao.register(user);
	}

	@Override
	public void logIn(String email,String password) {
		int counter = 0;
		for(User person : userDao.getAll()) {
			if(email.equals(person.getEmail())) {				
				if(password.equals(userDao.getAll().get(counter).getPassword())) {
					System.out.println("Baþarýlý bir þekildi giriþ yapýldý .");
					userDao.logIn(email,password);
				}else if(!password.equals(userDao.getAll().get(counter).getPassword())){
					System.out.println("Eposta ile parola eþleþmiyor , tekrar deneyiniz !");
					return;
				}else {
					System.out.println("Girilen e posta ile bir kayýt bulunamadý , e postayý kontrol ediniz ya da kayýt olunuz !");
				}							
			}
			counter++;
		}			
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public boolean isEmailUnique(User user) {	
		boolean result=true;
		for(int i = 0 ; i<userDao.getAll().size();i++) {
			if(userDao.getAll().size()==0) {
				result = true;
				break;
			}else if(user.getEmail().equals(userDao.getAll().get(i).getEmail())) {
				result = false;		
				}		
			}
		return result;
	}


	@Override
	public void sendEmailToAuth(User user) {
		System.out.println("Mail " + user.getEmail() + " adresine gönderildi. Kaydýnýzý tamamlamak için lütfen doðrulama linkine týklayýnýz.");		
	}
	
}
