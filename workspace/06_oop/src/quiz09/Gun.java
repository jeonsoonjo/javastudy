package quiz09;

public class Gun {

	// field
	private String model;
	private int bullet;
	private final int FULL_BULLET=6;
	
	// constructor
	public Gun(String model, int bullet) {
		this.model=model;
		this.bullet=bullet;
	}
	
	// method
	// getter, setter 생성, full_bullet은 final이기에 setter를 만들 수 없다
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	public void shoot() {
		if(bullet>0) {
			System.out.println(model+": 빵야! ("+bullet+"발 남았다)");
		} else if(bullet==0) {
			System.out.println(model+": 헛빵!");
		}
	}
	
	public void reload(int bullet) {
		if(this.bullet+bullet<=FULL_BULLET) {
			this.bullet+=bullet;
			System.out.println(model+"("+bullet+"발 추가되었다) 현재 "+this.bullet+"발");
		} else {
			int realBullet=FULL_BULLET-this.bullet;
			this.bullet=FULL_BULLET;
			System.out.println(model+"("+realBullet+"발 추가되었다) 현재 "+this.bullet+"발");
		}
	}
	
	public void info() {
		System.out.println(model+"("+bullet+"발)");
	}
	
}
