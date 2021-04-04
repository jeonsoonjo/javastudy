package quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		// 계산기를 만들고
		// 4가지 연산을 모두 수행하고
		// 발생할 수 있는 예외를 예상해서 처리해라
		
		Calculator calculator=new Calculator();
		
		try {
			calculator.addition(10); // 10
			calculator.subtraction(5); // 5
			calculator.multiplication(2); // 10
			calculator.division(0);
		} catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다");
		}
		
		// java 연산의 특징
		// 10/0 : Exception
		// 10.0/0.0 : Infinity(무한대)

	}

}
