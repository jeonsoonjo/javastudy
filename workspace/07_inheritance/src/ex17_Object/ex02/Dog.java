package ex17_Object.ex02;

public class Dog {

	// field
	private String name;

	// constructor
	public Dog(String name) {
		super(); //  Object의 생성자호출(생략가능)
		this.name = name;
	}
	
	// method
	// Object클래스의 toString()을 사용하지 않기 위해
	// toString()메소드를 override 한다
	// source -> override 자동완성
	@Override
	public String toString() {
		return "[name: "+name+"]";
	}
	
}
