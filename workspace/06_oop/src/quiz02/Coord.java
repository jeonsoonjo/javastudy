package quiz02;

public class Coord {

	// field
	private int x;
	private int y;
	
	// constructor
	public Coord(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	// method
	public void info() {
		System.out.print("["+x+","+y+"]");
	}
	
}
