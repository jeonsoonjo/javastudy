package ex02_String;

// String의 +연산자를 많이 사용하면 성능이 떨어짐, 속도가 많이 느려짐
// 메모리를 과하게 낭비한다
// 그래서 문자열 추가 메소드도 알아놔야 함

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		// java.lang.StringBuilder
		
		// 문자열 생성
		StringBuilder sb = new StringBuilder("Hello");
		
		// 문자열 추가(핵심 메소드)
		sb.append(" ").append("java"); // 계속 가능
		System.out.println(sb);
		
		// 문자열 비교, 비교할때는 string으로 변환해야 함
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		System.out.println(sb1.equals(sb2)); // false, string이 아니라 안 됨, stringbuilder임

		// 문자열로 변환 toString() 메소드
		String str1=sb1.toString();
		String str2=sb2.toString();
		System.out.println(str1.equals(str2)); // true
		
	}

}
