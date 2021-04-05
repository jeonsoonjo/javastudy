package ex01_variable;

public class Ex03_primitive_type {

	public static void main(String[] args) {
		
		// 1. 정수 타입
		// 1-1. byte
		// 크기 1바이트, 단독 사용은 아니고 배열로 사용
		System.out.println(Byte.MAX_VALUE);  // 127
		System.out.println(Byte.MIN_VALUE);  // -128
		System.out.println(Byte.SIZE);  // 8 (단위: 비트)
			
		// 비트에 의한 값의 범위
		// 8비트 : -2의 7제곱 ~ 2의 7제곱 - 1
		// n비트 : -2의 (n-1)제곱 ~ 2의 (n-1)제곱 - 1
			
		// 2. short 타입
		// 학습할 필요가 없음
				
		// 3. int 타입
		// 크기 4바이트, 일반적인 기본 정수 자료형
		System.out.println(Integer.MAX_VALUE);  // 2147483647
		System.out.println(Integer.MIN_VALUE);  // -2147483648
		System.out.println(Integer.SIZE);  // 32 (32비트)
				
		// 4. long 타입
		// 크기 8바이트, int보다 큰 정수 자료형
		System.out.println(Long.MAX_VALUE);  // 9223372036854775807
		System.out.println(Long.MIN_VALUE);  // -9223372036854775808
		System.out.println(Long.SIZE);  // 64
				
		// 5. 실수 타입		
		// 5-1. float 타입
		// 크기: 4바이트, 과거 호환용
				
		// 5-2. double 타입
		// 크기: 8바이트, 일반적인 실수 자료형
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(Double.MIN_EXPONENT);
		System.out.println(Double.SIZE);
		
		// 부호, 소수부, 지수부
		// 항상 소수 자리수는 부정확할 수 있다.(BigDecimal 클래스를 이용해서 정확히 표현할 수 있다.)
						
		// 6. 문자 타입
		// 6-1. char 타입
		// 크기 2바이트, 유니코드 기반(국제 표준 코드)
		System.out.println(Character.SIZE);  // 16비트
		
		// 7. 논리 타입
		// 7-1. boolean 타입
		// 크기: 이론상으로는 1비트(참, 거짓만 표현하면 되므로)
		// true, false
		
		// 8. 변수 선언
		int a = 10;
		long b = 12345678900L;
		char c = 'a';
		float f = 1.5F;
		double d = 1.5;
		boolean e = true;
				
		// primitive type은 변수에 데이터가 그대로 저장됩니다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

}
