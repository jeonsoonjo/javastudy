package ex13_interface;

// interface는 본문이 없는 추상메소드만 가지고 있다
// 해당 추상메소드를 반드시 override 해야 한다
// 클래스를 상속 받을 때는 extends를 사용하고,
// 인터페이스를 구현할 때는 implements를 사용한다
// 클래스 상속받는다 == 인터페이스를 구현한다(같은 개념이다)

public class Rectangle implements Shape {

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
