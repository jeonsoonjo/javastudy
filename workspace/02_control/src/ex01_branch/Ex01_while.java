package ex01_branch;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
		// while문
		// 반복의 횟수나 범위가 정확하지 않을 때 사용함(for문과 반대)
		
		// 무한루프 만들기
			/* while(true) { // 몇 개 인지 모를 때 사용, 몇 개 인지 알때는 for문 사용
				System.out.println("무한루프입니다.");
			}*/
		
		// 1~10 출력하기
			/* int n=1;
			while(n<=10) { // n : 1~10인 경우 while(true)
				System.out.println(n++);
			} */
		
		// 10~1 출력하기(거꾸로)
			/* int n=10;
			while(n>=1) {
				System.out.println(n--);
			} */
		
		// 'A'~'Z' 사이를 계속 입력 받는 프로그램, 대문자 이외에 문자, 숫자, 소문자가 입력되면 종료
			Scanner sc = new Scanner(System.in);
			/* char ch = 'A';
			
				while(ch >= 'A' && ch <= 'Z') {
				System.out.println("대문자를 입력하세요");
				ch = sc.next().charAt(0);
				}
			*/

		// 예제1)
		// 입력 받은 정수를 모두 더해줍니다
		// 0 이상은 모두 더해주고, 음수가 입력되면 종료.
		// 합계를 출력하세요
		int total = 0;
		int n = 0;
		
		while(n>=0) {
			System.out.println("양수를 입력하세요");
			n = sc.nextInt();
			total += n;
		}
		
		total -= n; // n이 음수일 때 처리되므로, 마지막 뺐던 값을 다시 더해줌
		
		System.out.println("합계는 " + total + "입니다.");

		sc.close();
		
	}

}
