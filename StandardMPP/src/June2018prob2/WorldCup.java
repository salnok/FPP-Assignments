package June2018prob2;

import java.util.List;

public class WorldCup {

	private int year;
	private String location;
	private List<Team> teams;
	public WorldCup(int year, String location, List<Team> teams) {
		super();
		this.year = year;
		this.location = location;
		this.teams = teams;
	}
	public int getYear() {
		return year;
	}
	public List<Team> getTeams() {
		return teams;
	}

}
