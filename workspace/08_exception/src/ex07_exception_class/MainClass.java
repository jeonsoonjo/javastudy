package ex07_exception_class;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount me=new BankAccount("1111", 10000);
		BankAccount you=new BankAccount("9999", 10000);
		
		me.transfer(you, 5000);
		
		me.inquiry();
		you.inquiry();

	}

}
