package quiz03;
// 서브클래스
public class SalaryMan extends Staff {

	// field
	private int salary;

	// constructor
	public SalaryMan(String name, int salary) {
		super(name); // 슈퍼클래스  Staff의 생성자 호출
		this.salary = salary;
	}
	
	// method
	public int getPay() {
		return salary;
	}
	@Override
	public void info() {
		super.info(); // 상위 슈퍼클래스의 정보를 호출하면 됨, name 출력
		System.out.println("기본급: "+salary);
	}
	
}
