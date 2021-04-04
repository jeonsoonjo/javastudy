package ex17_Object.ex04;

public class MainClass {

	public static void main(String[] args) {

		Product p1=new Product();
		Product p2=new Product();
		
		p1.setModel("CA-001");
		p1.setManufacturer("bio");
		p1.setDate("2021-03-01");
		
		p2.setModel("CA-001");
		p2.setManufacturer("bio");
		p2.setDate("2021-03-05");
		
		// 같은 종류의 제품(모델과 제조사가 같음)
		// 제품은 2개가 있다(독립적인 제품)
		
		// Object의 equals() 메소드는 객체의 데이터를 비교하지 않고,
		// 같은 주소에 저장된 객체인지 아닌지 비교한다
		if(p1.equals(p2)) {
			System.out.println("같은 종류의 제품입니다");
		} else {
			System.out.println("다른 종류의 제품입니다");
		} // 다른 종류의 제품입니다
		// 즉, 자바는 내용에는 관심이 없고 new로 생성된 객체로 판단한다
		
	}

}
