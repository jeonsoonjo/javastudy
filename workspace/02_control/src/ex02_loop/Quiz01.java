package ex02_loop;

import java.util.Scanner;

// 1. 퀴즈 맞히기
// 맞힐때까지 계속 물어보는 퀴즈
// 대한민국의 수도는? 서울 또는 seoul
// 정답입니다.
// 대한민국의 수도는? 인천
// 오답입니다.

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String city = null; // String의 초기값은 빈문자열 "", 공백 null 2가지 많이 사용함
		
		// 질문 입력
		do {
			if(city!=null) {
				System.out.println("오답입니다."); // while문 조건이 참일때까지 반복이므로 위에 작성, 처음부터 문구가 나오니 city의 초기값 설정
			}
			System.out.print("대한민국의 수도는?");
			city = sc.next();
		} while(!city.equals("서울") && !city.equalsIgnoreCase("seoul")); // 오답일 때, 오답일 때 반복이므로
		
		System.out.println("정답입니다.");

		sc.close();
		
	}

}
