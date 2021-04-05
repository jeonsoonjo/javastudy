package ex05_synchronized;

public class MainClass {

	public static void main(String[] args) {
		
		// 청소기 1대
		Dyson v11=new Dyson();
		
		// 엄마, 아빠(스레드가 2개)
		Mama mama=new Mama();
		Papa papa=new Papa();
		
		// 엄마 청소 시작
		mama.setDyson(v11);
		mama.start();
		
		// 아빠 청소 시작
		papa.setDyson(v11);
		papa.start();

	}

}
