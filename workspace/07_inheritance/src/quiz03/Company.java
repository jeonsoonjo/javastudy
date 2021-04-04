package quiz03;

public class Company {

	// field
	private Staff[] staffList; // 직원 명단
	private int idx;
	
	// constructor
	public Company(int staffCount) { // 직원 수
		staffList=new Staff[staffCount];
	}
	
	// method
	public void hireStaff(Staff staff) {
		if(idx==staffList.length) {
			System.out.println("직원을 모두 고용했습니다");
			return;
		}
		staffList[idx++]=staff;
	}
	public void staffInfo() {
		for(Staff staff:staffList) {
			if(staff!=null) {
				staff.info();
			}
		}
		System.out.println("SalaryMan의 급여총액: "+getSalaryManTotalPay());
	}
	
	// SalayMan들에게 지급된 급여 총액을 구해라
	public int getSalaryManTotalPay() {
		// Staff[] staffList 이므로 저장된 객체들이 SalaryMan인지 검사해 봐야 한다
		int salaryManTotalPay=0;
		for(Staff staff:staffList) {
			if(staff instanceof SalaryMan) { // staff이 salaryMan이면
				if(!(staff instanceof SalesMan)) { // staff이 salesMan이 아니라면
					salaryManTotalPay+=((SalaryMan) staff).getPay(); // 자동완성
				}
			}
		}
		return salaryManTotalPay;
	}

}
