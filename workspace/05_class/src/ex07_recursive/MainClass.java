package ex07_recursive;

public class MainClass {

	public static void main(String[] args) {
		
		// say
		SayHello sh = new SayHello();
		sh.say(5);
		
		// adder
		Adder adder = new Adder();
		adder.calculate(10); // 1~10까지 합계를 구해서 보여준다
		System.out.println(adder.getTotal());
	
		// calculator
		Calculator calc = new Calculator();
		int n=5;
		System.out.println(n+"! = "+calc.getFactorial(n));
	
	}

}
