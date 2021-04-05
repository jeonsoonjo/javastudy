package quiz02;

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
	}
}
