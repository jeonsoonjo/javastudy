package ex07_exception_class;

// 예외메시지로 만들기

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
	public void deposit(long money) throws DepositException{ // 54줄에서 try-catch 처리해줘야 함
		if(money<=0) {
			throw new DepositException(money+"원 입금은 불가능합니다");
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
	public long withdraw(long money) throws WithdrawException {
		if(money<=0) {
			throw new WithdrawException(money+"원 이체는 불가능합니다",2000);
		}
		if(money>balance) {
			throw new WithdrawException("잔고 부족으로 불가능합니다",1000);
		}
		balance-=money;
		return money;
	}
	
	// 이체
	public void transfer(BankAccount you, long money) {
		// 내 통장에서 출금된 금액을 너 통장에 입금해 준다
		try {
			you.deposit(withdraw(money));
		} catch(DepositException e) {
			System.out.println(e.getMessage());
		} catch(WithdrawException e) {
			System.out.println(e.getMessage());
			System.out.println("예외코드: "+e.getErrorCode());
		}
	}
	
	// 조회
	public void inquiry() {
		System.out.println("계좌번호: "+accNo+", 잔액: "+balance+"원");
	}
	
}
