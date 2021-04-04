package quiz03;

public class SalesMan extends SalaryMan {
	
	// field
	private int salesAmount; // 판매 실적
	private double incentive; // 인센티브(%)
	
	// constructor
	// 필드에 있는 변수로 생성자를 만들지 않고 슈퍼클래스 SalaryMan으로부터 생성
	// source -> generate constructors from superclass
	public SalesMan(String name, int salary) {
		super(name, salary);
	}
	
	// method
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if(salesAmount>=1000) {
			setIncentive(0.07); // 1000만 원 이상이면 7% 인센티브
		} else {
			setIncentive(0.05); // 1000만 원 이하이면 5% 인센티브
		}
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	// SalaryMan이 받는 getPay()
	// SalesMan이 판매수당으로 받는 getPay()
	@Override
	public int getPay() { // 기본급 + 판매수당(판매실적*인센티브)
		return super.getPay()+getSalesPay();
	}
	public int getSalesPay() {
		return (int)(salesAmount*incentive);
	}
	@Override
	public void info() {
		super.info(); // 상위 슈퍼클래스 SalayMan info 호출
					  // 직원명+기본급
		System.out.println("판매수당 : "+getSalesPay()); // 자신의 것도 추가
		System.out.println("총합: "+getPay());
	}

}
