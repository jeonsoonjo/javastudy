package ex03_input;

import java.util.Scanner;

// 1. int 타입의 점수를 3개 입력 받아서 평균 구하기

public class Quiz01 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
				
		System.out.print("국어 >>> ");
		int kor = sc.nextInt();
		System.out.print("영어 >>> ");
		int eng = sc.nextInt();
		System.out.print("수학 >>> ");
		int mat = sc.nextInt();
				
		double ave = (kor + eng + mat) / 3.0;
		System.out.println("평균: " + ave + "점");
				
		sc.close();
		
		}

}
