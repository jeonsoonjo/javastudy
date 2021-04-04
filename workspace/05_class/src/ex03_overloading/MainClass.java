package ex03_overloading;

public class MainClass {

	public static void main(String[] args) {
		
		// 같은 이름을 호출할 때, set을 2개를 두면 된다
		// 직사각형 만들기
		Rectangle nemo1 = new Rectangle();
		nemo1.set(3,4); // 너비3, 높이4
		System.out.println("넓이: "+nemo1.getArea());
		
		// 정사각형 만들기
		Rectangle nemo2 = new Rectangle();
		nemo2.set(3); // nemo2.set(3,3); 과 같은 의미
		System.out.println("넓이: "+nemo2.getArea());
		
	}

}
