package quiz01;

public class Watch {

	// field
	private int hour;
	private int minute;
	private int second;
	
	// constructor
	public Watch(int hour, int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	//method
	public void addHour(int hour) {
		this.hour+=hour;
		this.hour%=24;
	}
	public void addMinute(int minute) {
		this.minute+=minute;
		int hour=minute/60;
		addHour(hour);
		this.minute%=60;
	}
	public void addSecond(int second) {
		this.second+=second;
		int minute=second/60;
		addMinute(minute);
		this.second%=60;
	}
	
	public void see() {
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
	}
	
}
