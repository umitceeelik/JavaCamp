package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserValidationService {
	boolean isUserValid(User user);
	
}
