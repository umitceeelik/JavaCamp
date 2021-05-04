
public class Game {
	private int gameId;
	private String gameName;
	private double gameCost;
	
	public Game(int gameId, String gameName, double gameCost) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameCost = gameCost;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGameCost() {
		return gameCost;
	}

	public void setGameCost(double gameCost) {
		this.gameCost = gameCost;
	}
		
}
