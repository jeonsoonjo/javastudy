package quiz01;
// 슈퍼클래스
public class Staff {

	// field
	private String name;
	
	// constructor
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
