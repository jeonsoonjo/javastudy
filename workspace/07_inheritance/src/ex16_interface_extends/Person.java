package ex16_interface_extends;

public class Person {

	// method
	// 1. pet에게 food주기
	public void feed(Pet pet, String food) {
		pet.feed(food);
	}
	
	// 2. pet과 산책하기
	public void walking(Walkable pet) { // snake 전달 자체를 막기 위해, walkable에 있는 dog만 호출
		System.out.println("Walking with "+((Pet)pet).getName()); // downcasting
	}
	
}
