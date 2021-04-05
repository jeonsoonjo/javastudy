package ex17_Object.ex03;

public class MainClass {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
		// lombok으로 추가한 Setter
		dog.setName("댕댕이");
		dog.setAge(5);
		
		// lombok으로 추가한 Getter
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		
		// lombok으로 추가한 toString
		System.out.println(dog);
		
	}

}
