package ex01_user_type;

public class MainClass {

	public static void main(String[] args) {
		
		// 클래서 Person을 타입으로 하는 "객체"를 생성
		
			/*
			 	1. 타입: Person
			 	2. 객체: p1
			*/
		
		Person p1 = new Person();
		
		p1.name = "soonjo";
		p1.age = 34;
		p1.height = 158;
		p1.isKorean = true;

		// 클래스에 포함된 멤버(필드, 메소드)는 마침표(.)를 이용해 호출
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.isKorean);
	
	}

}
