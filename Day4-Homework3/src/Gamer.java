import java.util.Date;

public class Gamer extends User {
	
	private String gamerNickname;
	private String gamerPassword;
	
	public Gamer(int userId, String firstName, String lastName, String nationalityId, Date dateOfBirth,
			String gamerNickname, String gamerPassword) {
		
		super(userId, firstName, lastName, nationalityId, dateOfBirth);
		this.gamerNickname = gamerNickname;
		this.gamerPassword = gamerPassword;
	}

	public String getGamerNickname() {
		return gamerNickname;
	}

	public void setGamerNickname(String gamerNickname) {
		this.gamerNickname = gamerNickname;
	}

	public String getGamerPassword() {
		return gamerPassword;
	}

	public void setGamerPassword(String gamerPassword) {
		this.gamerPassword = gamerPassword;
	}

}
