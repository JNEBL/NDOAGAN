package Setting;

public class World extends Domain{
	private Continet[] continets;

	public World(String name,int numContinets) {
		super(name);
		continets = new Continet[numContinets];
	}
}
