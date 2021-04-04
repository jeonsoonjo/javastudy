package ex03_generic;

public class MainClass {

	public static void main(String[] args) {
		
		Box<Fruit> box=new Box<Fruit>(10); // 과일을 10개 정도 담을 수 있는 Box

		box.addItem(new Fruit("사과", 1000));
		box.addItem(new Fruit("딸기", 5000));
		System.out.println(box);
		
	}

}
