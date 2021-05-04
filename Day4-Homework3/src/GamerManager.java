
public class GamerManager extends BaseUserManager {
	private UserCheckServise userCheckServise;
		
	public GamerManager(UserCheckServise userCheckServise) {
		super();
		this.userCheckServise = userCheckServise;
	}

	@Override
	public void register(User user) {
		if(userCheckServise.CheckIfRealPerson(user)) {
			System.out.println("Bilgiler eþleþti  : " + user.getFirstName());
			super.register(user);
		}
		else {
			System.out.println("Bilgiler eþleþmedi  : " + user.getFirstName());	
		}
		
	}

	@Override
	public void updateInformation(User user) {
		System.out.println(user.getFirstName() + " isimli oyuncu bilgilerini güncelledi .");
		
	}

	@Override
	public void deregistration(User user) {
		System.out.println(user.getFirstName() + " isimli oyuncu kaydýný sildi .");
		
	}

}
