package ex15_interface_extends;

public class SmartPhone extends Phone implements Computable {

	// computable의 playApp을 반드시 override 해야 한다
	@Override
	public void playApp() {
		System.out.println("앱을 실행한다");
	}
	
}
