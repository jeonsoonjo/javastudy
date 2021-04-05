package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		Soldier soldier=new Soldier("람보", 3); // 람보는 총을 최대 3개 가질 수 있다
		
		soldier.addGun(new Gun("콜트", 6));
		soldier.addGun(new Gun("베레타", 6));
		soldier.addGun(new Gun("스미스웨슨", 6));
		
		soldier.shoot(); // 가지고 있는 모든 총을 한 발씩 쏜다
		soldier.shoot(1); // 1번 총을 한 발 쏜다(콜트), 오버로딩
		soldier.shoot("베레타"); // 베레타를 한 발 쏜다
		
		soldier.info();
		// 이름: 람보
		// 콜트(4발)
		// 베레타(4발)
		// 스미스웨슨(5발)
	
		soldier.reload(2); // 모든 총에 6발을 추가한다
		soldier.reload(1,6); // 1번 총에 6발 추가한다
		soldier.reload("베레타",6);
		
		soldier.info();
		// 이름: 람보
		// 콜트(6발)
		// 베레타(6발)
		// 스미스웨슨(6발)
		
	}

}
