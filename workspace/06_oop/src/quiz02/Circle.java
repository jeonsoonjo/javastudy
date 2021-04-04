package quiz02;

public class Circle {

	// field
	private Coord center;
	private double radius;
	
	// constructor
	public Circle(Coord center, double radius) {
		this.center=center;
		this.radius=radius;
	}
	public Circle(int x, int y, double radius) {
		this.center=new Coord(x,y); // won2 의 내용
		this.radius=radius;
	}
	
	// method
	public double getArea() {
		return Math.PI * Math.pow(radius, 2); // 넓이 구함
	}
	public void info() {
		System.out.print("중심좌표: ");
		center.info();
		
		System.out.println(", 반지름: "+radius+", 넓이: "+getArea());
	}
	
}
