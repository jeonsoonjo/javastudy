package ex03_join;

public class Calculator extends Thread {

	// field
	private int from;
	private int to;
	private int result;
	
	// method
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	
	@Override
	public void run() {
		addition();
	}
	
	public void addition() { // thread로 표현하려면 매개변수를 field에서 선언한다
		// from부터 to까지 모든 정수 더해서 result에 저장
		if(from>to) {
			int temp=from;
				from=to;
				to=temp;
		}
		for(int n=from; n<=to; n++) {
			result+=n;
		}
	}
	
}
