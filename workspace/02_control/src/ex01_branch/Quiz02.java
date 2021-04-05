package ex01_branch;

import java.util.Scanner;

public class Quiz02 { // 나이를 입력 받아 구분 출력
						// 7 이하 : 미취학아동
						// 13 이하 : 초등학생
						// 16 이하 : 중학생
						// 19 이하 : 고등학생
						// 20 이상 : 성인
						// 나이 범위(1~100)를 벗어나면 : 불가능한 나이

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 나이 입력
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		// 연령별로 구분
		if(age < 1 || age > 100) {
			System.out.print("불가능한 나이");
		} else if(age <= 7) {
			System.out.println("미취학아동");
		} else if(age <= 13) {
			System.out.println("초등학생");
		} else if(age <= 16) {
			System.out.println("중학생");
		} else if(age <= 19) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}

		sc.close();
		
	}

}
