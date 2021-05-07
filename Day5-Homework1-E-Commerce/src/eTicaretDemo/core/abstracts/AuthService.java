package eTicaretDemo.core.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void logIn(String email,String password);
	boolean isEmailUnique(User user);
	void sendEmailToAuth(User user);
	List<User> getAll();
}
