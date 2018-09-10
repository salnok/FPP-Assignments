package June2018.prob2.admin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import June2018prob2.Coach;
import June2018prob2.Player;
import June2018prob2.Position;
import June2018prob2.Team;
import June2018prob2.WorldCup;

public class Main {

	public static void main(String[] args) {
		//Uncomment below when you're ready for testing
		
		List<Team> teams1 = Arrays.asList(new Team("BRAZIL", new Coach("Luiz", 15),
				Arrays.asList(new Player("Marcos", 1, Arrays.asList(Position.GOALKEEPER)),
						new Player("L�cio", 3, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
						new Player("Roberto Carlos", 6, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
						new Player("Dida", 12, Arrays.asList(Position.GOALKEEPER)),
						new Player("Den�lson", 1, Arrays.asList(Position.MIDDLEFIELD, Position.DEFENDER)))),

				new Team("GERMANY", new Coach("Michael Skibbe", 10),
						Arrays.asList(new Player("Hans-J�rg Butt", 1, Arrays.asList(Position.GOALKEEPER)),
								new Player("Frank Baumann", 3, Arrays.asList(Position.DEFENDER, Position.MIDDLEFIELD)),
								new Player("Gerald Asamoah", 6, Arrays.asList(Position.FORWARD)),
								new Player("Lars Ricken", 12, Arrays.asList(Position.MIDDLEFIELD, Position.FORWARD)),
								new Player("Jens Lehmann", 1, Arrays.asList(Position.GOALKEEPER)))));

		List<Team> teams2 = Arrays.asList(new Team("FRANCE", new Coach("Didier Deschamps", 22),
				Arrays.asList(new Player("Hugo Lloris", 1, Arrays.asList(Position.GOALKEEPER)),
						new Player("Benjamin Pavard", 2, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
						new Player("Samuel Umtiti", 3, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
						new Player("Paul Pogban", 8, Arrays.asList(Position.MIDDLEFIELD, Position.FORWARD)),
						new Player("Corentin Tolisso", 12, Arrays.asList(Position.FORWARD)))),

				new Team("ITALY", new Coach("Roberto Mancini", 10),
						Arrays.asList(new Player("Salvatore Sirigu", 1, Arrays.asList(Position.GOALKEEPER)),
								new Player("Mattia De Sciglio", 2, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
								new Player("Gianluigi Donnarummah", 11, Arrays.asList(Position.GOALKEEPER)),
								new Player("Simone Zaza", 7, Arrays.asList(Position.MIDDLEFIELD, Position.FORWARD)),
								new Player("Mattia Perin", 12, Arrays.asList(Position.GOALKEEPER)))));

		List<Team> teams3 = Arrays.asList(new Team("SPAIN", new Coach("Fernando Hierro", 20),
				Arrays.asList(new Player("David de Gea", 1, Arrays.asList(Position.GOALKEEPER)),
						new Player("Nacho", 4, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
						new Player("Pepe Reina", 23, Arrays.asList(Position.GOALKEEPER)),
						new Player("Koke", 8, Arrays.asList(Position.MIDDLEFIELD)),
						new Player("Kepa Arrizabalaga", 13, Arrays.asList(Position.GOALKEEPER)))),

				new Team("NETHERLANDS", new Coach("Ronald Koeman", 18),
						Arrays.asList(new Player("Sergio Padt", 23, Arrays.asList(Position.GOALKEEPER)),
								new Player("Daley Blind", 5, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
								new Player("Stefan de Vrij", 4, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
								new Player("Tonny Vilhena", 21, Arrays.asList(Position.MIDDLEFIELD, Position.FORWARD)),
								new Player("Daryl Janmaat", 2, Arrays.asList(Position.DEFENDER, Position.FORWARD)))));

		List<Team> teams4 = Arrays.asList(new Team("Germany", new Coach("Joachim L�w", 20),
				Arrays.asList(new Player("Manuel Neuer", 1, Arrays.asList(Position.GOALKEEPER)),
						new Player("Marvin Plattenhardt", 2, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
						new Player("Sami Khedira", 6, Arrays.asList(Position.MIDDLEFIELD)),
						new Player("Julian Draxler", 7, Arrays.asList(Position.MIDDLEFIELD)),
						new Player("Toni Kroos", 8, Arrays.asList(Position.MIDDLEFIELD)))),

				new Team("Argentina", new Coach("Jorge Sampaoli", 20),
						Arrays.asList(new Player("Nahuel Guzm�n", 1, Arrays.asList(Position.GOALKEEPER)),
								new Player("Gabriel Mercado", 2, Arrays.asList(Position.DEFENDER, Position.FORWARD)),
								new Player("Willy Caballero", 23, Arrays.asList(Position.GOALKEEPER)),
								new Player("�ver Banega", 7, Arrays.asList(Position.MIDDLEFIELD)),
								new Player("Franco Armani", 12, Arrays.asList(Position.GOALKEEPER)))));

		WorldCup w1 = new WorldCup(2002, "South Korea&Japan", teams1);
		WorldCup w2 = new WorldCup(2006, "Germany", teams2);
		WorldCup w3 = new WorldCup(2010, "South Africa", teams3);
		WorldCup w4 = new WorldCup(2014, "Brazil", teams4);

		List<WorldCup> worldCups = Arrays.asList(w1, w2, w3, w4);
		int counter = findAllGoalKeepers(worldCups);
		System.out.println(counter);
		
	}

	
	//Return the total number of GoalKeepers which attends World cups after 2010 (including 2010)
	//Expected Result: 8
	public static int findAllGoalKeepers(List<WorldCup> worldcups) {
		//implement
		int counter = 0;
		for(WorldCup w : worldcups) {
		   if(w.getYear() >= 2010) {
              List<Team> team = w.getTeams();
		for( Team t : team ) {
			  List<Player> players = t.getPlayers();
		for(Player p :  players) {
			 List<Position> position = p.getPositions();
		for(Position pos : position) {
			if(pos.equals(Position.GOALKEEPER))
		          counter++;
				}
			}
		}
	}
		}
		return counter;
	}

}
