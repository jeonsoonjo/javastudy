package ex05_throw;

public class Calculator {

	// field
	private int result;
	
	// constructor
	
	
	// method
	public void addition(int a) {
		result+=a;
		System.out.println("현재 저장된 값: "+result);
	}
	public void subtraction(int a) {
		result-=a;
		System.out.println("현재 저장된 값: "+result);
	}
	public void multiplication(int a) {
		result*=a;
		System.out.println("현재 저장된 값: "+result);
	}
	public void division(int a) throws ArithmeticException { // 2. division 메소드가 어떤 예외를 던지는지 명시한다
		if(a==0) {
			throw new ArithmeticException(); // 1. 예외를 직접 던진다
		}
		result/=a;
		System.out.println("현재 저장된 값: "+result);
	}
	
}
