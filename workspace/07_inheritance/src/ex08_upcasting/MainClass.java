package ex08_upcasting;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv=new Tv(200, "LG-75");
		tv.info(); // Tv클래스의 info 호출
		
		Elec elec=tv; // Tv 타입의 객체를 Elec 타입으로 변경
					  // 서브->슈퍼 타입으로 변경하는 것으로 'upcasting'이라고 한다
					  // upcasting은 별도 casting 문법을 사용하지 않는다
		
		elec.info(); // elec클래스의 info 호출
		// 출력결과
		// Tv모델명: LG-75
		// 소비전력: 200w
		// Tv모델명: LG-75
		// 소비전력: 200w
		// tv와 elec의 info가 똑같이 나온다
		
		// 메소드의 호출
		// 1. 객체의 타입에 따라 결정된다
		//    호출할 메소드를 결정하는 것을 "바인딩"이라고 한다
		// 2. 자바는 "동적바인딩"이다
		//    1) 메소드 호출 시점(실행 전)에는 객체의 타입을 본다
		//	     Elec elec = tv; 이므로 elec.info()는 Elec의 info()이다
		// 	  2) 실행 전에 실제 객체를 확인(객체 타입 말고 객체)
		//		 Tv tv=new Tv(200,"LG-75"); 이므로 tv객체가 Tv타입이라는 것을 확인한다
		// 	  3) 실제 객체의 타입으로 바꿔서 호출하고 실행한다
		//	     elec.info()가 실행될때는 Tv.info()가 호출된다
		
		// 한 번에 모아서 실행한다
		Elec elec2=new Tv(300,"Samsung-85");
		elec2.info();
		
	}

}
