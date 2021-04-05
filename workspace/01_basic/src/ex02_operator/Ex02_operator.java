package ex02_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		
		// 4. 관계 연산자: >, >=, <, <=, ==, !=
		// 결과의 타입은 boolean입니다.		
		int age = 21;
		Boolean isAdult = age >= 20;
		System.out.println(isAdult);  // true 또는 false
				
		// 5. 논리 연산자: &&, ||, !
		// 대부분 관계 연산자와 함께 사용됩니다.
		// 1) && : 모든 관계 연산의 결과가 true이면 true, 아니면 false
		// 2) || : 관계 연산의 결과가 하나라도 true이면 true, 아니면 false
		// 3) !  : 관계 연산의 결과를 반대로 변경
		int a = 10;
		int b = 10;
		System.out.println(a == 10 && b == 10);  // 둘 다 10이므로 true
		System.out.println(a == 10 || b == 10);  // 하나라도 만족하면 true(둘 다 만족해도 true)
		System.out.println(!(a == 10));  // false
		
		System.out.println(a == 0 && ++b > 0);  // false (&& 연산은 false가 나오면 연산을 멈춥니다. 어차피 false이니까)
		System.out.println(a);  // 10
		System.out.println(b);  // 10
				
		System.out.println(a == 10 || ++b > 0);  // true (|| 연산은 true가 나오면 연산을 멈춥니다. 어차피 true이니까)
		System.out.println(a);  // 10
		System.out.println(b);  // 10

	}

}
