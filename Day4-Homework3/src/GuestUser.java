import java.util.Date;

public class GuestUser extends User {
	private String emailAddress;

	public GuestUser(int userId, String firstName, String lastName, String nationalityId, Date dateOfBirth,
			String emailAddress) {
		super(userId, firstName, lastName, nationalityId, dateOfBirth);
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
