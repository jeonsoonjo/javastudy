package ex07_override;
// sub
public class GogumaPizza extends Pizza {

	// field
	private String goguma;

	// constructor -> 슈퍼클래스로부터 생성
	public GogumaPizza(String dough, int cheese, String goguma) {
		super(dough, cheese);
		this.goguma = goguma; // 슈퍼클래스에는 고구마가 없음, 직접 생성
	}
	
	// method
	// 피자의 정보를 사용할 수 있지만 핵심인 고구마 정보가 없기에 메소드를 다시 만들어야 한다 -> 오버라이드
	@Override
	public void info() {
		System.out.println("원산지: "+goguma);
		super.info();
	}
	
}
