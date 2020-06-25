package sokoban;

public abstract class Element {
	protected Type type;
	
	protected Element(Type type){
		this.type = type;
	}
	
	public abstract boolean bougerVers(Direction vers);
	
	public Type getType(){
		return type;
	}
}
