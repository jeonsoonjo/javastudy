package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		// Terran
		// 	Marine, Firebat, Tank, Bunker:Marine과 Firebat만 입장 가능
		
		Bunker bunker=new Bunker();
		bunker.add(new Marine());
		bunker.add(new Firebat());
		// bunker.add(new Tank()); // 불가능하게 

	}

}
