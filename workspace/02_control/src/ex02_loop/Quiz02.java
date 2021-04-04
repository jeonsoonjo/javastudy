package ex02_loop;

import java.util.Scanner;

public class Quiz02 {
	
// 2. 영화 평점을 입력받아서 *을 출력
// 평점은 1~5사이의 정수이고, 잘못된 평점은 다시 입력처리

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 평점 입력
		int grade = 0;
		do {
			System.out.println("영화 평점(1~5)을 입력해주세요");
			grade = sc.nextInt();
		} while(grade < 1 || grade > 5);
		
		// 문자열
		String stars = ""; // 빈 문자열("")은 문자열 연결 연산(+)의 경우 초기화로 사용함 -> 평점+문자열 연결 연산
		for(int n=0; n<grade; n++) { // grade만큼 반복
			stars += "★";
		}
		
		// 평점+문자열 출력
		System.out.println("평점: " + grade + "(" + stars + ")");

		sc.close();

	}

}
