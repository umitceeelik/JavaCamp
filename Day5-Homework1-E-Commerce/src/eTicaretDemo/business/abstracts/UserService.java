package eTicaretDemo.business.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
	void register(User user);
	void logIn(String email,String password);
	List<User> getAll();

}
