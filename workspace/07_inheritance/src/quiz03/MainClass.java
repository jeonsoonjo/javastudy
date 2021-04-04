package quiz03;

public class MainClass {

	public static void main(String[] args) {
		
		// 월급쟁이
		SalaryMan staff1=new SalaryMan("제임스", 300);
		SalaryMan staff4=new SalaryMan("브라운", 400);
		
		// 판매직
		SalesMan staff2=new SalesMan("앨리스", 100);
		staff2.setSalesAmount(2000);

		// 알바
		Alba staff3=new Alba("데이비드");
		staff3.setPayPerHour(1);
		staff3.setTime(200);
		
		// 회사
		Company company=new Company(10); // 직원 수 10명
		company.hireStaff(staff1);
		company.hireStaff(staff2);
		company.hireStaff(staff3);
		company.hireStaff(staff4);
		company.staffInfo(); // 출력 결과 오류 발생, Staff에만 info가 있고 SalaryMan, SalesMan, Alba는 info가 없다
							 // 나머지에도 info를 생성해줘야 한다
		
		// 정리!!
		// Staff info()
		// SalearyMan info()		Alba info()
		// SalesMan info()
		// -------------------------------------------
		// Staff s=new Alba(); // 출력할 때는 뒤에(Alba)를 본다 
		// s.info(); // Alba info 호출
		
	}

}
