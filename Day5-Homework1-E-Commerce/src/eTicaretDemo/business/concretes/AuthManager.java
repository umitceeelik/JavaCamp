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
			System.out.println("Hatal� i�lem yapt�n�z , kay�t olma i�lemi ba�ar�s�z, l�tfen t�m alanlar� kontrol ediniz!");
			return;
		}
		if(!isEmailUnique(user)) {
			System.out.println("Kay�t olma i�lemi ba�ar�s�z , bu email daha �nce kullan�lm�� !");
			return;
		}
		System.out.println("Kayd�n�z ba�ar�yla ger�ekle�ti.");
		
		sendEmailToAuth(user);
		System.out.println("Kayd�n�z do�ruland� !!");
		userDao.register(user);
	}

	@Override
	public void logIn(String email,String password) {
		int counter = 0;
		for(User person : userDao.getAll()) {
			if(email.equals(person.getEmail())) {				
				if(password.equals(userDao.getAll().get(counter).getPassword())) {
					System.out.println("Ba�ar�l� bir �ekildi giri� yap�ld� .");
					userDao.logIn(email,password);
				}else if(!password.equals(userDao.getAll().get(counter).getPassword())){
					System.out.println("Eposta ile parola e�le�miyor , tekrar deneyiniz !");
					return;
				}else {
					System.out.println("Girilen e posta ile bir kay�t bulunamad� , e postay� kontrol ediniz ya da kay�t olunuz !");
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
		System.out.println("Mail " + user.getEmail() + " adresine g�nderildi. Kayd�n�z� tamamlamak i�in l�tfen do�rulama linkine t�klay�n�z.");		
	}
	
}
