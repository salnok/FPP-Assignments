package June2018prob2;

import java.util.List;

public class Team {
	private String country;
	private Coach coach;
    private List<Player> players;
	public Team(String country, Coach coach, List<Player> players) {
		super();
		this.country = country;
		this.coach = coach;
		this.players = players;
	}
	public List<Player> getPlayers() {
		return players;
	}
	
	
}
