package ex02_2d_array;

// 1. 인구조사
// apt에 사는 사람 수를 초기화 해 놓고,
// 전체 사람의 수를 출력하기
// apt 5층, 2개의 호수
// 1층엔 3명이 삽니다
// 2층엔 7명이 삽니다
// 3층엔 6명이 삽니다
// 4층엔 5명이 삽니다
// 5층엔 7명이 삽니다
// apt에 28명이 삽니다

public class Quiz01 {

	public static void main(String[] args) {
		
		// 5층 2개의 호수
		int[][] apt = {
				{1,2},
				{5,2},
				{3,3},
				{1,4},
				{5,2}
		};
		
		// 2개의 합계 변수가 필요함
		int floor=0; // 각 층마다 사는 사람들의 합계
		int total=0; // apt 전체 사는 사람들의 합계
		
		// 초기화
		for(int i=0; i<apt.length; i++) {
			floor=0; // for문 안에서 초기값 다시 줌
			for(int j=0; j<apt[i].length; j++) {
				floor+=apt[i][j];
			}
			System.out.println((i+1)+"층에는 "+floor+"명이 삽니다");
			total+=floor;
		}
		System.out.println("apt에 "+total+"명이 삽니다");

	}

}
