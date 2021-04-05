package ex01_exception;

// Exception(예외)
// 1. 개발자가 회피할 수 있는 수준의 오류이다
//	    심각한 수준의 오류는 Error이다
// 2. 모든 예외는 Exception 클래스를 상속 받는 클래스이다

public class MainClass {

	public static void main(String[] args) {
		
		// System.out.println(2/0); ArithmeticException(산술연산에 대한 오류)
		// Integer.parseInt(""); NumberFormatException(숫자인식 오류)
		// String name=null; name.equals("james"); NullPointerException(널 값 오류)
		// int[] a=new int[3]; a[30]=10; ArrayIndexOutofBoundsException(인덱스 범위 오류)

	}

}
