package eTicaretDemo.business.concretes;

import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.UserValidationService;
import eTicaretDemo.entities.concretes.User;

public class UserValidationManager implements UserValidationService{
	public static final Pattern validEmailAddressRegex = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean isUserValid(User user) {
		boolean []booleans = {
				isUserFirstNameValid(user),
				isUserLastNameValid(user),
				isUserEmailValid(user),
				isUserPasswordValid(user),
				isAllFieldsFilled(user)};
		
		for(Boolean bool : booleans) {
			if(!bool) {				
				return false;
			}
		}
		return true;
	}
	private boolean isUserFirstNameValid(User user) {
		boolean result = user.getFirstName().length() >= 2;
		if(!result) {
			System.out.println("Ad en az 2 karakterden oluþmalýdýr !");
		}
		return result;
	}
	private boolean isUserLastNameValid(User user) {
		boolean result = user.getLastName().length() >= 2;
		if(!result) {
			System.out.println("Soyad en az 2 karakterden oluþmalýdýr !");
		}
		return result;
	}
	private boolean isUserEmailValid(User user) {
		boolean result = validEmailAddressRegex.matcher(user.getEmail()).find();
		if(!result) {
			System.out.println("Email, email formatýnda olmalýdýr ! (for_example@gmail.com)");
		}
		return result;
	}

	private boolean isUserPasswordValid(User user) {
		boolean result = user.getPassword().length() >= 6;
		if(!result) {
			System.out.println("Þifre en az 6 karakterden oluþmalýdýr !");
		}		
		return result;
	}
	private boolean isAllFieldsFilled(User user) {
		if(user.getFirstName().length() <= 0 || 
				user.getLastName().length() <= 0 || 
				user.getEmail().length() <= 0 || 
				user.getPassword().length() <= 0) {
			return false;
		
		}else {
				return true;
		}
	}

}
