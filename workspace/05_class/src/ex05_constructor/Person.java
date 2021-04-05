package ex05_constructor;

/*
 	생성자(constructor)
 	1. 객체를 생성하는 메소드이다
 	2. 특징
 		1) 결과타입 : 존재하지 않음, 아예 작성하지 않음(void X)
 		2) 메소드명 : 클래스명과 같아야 한다(다른 이름 X)
 		3) 매개변수 : 일반 메소드처럼 사용한다. 인수가 있으면 선언, 없으면 생략
	3. 호출시점 : 객체 생성하기 위해 new 호출(이 때만 호출)
*/

/*
 	객체 생성								생성자
 	Person p = new Person()				Person() {...}
 	Person p = new Person("james")		Person(String name) {...}
 	Person p = new Person("ali", 20)	Person(String name, int age) {...}
 	
*/
public class Person {

	// field
	String name;
	int age;
	char gender;
	
	// constructor (필드 끝나고 나서 만들어 줌)
	Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	Person(String name){
		this.name = name;
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	Person(){
	
	}
	
	void info() {
		String str = "이름: "+name+", 나이: "+age+", 성별: "+gender;
		System.out.println(str);
	}
	
}
