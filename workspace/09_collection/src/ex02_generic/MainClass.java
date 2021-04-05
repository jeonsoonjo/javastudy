package ex02_generic;

public class MainClass {

	public static void main(String[] args) {
		
		Box<String, Integer> box1=new Box<String, Integer>();
		
		box1.setItem1("james"); // String만 가능
		box1.setItem2(90); // Integer만 가능
		
		System.out.println(box1.getItem1()+", "+box1.getItem2());
		
		Box<String, Pet> box2=new Box<>();
		box2.setItem1("alice");
		box2.setItem2(new Pet("댕댕이", 2)); // toString 작업이 필요하다
		System.out.println(box2.getItem1()+", "+box2.getItem2());
		
	}

}
