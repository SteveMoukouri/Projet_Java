package sokoban;

public enum Type {
	MUR("Mur", "C'est un mur"),
	CASE("Case", "C'est une case vide"),
	CAISSE("Caisse", "C'est une caisse"),
	JOUEUR("Joueur", "C'est un joueur");
	
	private String name = "";
	private String phrase = "";
	
	Type(String name, String phrase){
		this.name = name;
		this.phrase = phrase;
	}
	
	public void getPhrase(){
		System.out.println(phrase);
	}
	
	public String toString(){
		return name;
	}
}
