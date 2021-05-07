package eTicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	List<User> users = new ArrayList<User>();
	
	
	@Override
	public void register(User user) {
		System.out.println("Kayýt olundu , Hibernate ile eklendi " + user.getFirstName());
			users.add(user);			
	}

	@Override
	public void logIn(String email,String password) {
		System.out.println("Sisteme giriþ yapýldý " + email);
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
