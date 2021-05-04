
public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adl� kullan�c� kay�t olundu.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " id numaral� kullan�c� silindi.");	
	}
	
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +" giri� yapt�");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +" ��k�� yapt�");
	}
	
	public void changePassword(User user,String newPassword) {
		user.setPassword(newPassword);
		System.out.println(user.getId() + " id numaral� kullan�c�n�n �ifresi de�i�tirildi. ");
	}
	
}
