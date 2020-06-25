package sokoban;

public class Case extends Immobile{
	public Case() {
		super(Type.CASE);
	}

	@Override
	public boolean bougerVers(Direction vers) {
		return true;
	}
}
