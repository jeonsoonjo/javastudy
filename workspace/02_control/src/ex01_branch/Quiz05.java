package ex01_branch;

import java.util.Scanner;

public class Quiz05 { // 점수를 입력 받아 해당하는 학점을 출력하시오 (switch문 사용)
						//	char grade : 'S', 'A', 'B', 'C', 'F'
						//	char point : '+', '0', '-', ' '
						//	100		: S
						//	99~97	: A+ 9~7 : +
						//	96~94	: A0 6~4 : 0
						//	93~90	: A- 3~0 : -
						//	89~87	: B+ 
						//	86~84	: B0 
						//	83~80	: B- 
						//	79~77	: C+ 
						//	76~74	: C0 
						//	73~70	: C- 
						//	69~0	: F

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 점수 입력
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();		
		
		// point 구분
		char point = '-'; // 기본값 설정
			switch(score % 10) {
			case 9:
			case 8:
			case 7:
				point = '+';
				break;
			case 6:
			case 5:
			case 4:
				point = '0';
			}
			
		// grade 구분
		char grade = 'F'; // 기본값 설정
			switch(score / 10) {
			case 10:
				grade = 'S';
				point = ' ';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				point = ' ';
			}
		
		// grade + point 출력
		System.out.println("" + grade + point); // "" 빈문자열을 추가하면 문자열로 인식 됨
		
		/*	System.out.println(grade + "" + point); // 항상 앞에 것부터 연산처리
			System.out.println(grade + point + "");
		*/	
		
		sc.close();

	}

}
