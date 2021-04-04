package ex07_override;
// super
public class Pizza {

	// field
	private String dough;
	private int cheese; // 치즈 양
	
	// constructor -> using field
	public Pizza(String dough, int cheese) {
		// super();
		this.dough = dough;
		this.cheese = cheese;
	}
	
	// method
	public void info() {
		System.out.println(dough+"("+cheese+")");
	}
	
}
