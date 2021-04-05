package ex01_branch;

import java.util.Scanner;

public class Quiz03 { // switch 사용, 나이 입력 받아 "성인", "미성년자" 구분

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 나이 입력
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		// switch문 "성인", "미성년자" 구분
		int state = 0; // 미성년자
			if(age >= 20) {
				state = 1; // 성인
			}
			
		switch(state) {
		case 0:
			System.out.println("미성년자");
			break;
		case 1:
			System.out.println("성인");
			break;
		}
		
		sc.close();

	}

}
