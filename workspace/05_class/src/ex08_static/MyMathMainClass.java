package ex08_static;

public class MyMathMainClass {

	public static void main(String[] args) {
		
		// 굳이 인스턴스, 객체 생성 없이 클래스를 호출할 수 있다
		System.out.println(MyMath.PI);
		System.out.println(MyMath.abs(-5));
		System.out.println(MyMath.pow(2, 3));

	}

}
