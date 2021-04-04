package ex01_branch;

import java.util.Scanner;

public class Quiz01 { // 임의의 양수 1개 입력 받아서 "홀수", "짝수", "3의 배수" 출력하기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 임의 양수 1개 입력
		System.out.println("양수를 입력해주세요");
		int number = sc.nextInt();
		
		// "홀수", "짝수", "3의 배수" 구분 출력
		if(number % 3 == 0) {
			System.out.println(number + "은(는) 3의 배수입니다");
		} else if(number % 2 == 0) {
			System.out.println(number + "은(는) 짝수입니다");
		} else {
			System.out.println(number + "은(는) 홀수입니다");
		}
		
		sc.close();

	}

}
