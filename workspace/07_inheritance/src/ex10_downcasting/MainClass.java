package ex10_downcasting;

public class MainClass {

	public static void main(String[] args) {
		
		// upcastion
		// Person p=new Student();
		// Person p=new Worker();
		// p.eat / p.sleep만 호출 가능
		// p.study는 에러 발생
		// Person에도 study를 넣으면 해결 -> override

		Person p1=new Student();
		p1.eat();
		p1.sleep();
		// p1.study(); // Person p만 보고 호출할 메소드를 결정하기 때문에 불가능하다(오버라이드 하면 해결 됨)
		
		// Person타입의 p1을 Student타입으로 변경하면 해결된다(오버라이드 말고!!)
		// 1. (Student)p1 => p1을 Student타입으로 바꿔준다(downcasting)
		//	   person에서 student로 내려갔으니? 다운캐스팅이라 함
		// 2. (Student)p1.study() : 정상 동작하지 않는다
		// 	     연산자 최우선 순위가 마침표(.)이므로 p1.study()가 먼저 호출되기 때문이다
		// 3. ((Student)p1).study() : 캐스팅을 먼저 처리하고 study호출이 가능하다
		Person p2=new Worker();
		p2.eat();
		p2.sleep();
		((Worker)p2).work();

		
		// 실수해보기
		// Person p3=new Student();
		// p3.eat();
		// p3.sleep();
		// ((Worker)p3).work();
		// 같은 클래스끼리 casting은 안 됨, 에러
		
		// 타입을 확인한 뒤 casting 해야 한다
		// p3가 Student이면 Student로 캐스팅하고
		// p3가 Worker이면 Worker로 캐스팅해라
		Person p3=new Student();
		p3.eat();
		p3.sleep();
		if(p3 instanceof Student) { // p3가 Student의 객체이면
			((Student)p3).study();
		} else if(p3 instanceof Worker) {
			((Worker)p3).work();
		}
		
	}

}
