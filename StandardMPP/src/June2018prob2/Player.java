package June2018prob2;

import java.util.List;

public class Player  extends Person{
    private int number;
    private  List<Position> positions;
	public Player(String name,  int number,List<Position> positions ) {
		super(name);
		this.number = number;
		this.positions = positions;
		
	}
	public List<Position> getPositions() {
		return positions;
	}



}
