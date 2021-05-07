package eTicaretDemo.core.concretes;

import java.util.Scanner;

import eTicaretDemo.business.abstracts.UserValidationService;
import eTicaretDemo.core.abstracts.AuthService;
import eTicaretDemo.core.abstracts.GoogleAccountAuthService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;


public class GoogleAccountAuthManagerAdapter implements GoogleAccountAuthService{
	UserValidationService userValidationService;
	private UserDao userDao;
	AuthService authService;
	
	
	public GoogleAccountAuthManagerAdapter(UserValidationService userValidationService, UserDao userDao,
			AuthService authService) {
		super();
		this.userValidationService = userValidationService;
		this.userDao = userDao;
		this.authService = authService;
	}

	public void register(String email,String password) { 
		Scanner input = new Scanner(System.in);
		 System.out.println("Adýnýz : ");
		 String firstName = input.nextLine();	
		 System.out.println("Soyadýnýz : ");
		 String lastName = input.nextLine(); 
		 User user = new User(firstName, lastName, email, password);      	
    	if( userValidationService.isUserValid(user)) {
    		userDao.register(user);
    	}else {
    		return;
    	}    	
     }
    
	public void logIn(String email,String password) {
		authService.logIn(email,password);
    	 
     }
}
