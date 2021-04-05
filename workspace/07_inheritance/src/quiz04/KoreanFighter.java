package quiz04;
// sub
// attack할 때, 20% 확률로 한 방에 KO 시킬 수 있다
public class KoreanFighter extends Fighter {

	// field
	
	
	// constructor
	public KoreanFighter(String name) {
		super(name, (int)(Math.random()*100)+1, (int)(Math.random()*10)+1);
	}
	
	// method
	@Override
	public void attack(Fighter fighter) {
		// 나 : this
		// 상대편 : fighter
		if(Math.random()<0.2) {
			fighter.setEnergy(0); // 20% 확률로 상대편의 에너지를 0으로(KO) 떨어뜨린다
			System.out.println(fighter.getName()+" KO!");
		} else {
			// 내 파워만큼 상대편 에너지가 줄어든다
			fighter.setEnergy(fighter.getEnergy()-this.getPower());
			System.out.println("공격: "+this.getName()+"["+fighter.getName()+" 남은 에너지: "+fighter.getEnergy()+"]");
		}
	}
	
}
