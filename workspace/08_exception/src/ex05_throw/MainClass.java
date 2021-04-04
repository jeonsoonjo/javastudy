package ex05_throw;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calculator=new Calculator();
		
		try {
			calculator.division(0);
		} catch(Exception e){
			System.out.println("예외가 발생했습니다: "+e);
		}

	}

}
