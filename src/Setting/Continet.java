package Setting;

public class Continet extends Domain{
	private Nation[] nations;

	public Continet(String name,int numNation) {
		super(name);
		nations = new Nation[numNation];
	}
	
	
}
