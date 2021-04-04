package quiz01;

// sup:Weapon(내용이 없는 클래스)
// sub:Gun
// 실행 예시
// 콜트 1발 쐈다
// 콜트 2발 쐈다
// 베레타 1발 쐈다
// ...(어떤 순서로 나올 지 모름)
// 변경이 필요하면 알아서 변경한다

public class MainClass {

	public static void main(String[] args) {
		
		Thread gun1=new Thread(new Gun("베레타", 10));
		Thread gun2=new Thread(new Gun("콜트", 10));
		
		gun1.start(); // Thread를 사용하지 않는다면 gun1 10발 다 쏘고 나서 gun2 10발을 쏜다,
		gun2.start(); // 순서가 상관없이 나오는 Thread가 필요
		
	}

}
