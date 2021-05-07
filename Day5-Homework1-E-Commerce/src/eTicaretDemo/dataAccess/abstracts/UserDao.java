package eTicaretDemo.dataAccess.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;


public interface UserDao {
	void register(User user);
	void logIn(String email,String password);
	List<User> getAll();

}
