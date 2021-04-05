package ex05_constructor;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("alice", 30, '여'); // 생성자 호출했기 때문에 인수를 적어야 한다
		p.info();
		
	}

}
