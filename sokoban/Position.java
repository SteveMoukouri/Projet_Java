package sokoban;

public class Position {
	private final int x;
	private final int y;
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Position(Position clone){
		x = clone.x;
		y = clone.y;
	}
	
	public Position add(Direction a){
		return new Position(x+a.getX(), x+a.getY());
	}
	
	public Position sub(Direction b){
		return new Position(x-b.getX(), x-b.getY());
	}
	
	public boolean equals(Object obj){
		if(this == obj)return true;
		if(obj == null)return false;
		if(getClass() != obj.getClass())return false;
		Position other = (Position) obj;
		if(x != other.x)return false;
		if(y != other.y)return false;
		return true;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
