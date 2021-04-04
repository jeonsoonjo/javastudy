package ex07_recursive;

public class Adder {
	
	// field
	private int total;
	
	// method
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void calculate(int n) {
		if(n==0) {
			return; // 결과타입이 void인 경우에만 return; 을 사용해서 메소드를 종료한다
		}
		total+=n;
		calculate(n-1);
		
	}

}
