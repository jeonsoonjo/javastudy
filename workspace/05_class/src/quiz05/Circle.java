package quiz05;

public class Circle {

	// field
	double radius;
	
	// method
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getCircum() {
		return 2 * Math.PI * radius;
	}
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
