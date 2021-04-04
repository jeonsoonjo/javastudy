package quiz01;

public class Gun extends Weapon implements Runnable {

	// field
	private String model;
	private int bullet;
	
	// constructor
	public Gun(String model, int bullet) {
		super();
		this.model = model;
		this.bullet = bullet;
	}
	
	// method
	public void shoot(int nth) { // 한 발씩 쏘는 메소드
		if(bullet==0) {
			System.out.println("헛빵, 총알이 없다..");
			return;
		} 
		System.out.println(model+(nth+1)+" 발 쐈다");
	}
	@Override // Runnable -> ctrl+space 자동 완성
	public void run() {
		for(int i=0; i<bullet; i++) { // 10발을 다 쏴야 한다
			shoot(i);			
		}
	}
	
}
