package ex09_upcasting;

public class MainClass {

	public static void main(String[] args) {
		
		// upcasting이 없는 경우
		// 타입이 다르다 : 커피마다 커피를 담는 컵이 다르다고 생각. 즉 모양이 다르다
		Espresso espresso=new Espresso("콜롬비아",30);
		Latte latte=new Latte("인도네시아",30,150);
		espresso.info();
		espresso.taste();
		latte.info();
		latte.taste();

		System.out.println("--------------------");
		
		// upcasting이 사용한 경우
		// 타입이 같다 : 모든 커피를 같은 컵에 담는다. 즉 모양은 다르지만 컵이다. 내용물만 다르다
		Coffee coffee1=new Espresso("콜롬비아",30);
		Coffee coffee2=new Latte("인도네시아",30,150);
		coffee1.info();
		coffee1.taste();
		coffee2.info();
		coffee2.taste();
		
		// 결과는 같다
		// upcasting이 사용하기 편하다
	}

}
