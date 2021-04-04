package ex04_generic;

public class MainClass {

	public static void main(String[] args) {

		Integer[] a= {1,2,3};
		Double[] b= {1.5,2.5,3.5};
		String[] s= {"hello","hi","hahaha"}; // 오류를 확인하기 위한 목적으로 생성
		
		Calculator calc=new Calculator();
		System.out.println(calc.getTotal(a));
		// System.out.println(calc.getTotal(s)); // String->Num타입으로 캐스팅하려다가 예외발생 했다
		
		System.out.println(calc.getTotal2(b));
		// System.out.println(calc.getTotal2(s)); // 아예 실행이 안 됨, T extends Number 때문이다, String은 전달 자체가 안 된다
	
	}

}
