package ex15_interface_extends;

public class MainClass {

	public static void main(String[] args) {
		
		// 1. Phone타입의 SmartPhone
		Phone phone1=new SmartPhone();
		phone1.sendCall();
		((Computable)phone1).playApp(); // downcasting
		
		// 2. Computable타입의 SmartPhone
		Computable phone2=new SmartPhone();
		phone2.playApp();
		((Phone)phone2).sendCall(); // downcasting
		
		// 3. SmartPhone타입의 SmartPhone
		SmartPhone phone3=new SmartPhone();
		phone3.sendCall();
		phone3.playApp();
		
	}

}
