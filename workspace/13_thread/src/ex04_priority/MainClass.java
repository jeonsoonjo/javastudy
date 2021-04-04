package ex04_priority;

public class MainClass {

	public static void main(String[] args) {
		
		// 스레드의 우선 순위
		System.out.println("가장 낮은 순위 : "+Thread.MIN_PRIORITY);
		System.out.println("중간 순위 : "+Thread.NORM_PRIORITY);
		System.out.println("가장 높은 순위 : "+Thread.MAX_PRIORITY);

		// 스레드 생성
		Thread homework=new Thread(new Homework());
		Thread watchTV=new Thread(new WatchTV());
		
		// homework의 우선 순위를 높이고, watchTV의 우선 순위를 낮춰라
		homework.setPriority(Thread.MAX_PRIORITY);
		watchTV.setPriority(Thread.MIN_PRIORITY);
		
		// 스레드 시작
		watchTV.start();
		homework.start();
		
	}

}
