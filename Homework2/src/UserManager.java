
public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý kullanýcý kayýt olundu.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " id numaralý kullanýcý silindi.");	
	}
	
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +" giriþ yaptý");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +" çýkýþ yaptý");
	}
	
	public void changePassword(User user,String newPassword) {
		user.setPassword(newPassword);
		System.out.println(user.getId() + " id numaralý kullanýcýnýn þifresi deðiþtirildi. ");
	}
	
}
