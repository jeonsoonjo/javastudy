package ex11_abstract;

// 추상클래스를 상속 받는 서브클래스는 반드시 모든 추상메소드를 @override 해야 한다!!

public class SalaryMan extends Staff {
	
	// field
	private int salary;
	
	// constructor
	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	// method
	@Override
	public void info() {
		super.info();
		System.out.println("기본급: "+salary);
	}
	// getPay()는 필수
	@Override
	public int getPay() {
		return salary;
	}

}
