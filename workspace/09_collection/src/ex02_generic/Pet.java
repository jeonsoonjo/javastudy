package ex02_generic;

public class Pet {
	
	// field
	private String name;
	private int age;

	// constructor
	public Pet(String name, int age) {
		this.name = name;
		this.age=age;
	}

	// method
	@Override
	public String toString() {
		return "["+name+", "+age+"]";
	}
	
}
