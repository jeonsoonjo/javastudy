package ex02_loop;
import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		
		// do-while문
		// 1. while문이다
		// 2. 반드시 한 번은 실행하는 while문이다
		// 3. 양수 이외 값 음수, 실수를 입력하면 종료
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n = 0;
		
		do {
			System.out.print("양수만 입력하세요");
			n = sc.nextInt();
			total += n;
		} while(n >= 0);
		
		total -= n;
		System.out.println("합계:" + total + "입니다");
		
		sc.close();
		
	}

}
