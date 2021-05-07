package eTicaretDemo;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.abstracts.UserValidationService;
import eTicaretDemo.business.concretes.AuthManager;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.business.concretes.UserValidationManager;
import eTicaretDemo.core.abstracts.AuthService;
import eTicaretDemo.core.abstracts.GoogleAccountAuthService;
import eTicaretDemo.core.concretes.GoogleAccountAuthManagerAdapter;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Emre", "Celik", "emre.celik@gmail.com", "Emre.123456");
		User user2 = new User("Ahmet", "Çelik", "ahmetclk@gmail.com", "Ac1233");
		
		UserDao userDao = new HibernateUserDao();
		UserValidationService userValidationService = new UserValidationManager();
		AuthService authService = new AuthManager(userValidationService,userDao);
		UserService userService = new UserManager(userDao, authService);
		
		GoogleAccountAuthService authService2 = new GoogleAccountAuthManagerAdapter(userValidationService, userDao, authService);
		
		userService.register(user1);
		System.out.println("********************************");		
		userService.register(user2);
		System.out.println("********************************");
		userService.logIn("emre.celik@gmail.com","Ac1233");
		System.out.println("********************************");
		authService2.register("umitclk2001@gmail.com", "Umit123456");
		System.out.println("********************************");
		authService2.logIn("umitclk2001@gmail.com", "Umit123456");
	}

}
