package quiz01;

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
	public void division(int a) {
		result/=a;
		System.out.println("현재 저장된 값: "+result);
	}
	
}
