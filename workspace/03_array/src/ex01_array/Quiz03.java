package ex01_array;

import java.util.Scanner;

// 3.성적 관리 프로그램
// 학생들의 점수를 입력 받아서
// 평균, 최대값, 최소값 점수를 출력하기

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// 학생 배열 생성
		String[] students= {"타요","짱구","스폰지밥","브레드","구하리"};
		int[] scores=new int[students.length];
		
		// 점수 입력 받기
		for(int i=0; i<scores.length; i++) {
			System.out.print(students[i]+"의 점수 입력");
			scores[i]=sc.nextInt();
		}
		
		// 평균(합계/개수), 최대값, 최소값을 저장할 변수 선언하고 초기화 진행
		int total=scores[0]; // 인덱스 0번째 사람의 점수로 초기값 설정
		int min=scores[0];
		int max=scores[0];
		String top=students[0];
		String bottom=students[0];
		
		// 첫 번째 학생의 점수는 제외하고 합계, 최대, 최소값을 구한다
		// 인덱스 1부터 사용하겠다는 의미
		for(int i=1; i<scores.length; i++) {
			total+=scores[i];
			if(min>scores[i]) { // 현재 저장된 최소값보다 작은 점수가 나타난다면
				min=scores[i]; // 더 작은 점수를 최소값으로 갱신
				bottom=students[i];
			}
			if(max<scores[i]) { // 현재 저장된 최대값보다 큰 점수가 나타난다면
				max=scores[i]; // 더 큰 점수를 최대값으로 갱신
				top=students[i];
			}
		}
		
		// 결과 출력
		System.out.println("평균: "+((double)total/scores.length)+"점");
		System.out.println("최소: "+min+"점 ("+bottom+")");
		System.out.println("최대: "+max+"점 ("+top+")");
		
		sc.close();
		
	}

}
