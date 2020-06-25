package sokoban;

import java.util.ArrayList;

public class Configuration {
	private ArrayList<Caisse> caisses;
	private Joueur joueur;
	private Niveau niveau;
	
	public Configuration(Niveau niveau, Position positionJoueur){
		caisses = new ArrayList<>();
		this.niveau = niveau;
		joueur = new Joueur(this, positionJoueur);
		System.out.println(toString());
	}
	
	public Configuration(Configuration config){
		caisses = config.caisses;
		this.niveau = config.getNiveau();
		this.joueur = config.getJoueur();
		System.out.println(toString());
	}
	
	public int getX(){
		return niveau.getX();
	}
	
	public int getY(){
		return niveau.getY();
	}
	
	public Niveau getNiveau(){
		return niveau;
	}
	
	public Joueur getJoueur(){
		return joueur;
	}
	
	public boolean addCaisse(Position a){
		caisses.add(new Caisse(this,a));
		return true;
	}
	
	public boolean estCible(Position a){
		return niveau.estCible(a);
	}
	
	public boolean estVide(Position a){
		return niveau.estVide(a);
	}
	
	public Element get(Position a){
		if(joueur.getPosition().equals(a))
			return joueur;
		for(int i=0; i<caisses.size(); i++){
			if(caisses.get(i).getPosition().equals(a))
				return caisses.get(i);
		}
		return niveau.get(a);
	}
	
	public boolean bougerJoueurVers(Direction a){
		joueur.addHisto(a);
		return joueur.bougerVers(a);
	}
	
	public boolean victoire(){
		for(int i=0; i<niveau.getCible().size(); i++){
			if(get(niveau.getCible().get(i)).getType() != Type.CAISSE)
				return false;
		}
		return true;
	}
	
	public String toString(){
		String retour = new String();
		for(int i=0; i<getX(); i++){
			for(int y=0; y<getY(); y++){
				Element element = get(new Position(i,y));
				if(element == null){
					retour = retour+"null";
					break;
				}
				if(element.getType() == Type.CASE){
					if(niveau.estCible(new Position(i,y)))
						retour = retour + ".";
					else
						retour = retour + "c";
				}
				if(element.getType() == Type.MUR){
					retour = retour + "#";
				}
				if(element.getType() == Type.JOUEUR){
					if(niveau.estCible(new Position(i,y)))
						retour = retour + "+";
					else
						retour = retour + "@";
				}
				if(element.getType() == Type.CAISSE){
					if(niveau.estCible(new Position(i,y)))
						retour = retour + "*";
					else
						retour = retour + "$";
				}
			}
			retour = retour+"\n";
		}
		return retour;
	}
}
