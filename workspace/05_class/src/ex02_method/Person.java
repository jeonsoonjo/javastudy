package ex02_method;

/*
 	메소드(method)
 	1. 구성
 		1) 결과타입
 		2) 메소드명
 		3) 매개변수
 	2. 정의
 		결과타입 메소드명(매개변수){
 			메소드 본문
 		}
 */

public class Person {
	
	// field
	String name;
	int age;
	char gender;
	boolean isKorean;
	double height;
	double weight;
	
	// method(field를 사용할 수 있는 함수)
	// 1. 결과타입 : 결과값이 없다(void)
	// 2. 메소드명 : set
	// 3. 매개변수 : String n, int a, char g, boolean isK
	// 4. 역할 : 전달되는 인수로 필드에 전달한다
	void set(String n, int a, char g, boolean isK, double h, double w) {
		name = n;
		age = a;
		gender = g;
		isKorean = isK;
		height = h;
		weight = w;
	}
	
	// 1. 결과타입 : 결과값이 없다(void)
	// 2. 메소드명 : info
	// 3. 매개변수 : 전달되는 인수가 없다
	// 4. 역할 : 객체의 필드값을 출력해 준다
	void info() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age+"살");
		System.out.println("성별: "+gender);
		System.out.println(isKorean?"한국인":"외국인");
	}
	
	// 1. 결과타입 : 결과값의 타입이 double이다
	// 2. 메소드명 : getBMI
	// 3. 매개변수 : 전달되는 인수가 없다
	// 4. 역할 : 객체의 체질량지수(BMI)값을 결과로 반환한다
	double getBMI() {
		double bmi = weight/Math.pow(height/100, 2);
		return bmi; // getBMI를 호출하면 bmi가 나옴.
	}

}
