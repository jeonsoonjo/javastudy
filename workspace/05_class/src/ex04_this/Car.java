package ex04_this;

/*
 	this
 	1. this는 객체 자신을 의미한다
 	2. 어떤 클래스 내부에서만 사용한다
 	3. 활용
 		1) this.필드 (가장 주된 활용) 
 		2) this() -> 다른 생성자를 호출하는 것을 의미한다
 */

public class Car {

	// field
	String model;
	String manufacturer;
	int price;
	
	// method
	void set(String model, String manufacturer, int price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	} // 필드에 있는 이름과 메소드에 있는 매개변수 명이 같을 때
	  // 필드에 this. 넣어서 충돌되지 않도록 구분한다(필드에 주로 사용함)
	
	void info() {
		System.out.println("모델명: "+model);
		System.out.println("제조사: "+manufacturer);
		System.out.println("가격: "+price+"만원");
	}
	
}
