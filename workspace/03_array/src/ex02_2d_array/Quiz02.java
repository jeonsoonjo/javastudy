package ex02_2d_array;

// 2. 구구단의 결과만 2차원 배열에 저장하고 출력하기
// 2 4 6 .. 18
// 3 6 9 .. 29
// ...
// 9 18 27 .. 81

public class Quiz02 {

	public static void main(String[] args) {
		
		// 배열 생성
		int[][] dan = new int[8][9];
		
		// 구구단 초기화
		for(int i=0; i<dan.length; i++) {
			for(int j=0; j<dan[i].length; j++) {
				dan[i][j]=(i+2)*(j+1); // i -> 2단부터 시작, j -> x1
				System.out.print(dan[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 향상된 for문
			/*
				 for(int[] a:dan) {
					for(int n:a) {
						System.out.print(n+"\t");
					}
					System.out.println();
				 }
			*/
	}

}
