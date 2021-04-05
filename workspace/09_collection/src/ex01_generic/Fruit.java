package ex01_generic;

public class Fruit {

	// field
	private String name;
	private int price;

	// constructor
	public Fruit(String name, int price) {
		super();
		this.name = name;
	}

	@Override // source -> generate toString()
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
}
