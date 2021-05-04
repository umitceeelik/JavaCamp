
public abstract class BaseUserManager implements UserService {

	@Override
	public  void register(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� kay�t oldu .");
	}
		
	@Override
	public  void updateInformation(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� bilgilerini g�ncelledi .");
	}
		
	@Override
	public  void deregistration(User user) 	{
		System.out.println(user.getFirstName() + " isimli kullan�c� kayd�n� sildi .");
	}
}
