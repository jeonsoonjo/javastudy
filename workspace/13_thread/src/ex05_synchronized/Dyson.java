package ex05_synchronized;

// critical section
// 1. 임계영역
// 2. 공유 자원을 관리하기 위해 한 번에 한 스레드의 접근만 허용한다
//		"thread safe하다". 라고 표현한다
// 3. synchronized 키워드를 추가한다

public class Dyson {

	// synchronized
	// 한 스레드만 floorCleaning()나 homeCleaning()에 접근할 수 있다
	// 동시 접근은 안 된다
	
	// method
	public synchronized void floorCleaning() {
		try {
			System.out.println("바닥 청소를 하고 있다");
			Thread.sleep(1000); // 1000밀리초(1초) 일시중지
			notify(); // 다른 스레드에게 floorCleaning() 메소드가 끝났음을 알린다
			wait(); // 다른 스레드가 끝났다고 알려줄때까지 기다린다
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void homeCleaning() {
		try {
			System.out.println("집안을 청소하고 있다");
			Thread.sleep(1000);
			notify();
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
