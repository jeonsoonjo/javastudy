package quiz05;

public class Bunker {

	// field
	private Terran[] terrans;
	private int idx;
	
	public Bunker() {
		terrans=new Terran[10];
	}
	
	// method
	public void add(Bunkable terran) {
		if(idx<terrans.length) {
			terrans[idx++]=(Terran)terran; // downcasting
		}
	}
	
}
