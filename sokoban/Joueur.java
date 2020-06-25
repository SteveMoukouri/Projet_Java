package sokoban;

import java.util.ArrayList;

public class Joueur extends Mobile {
	protected ArrayList<Direction> histo;
	
	public Joueur(Configuration c, Position p) {
		super(Type.JOUEUR, c, p);
	}
	
	public Joueur(Configuration c, Joueur clone){
		this(c, clone.position);
	}

	public ArrayList<Direction> getHisto(){
		return histo;
	}
	
	public void addHisto(Direction vers){
		histo.add(vers);
	}
	
	public int getNbCoups(){
		return histo.size();
	}

	@Override
	public boolean bougerVers(Direction vers) {
		return setPosition(getPosition().add(vers));
	}
}
