package eTicaretDemo.business.concretes;

import java.util.List;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.core.abstracts.AuthService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private AuthService authService;
		
	
	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
			authService.register(user);
		
	}

	@Override
	public void logIn(String email,String password) {
		authService.logIn(email,password);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}


}
