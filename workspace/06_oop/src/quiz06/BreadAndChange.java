package quiz06;

public class BreadAndChange {
	
	// field
	private int bread;
	private int change;
	
	// constructor
	public BreadAndChange(int bread, int change) {
		this.bread=bread;
		this.change=change;
	}
	
	// getter, setter 생성(bread와 change 분리해야 하기 때문에 생성하는 것임)
	public int getBread() {
		return bread;
	}
	public void setBread(int bread) {
		this.bread = bread;
	}

	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
}
