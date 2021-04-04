package ex06_access;

public class MainClass {

	public static void main(String[] args) {
		
		// 클래스에 생성자가 없는 경우
		// "default 생정자"가 자동으로 사용된다
		// public Person(){ }
		Person p = new Person();
		
		p.setName("david");
		p.setAge(25);
		p.setKorean(false);
		
		System.out.println("이름: "+p.getName());
		System.out.println("나이: "+p.getAge());
		System.out.println(p.isKorean()?"한국인":"외국인");

	}

}
