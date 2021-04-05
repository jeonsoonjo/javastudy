package ex03_input;

import java.util.Scanner;

// 2. double 타입의 실수 2개 입력 받아서 값을 교환하기

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 실수 >>> ");
		double a = sc.nextDouble();
		System.out.print("두 번째 실수 >>> ");
		double b = sc.nextDouble();
		
		double temp = a;
		a = b;
		b = temp;
		
		System.out.println("a=" + a + ", b=" + b);
		
		sc.close();

	}

}
