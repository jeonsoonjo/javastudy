package quiz04;

public class Soldier {

	// field
	private String name;
	private Gun gun;
	
	// constructor
	public Soldier(String name, Gun gun) {
		this.name=name;
		this.gun=gun;
	}
	
	// method
	public void shoot() {
		gun.shoot(); // MainClass에 soldier에 shoot이기 때문에 gun에 있던 shoot을 불러준다
	}
	public void reload(int bullet) {
		gun.reload(bullet); // shoot과 마찬가지
	}
	public void info() {
		System.out.print(name+", ");
		gun.info();
		
	}
	
}
