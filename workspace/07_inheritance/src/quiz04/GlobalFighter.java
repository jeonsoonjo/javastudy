package quiz04;
// sub
// attack할 때, 10%확률로 KO시킬 수 있다
public class GlobalFighter extends Fighter {

	// field
	
	
	// constructor
	public GlobalFighter(String name) {
		super(name, (int)(Math.random()*100)+1, (int)(Math.random()*10)+1);
	}
	
	// method
	@Override
	public void attack(Fighter fighter) {
		if(Math.random()<0.1) {
			fighter.setEnergy(0); 
			System.out.println(fighter.getName()+" KO!");
		} else {
			fighter.setEnergy(fighter.getEnergy()-this.getPower());
			System.out.println("공격: "+this.getName()+"["+fighter.getName()+" 남은 에너지: "+fighter.getEnergy()+"]");
		}
	}

}
