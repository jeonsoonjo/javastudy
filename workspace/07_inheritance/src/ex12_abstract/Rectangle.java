package ex12_abstract;

public class Rectangle extends Shape {

	// field
	private int width;
	private int height;
	
	// constructor
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// method
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override // 추상메소드를 상속받았기 때문에
	public double getArea() {
		return width*height;
	}

}
