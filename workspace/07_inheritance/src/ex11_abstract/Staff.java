package ex11_abstract;

// 1. 추상메소드
// 	1) 본문이 없는 메소드이다
// 	2) 메소드를 정의할 때 abstract 키워드를 앞에 추가한다
//	3) 중괄호({})를 빼고 세미콜론(;)을 붙인다 => 문장이 끝났다는 의미

// 2. 추상클래스
//	1) 추상메소드가 1개 이상 포함된 클래스이다
//	2) 클래스 정의 앞에 abstract 키워드를 추가한다(추상메소드에 의해 추상클래스가 된 것)
//	3) public abstract class Staff

public abstract class Staff { // abstract public이라 해도 상관 없음

	// field
	private String name;
	
	// constructor
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	// method
	public void info() {
		System.out.println("직원명: "+name);
	}
	
	/*
		public int getPay() {
			return ??; // 반환할 수 있는 값이 없다
		}
	 */
	// 본문이 없는 getPay() 메소드를 만들면 된다 => 추상적 메소드
	public abstract int getPay(); // 중괄호 빼고 세미콜론으로 마무리, abstract public도 가능(순서 상관x)
		
}
