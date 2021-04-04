package ex02_try_catch;

/*
	try{
		코드작성
		예외발생가능구역
	} catch(예외처리 매개변수) {
		예외처리구역
	}
*/

public class MainClass {

	public static void main(String[] args) {
		
		int a=0;
		
		try {
			// System.out.println(2/0);
			Integer.parseInt("1.5");
			a=10;
		} catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다");
		} catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다2");
		}
		System.out.println(a); // 0, 초기값이 나온다. 
		// 예외가 발생하면 try문은 바로 종료된다. 다음 코드가 실행 되지 않음
		// catch를 여러개 사용할 수 있다. 순서대로 매개변수를 확인하고 해당하는 예외처리를 한다
		
		try {
			// String name=null;
			// name.equals("james");
			int[] b=new int[3];
			b[10]=10;
		} catch(Exception e) { // Exception은 모든 예외클래스들의 슈퍼클래스이다
			System.out.println("예외가 발생했습니다3");
		}
		
	}

}
