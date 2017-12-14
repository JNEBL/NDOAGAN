package Setting;

public class Universe extends Domain{
	private World[] worlds;
	
	public Universe(int numWorlds) {
		super("Galaxy");
		worlds = new World[numWorlds];
	}
	
	
}
