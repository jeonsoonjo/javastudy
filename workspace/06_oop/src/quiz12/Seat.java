package quiz12;

public class Seat {

	// field
	private String name;

	// constructor
	
	
	// method
	// 1.get -> 예매자 이름 확인
	public String getName() {
		return name;
	}
	
	// 2.set -> 예매할 때(예매자 이름 저장)
	public void setName(String name) {
		this.name = name;
	}
	
	// 3.예매 취소
	public void cancel() {
		this.name=null; // 취소하면 빈 좌석으로 만든다
	}
	
	// 4.예매 여부 확인
	// 1) 예매가 된 좌석 : false(예매 불가)
	// 2) 예매가 안 된 좌석 : true
	public boolean check() {
		return (name==null); // null 이면 true가 반환됨
	}
	
	// 5.좌석 확인
	public void info() {
		if(name==null) {
			System.out.print("가능");
		} else {
			System.out.print(name.charAt(0)+"*"+(name.length()>2?name.charAt(name.length()-1):"")); // 전*조
		}
	}
	
}
