package ex08_upcasting;
// sub
public class Tv extends Elec {
	
	// field
	private String model;
	
	// constructor
	public Tv(int watt, String model) {
		super(watt);
		this.model = model;
	}
	
	// method
	@Override
	public void info() {
		System.out.println("Tv모델명: "+model);
		super.info(); // Elec이 가지고 있는 정보(소비전력)
	}
	
}
