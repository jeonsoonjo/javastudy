package ex03_has_a;

// has -a 관계도 상속으로 처리할 수 있다
// Circle has a Coord(원은 점을 가지고(포함)있다)
// Coord 슈퍼클래스, Circle 서브클래스로 지정한다


public class MainClass {

	public static void main(String[] args) {
		
		// 서브클래스인 Circle의 객체가 
		// 정상적으로 생성되는지 확인한다
		Circle c=new Circle();
		c.setCircle(1, 1, 1.5);
		c.circleInfo();

	}

}
