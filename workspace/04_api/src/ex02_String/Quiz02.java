package ex02_String;

import java.util.Scanner;

// 2.정수/실수 판별하기
// 입력 >>> 120
// 120은 정수입니다
// 입력 >>> 3.14
// 3.14는 실수입니다

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력: ");
		String num=sc.next();
		
		if(num.indexOf(".")==-1) { // -1 -> 문자열에 .이 없다면
			System.out.println("정수입니다");
		} else {
			System.out.println("실수입니다");
		} // email@domain.com 이메일 형식이 아닙니다 -> 이럴 때 사용함
		
		sc.close();

	}

}
