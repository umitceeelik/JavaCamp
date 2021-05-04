
public abstract class BaseUserManager implements UserService {

	@Override
	public  void register(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý kayýt oldu .");
	}
		
	@Override
	public  void updateInformation(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý bilgilerini güncelledi .");
	}
		
	@Override
	public  void deregistration(User user) 	{
		System.out.println(user.getFirstName() + " isimli kullanýcý kaydýný sildi .");
	}
}
