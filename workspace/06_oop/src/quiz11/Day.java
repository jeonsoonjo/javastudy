package quiz11;

public class Day {
	
	// field
	private String schedule;
	
	// constructor
	
	
	// method
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public void info() {
		if(schedule==null||schedule.isEmpty()) { // schedule이 null 또는 비어있으면(""빈 문자열)
			System.out.println("<없음>");
		} else {
			System.out.println("<"+schedule+">");
		}
	}
	
}
