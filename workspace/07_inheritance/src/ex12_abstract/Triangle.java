package ex12_abstract;

public class Triangle extends Shape {

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
