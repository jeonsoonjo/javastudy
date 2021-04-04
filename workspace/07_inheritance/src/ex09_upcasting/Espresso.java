package ex09_upcasting;
// sub
public class Espresso extends Coffee {

	// field
	private int water;

	// constructor
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	// method
	@Override
	public void info() {
		super.info(); // coffee의 info
		System.out.println("물의 양: "+water+"ml");
	}
	@Override
	public void taste() {
		System.out.println("에스프레소는 맛이 진하다");
	}

}
