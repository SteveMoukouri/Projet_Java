package sokoban;

import java.util.ArrayList;

public class Direction {
	public static final Direction GAUCHE = new Direction(-1,0);
	public static final Direction DROITE = new Direction(1,0); 
	public static final Direction HAUT = new Direction(0,-1);
	public static final Direction BAS = new Direction(0,1);
	private ArrayList<Direction> DIRECTIONS;
	private int dx;
	private int dy;
	
	public Direction(int dx, int dy){
		DIRECTIONS = new ArrayList<>();
		this.dx = dx;
		this.dy = dy;
	}

	public ArrayList<Direction> getDirections(){
		DIRECTIONS.add(GAUCHE);
		DIRECTIONS.add(DROITE);
		DIRECTIONS.add(HAUT);
		DIRECTIONS.add(BAS);
		return DIRECTIONS;
	}
	
	public int getX(){
		return dx;
	}
	
	public int getY(){
		return dy;
	}
}
