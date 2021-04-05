package quiz02;

public class MainCalss {

	public static void main(String[] args) {
		
		Calculator calc; // 객체는 없고, 참조 변수만 있는 상태
		
		// 객체를 만드는 명령은 "new"이다
		
		calc = new Calculator(); // 객체가 생성되고 그 참조값이 calc에 전달된다 -> 객체 생성
								 // 객체 생성 시점을 "인스턴스화" 되었다고 한다
		calc.addition(1, 2);

		int a = 5;
		int b = 10;
		if(a>=b) {
			System.out.println(a+"-"+b+"="+calc.subtraction(a, b));
		} else {
			System.out.println(b+"-"+a+"="+calc.subtraction(a, b));
		}

	}

}
