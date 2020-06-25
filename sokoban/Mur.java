package sokoban;

public class Mur extends Immobile{
	protected Mur() {
		super(Type.MUR);
	}

	@Override
	public boolean bougerVers(Direction vers) {
		return false;
	}
}
