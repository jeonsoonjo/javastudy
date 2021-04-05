package ex17_Object.ex03;

import lombok.Data;

@Data
public class Dog {

	// field
	private String name;
	private int age;
	
	// constructor
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
