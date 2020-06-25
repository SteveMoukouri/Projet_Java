package sokoban;

public abstract class Mobile extends Element{
	protected Configuration config;
	protected Position position;
	
	protected Mobile(Type type, Configuration c, Position p) {
		super(type);
		config = c;
		position = p;
	}
	
	public boolean setPosition(Position a){
		if(type == Type.CAISSE){
			if(config.get(a).getType() == Type.CASE){
				position = new Position(a);
				return true;
			}
			return false;
		}
		if(type == Type.JOUEUR){
			if(config.get(a).getType() == Type.CASE){
				position = new Position(a);
				return true;
			}
			if(config.get(a).getType() == Type.CAISSE){
				Joueur actu = (Joueur)this;
				Mobile obj = (Mobile)config.get(a);
				if(obj.setPosition(a.add(actu.getHisto().get(actu.getHisto().size()-1)))){
					position = new Position(a);
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
	public Position getPosition(){
		return position;
	}
}
