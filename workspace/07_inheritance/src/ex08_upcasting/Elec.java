package ex08_upcasting;
// super
public class Elec { // 전자제품

	// field
	private int watt; // 소비전력

	// constructor
	public Elec(int watt) {
		super();
		this.watt = watt;
	}
	
	// method
	public void info() {
		System.out.println("소비전력: "+watt+"w");
	}
	
}
