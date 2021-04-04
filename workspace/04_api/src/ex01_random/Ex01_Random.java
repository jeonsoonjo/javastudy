package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		
		// java.util.Random
		Random random=new Random();
		
		// 1.int 난수
		int rand1=random.nextInt(); // int 범위 중 하나
		int rand2=random.nextInt(10); // 10개 중 하나(0~9)
		
		System.out.println(rand1);
		System.out.println(rand2);
		
		// 2.double 난수
		double rand3=random.nextDouble(); // 0 <= 난수 < 1
		System.out.println(rand3);

	}

}
