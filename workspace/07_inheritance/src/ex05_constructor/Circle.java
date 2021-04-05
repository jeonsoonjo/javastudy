package ex05_constructor;
// 자식
public class Circle extends Coord {
	
	// field
	private double radius;
	
	// constructor
	public Circle(int x, int y, double radius) {
		super(x,y); // Coord클래스의 생성자를 호출, 먼저 호출해야 한다
		this.radius=radius;
	}
	
	// method
	public void info() {
		System.out.println("중심좌표: ["+getX()+","+getY()+"]"); // Person의 필드가 private이라 사용 못 함
		System.out.println("반지름: "+radius);
	}
	
}
