package sokoban;

public class Caisse extends Mobile{
	protected Caisse(Configuration c, Position p) {
		super(Type.CAISSE, c, p);
	}

	@Override
	public boolean bougerVers(Direction vers) {
		return setPosition(getPosition().add(vers));
	}
}
