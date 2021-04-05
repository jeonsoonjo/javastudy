package ex01_is_a;

// Student가 eat()을 사용하고자 한다
/*
	상속(inheritance)
	1. 어떤 클래스가 다른 클래스의 기능을 확장하는 것을 의미한다
	2. 상속이 가능한 대표적인 클래스들의 관계는 is -a 관계이다
	3. is -a
		Person is a Student. 사람은 학생이다(X)
		Student is a Person. 학생은 사람이다(O) ==> is -a 관계가 성립한다
	4. Student는 Person의 기능(method)을 확장할 수 있다. 즉, 가져다 사용할 수 있다
 */

/*
	슈퍼클래스와 서브클래스
	1. 슈퍼클래스 : 부모클래스라고도 한다. 메소드를 다른 클래스에게 제공하는 클래스
	2. 서브클래스 : 자식클래스라고도 한다. 다른 클래스의 메소드를 제공받는 클래스
	3. 형식
		class 슈퍼클래스 {}
		class 서브클래스 extends 슈퍼클래스 {}
*/

public class MainClass {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.eat();
		
		Student s=new Student();
		s.study();
		s.eat();
		
	}

}
