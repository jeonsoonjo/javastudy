package ex13_interface;

public class Triangle implements Shape {

	// field
	private int width;
	private int height;
	
	// constructor
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// method
	@Override
	public double getArea() {
		return width*height*0.5;
	}

}
