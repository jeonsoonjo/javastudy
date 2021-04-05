package ex12_abstract;

public class Square extends Rectangle {

	// field
	
	
	// constructor
	public Square(int width) { // 정사각형 이기에 너비만 알아도 높이를 알 수 있음
		super(width, width);
	}
	
	// method
	// Rectangle의 메소드는 이미 사용할 수 있다
	// getter, setter, getArea 이미 사용할 수 있다
	// 굳이 메소드를 선언할 필요가 없다(슈퍼클래스를 누구를 잡느냐도 중요하다!)

}
