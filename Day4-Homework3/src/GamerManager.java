
public class GamerManager extends BaseUserManager {
	private UserCheckServise userCheckServise;
		
	public GamerManager(UserCheckServise userCheckServise) {
		super();
		this.userCheckServise = userCheckServise;
	}

	@Override
	public void register(User user) {
		if(userCheckServise.CheckIfRealPerson(user)) {
			System.out.println("Bilgiler e�le�ti  : " + user.getFirstName());
			super.register(user);
		}
		else {
			System.out.println("Bilgiler e�le�medi  : " + user.getFirstName());	
		}
		
	}

	@Override
	public void updateInformation(User user) {
		System.out.println(user.getFirstName() + " isimli oyuncu bilgilerini g�ncelledi .");
		
	}

	@Override
	public void deregistration(User user) {
		System.out.println(user.getFirstName() + " isimli oyuncu kayd�n� sildi .");
		
	}

}
