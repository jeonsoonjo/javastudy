package ex08_static;

public class MyMath {
	
	// private 생성자 -> MyMath 클래스 내부에서만 생성이 가능. 외부에서 new 생성 불가
	private MyMath() {}
	
	// 원주율(클래스 필드)
	public static final double PI=3.141592;
	
	// 절대값(클래스 메소드) -> 반환값이 있어야 한다
	public static double abs(double n) {
		return (n>=0)?n:-n;
	}
	
	// 제곱(클래스 메소드)
	public static double pow(double a, double b) { // a의 b제곱
		double result=1; // 곱셈에서 초기화가 0이 될 수 없다..
		for(int i=0; i<b; i++) { // b만큼 곱하기를 진행
			result*=a;
		}
		return result;
	}
}
