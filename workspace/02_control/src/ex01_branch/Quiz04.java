package ex01_branch;

import java.util.Scanner;

public class Quiz04 { // switch 사용, 단계를 숫자로 입력 받아 구분해서 출력(break 없이 사용하면 계속 실행됨, 물론 참일 경우)
					    // 1 입력 : 기승전결
						// 2 입력 : 승전결
						// 3 입력 : 전결
						// 4 입력 : 결
						// 나머지 : 알 수 없음

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력
		System.out.println("1~4까지의 숫자를 입력하세요");
		int step = sc.nextInt();
		
		// 숫자 단계별로 출력
		switch(step) {
		case 1 : System.out.print("기");
		case 2 : System.out.print("승");
		case 3 : System.out.print("전");
		case 4 : System.out.print("결");
				 break;
		default : System.out.println("알 수 없음");
		}
		
		sc.close();
		
	}

}
