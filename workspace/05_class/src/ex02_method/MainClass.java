package ex02_method;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.set("alice", 30, '여', false, 158, 53); // 인수가 6개
			/*
				System.out.println(p.name);
				System.out.println(p.age);
				System.out.println(p.gender);
				System.out.println(p.isKorean);
			*/
		
		p.info(); // 인수가 0개
		
		double bmi = p.getBMI();
		System.out.println(bmi);
	}

}
