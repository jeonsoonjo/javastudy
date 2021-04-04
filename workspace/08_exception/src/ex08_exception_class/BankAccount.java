package ex08_exception_class;

public class BankAccount {
	
	// field
	private String accNo;
	private long balance;
	
	// constructor
	public BankAccount(String accNo, long balance) {
		this.accNo=accNo;
		this.balance=balance;
	}
	
	// method
	// 입금
	public void deposit(long money) throws BankAccountException {
		if(money<=0) {
			throw new BankAccountException(money+"원 입금은 불가능합니다", 1000);
		}
		balance+=money;
	}
	
	// 출금1
		/*
			public void withdraw(long money) {
				if(money<=0) {
					System.out.println(money+"원 출금은 불가능합니다");
					return;
				} else if(money>balance) {
					System.out.println("잔고 부족으로 불가능합니다");
					return;
				}
				balance-=money;
			}
		*/
	
	// 출금2(이체 관련)
	public long withdraw(long money) throws BankAccountException {
		if(money<=0) {
			throw new BankAccountException(money+"원 이체는 불가능합니다", 2000);
		} else if(money>balance) {
			throw new BankAccountException("잔고 부족으로 불가능합니다", 2001);
		}
		balance-=money;
		return money;
	}
	
	// 이체
	public void transfer(BankAccount you, long money) throws BankAccountException {
		you.deposit(withdraw(money));
	}
	
	// 조회
	public void inquiry() {
		System.out.println("계좌번호: "+accNo+", 잔액: "+balance+"원");
	}
	
}
