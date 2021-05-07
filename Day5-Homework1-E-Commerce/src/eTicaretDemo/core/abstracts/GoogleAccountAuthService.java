package eTicaretDemo.core.abstracts;

public interface GoogleAccountAuthService {
	void register(String email,String password);
	void logIn(String email,String password);
}
