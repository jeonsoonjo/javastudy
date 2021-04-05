package ex04_constructor;

// 슈퍼클래스

public class Person {

	// field
	private String name;
	
	// constructor
	public Person(String name) {
		this.name=name;
	}
	
	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
