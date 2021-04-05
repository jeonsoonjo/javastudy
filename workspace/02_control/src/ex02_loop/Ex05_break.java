package ex02_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {
		
		// break문
		// 1. switch문을 종료할 때 사용
		// 2. loop문을 종료할 때 사용(for, while문 상관 없음)
		
		// 주요 사용
		// 무한루프 + break의 조합이 가장 많음
		// 무한루프 만드는 법
		// 1. while(true){}
		// 2. for( ; ; ){}, 빈 공간으로 두면 됨. 잘 사용 안 함
		
		Scanner sc = new Scanner(System.in);
		// String city = null;
		
			/* 		while(true) {
					System.out.println("수도는?");
					city = sc.next();
					
					if(city.equals("서울") || city.equalsIgnoreCase("seoul")) {
						System.out.println("정답입니다");
						break;
					} else {
						System.out.println("오답입니다");
						}
					}
			*/
		
		
		// 문제 -> 1부터 시작하는 모든 정수를 더합니다
		// 합계가 3000이 넘을 때까지 계속합니다
		// 실행 예) 1~77까지 더하면 3003이 나옵니다
		int total=0;
		int n=0;
		
		while(true) {
			total += n;
			if(total > 3000) {
				break;
			}
			n++;
		}
		System.out.println("1부터 " + n + "까지 합계는 " + total + "입니다");
		
		sc.close();
		
	}

}
