package ex14_interface;

public class Monkey implements Animal {

	@Override
	public void move() {
		System.out.println("원숭이가 나무를 탄다");
	}

}
