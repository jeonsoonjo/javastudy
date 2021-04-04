package ex11_abstract;

public class MainClass {

	public static void main(String[] args) {

		Staff staff=new SalaryMan("앨리스", 300);
		staff.info();
		
		// staff의 getPay()는 어떻게 호출 할 수 있을까?
		// staff.getPay();
		// 1. Staff클래스에 getPay()를 추가한다
		// 		-> 모든 Staff은 getPay()를 가져야 하므로 이 방법으로 해결한다
		// 2. SalaryMan클래스로 캐스팅한다
		// 3. 1번대로 해결하려했으나 페이가 얼마 인지 모른다... 즉 본문이 없다(모른다) => 추상메소드
		System.out.println(staff.getPay());
	}

}
