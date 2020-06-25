package sokoban;

import java.util.ArrayList;

public class Niveau {
	private Immobile grille[][];
	private ArrayList<Position> cible;
	private int x;
	private int y;
	
	public Niveau(int x, int y){
		cible = new ArrayList<>();
		this.x = x;
		this.y = y;
		grille = new Immobile[x][y];
		for(int a=0; a<x; a++){
			for(int b=0; b<y; b++){
				grille[a][b] = new Case();
			}
		}
		/*for(int a=0; a<y; a++){
			addMur(new Position(0, a));
			addMur(new Position(x-1,a));
		}
		for(int b=0; b<x; b++){
			addMur(new Position(b,0));
			addMur(new Position(b,y-1));
		}*/
	}

	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public boolean addCible(Position a){
		if(estCible(a) || !estVide(a))
			return false;
		cible.add(a);
		return true;
	}
	
	public boolean addMur(Position a){
		if(estVide(a)){
			grille[a.getX()][a.getY()] = new Mur();
			return true;
		}
		return false;
	}
	
	public boolean estCible(Position a){
		for(int i=0; i<cible.size(); i++){
			if(a.equals(cible.get(i)))
				return true;
		}
		return false;
	}
	
	public boolean estVide(Position a){
		if(get(a) == null || get(a).getType() != Type.MUR)
			return true;
		return false;
	}
	
	public Element get(Position a){
		//if(grille[a.getX()][a.getY()] == null)
		//	return new Case();
		return grille[a.getX()][a.getY()];
	}
	
	public ArrayList<Position> getCible(){
		return cible;
	}
	
}
