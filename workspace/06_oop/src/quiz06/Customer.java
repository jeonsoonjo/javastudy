package quiz06;

public class Customer {

	// field
	private int customerBread;
	private int customerMoney;
	
	// constructor
	public Customer(int customerMoney) {
		this.customerMoney=customerMoney;
	}
	
	// method
	// buy
	public void buy(Bakery bakery, int money) {
		// bakery에서 판매한 빵과 잔돈을 받음
		BreadAndChange bnc=bakery.sell(money);
		// 구매처리
		customerBread+=(bnc.getBread());
		customerMoney+=(bnc.getChange());
		customerMoney-=money;
		System.out.println("빵: "+customerBread+", 남은돈: "+customerMoney+"원");
	}
	
}
