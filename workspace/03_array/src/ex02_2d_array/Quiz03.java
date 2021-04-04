package ex02_2d_array;

// 3. (1~99 사이 정수 대상) 369 결과 저장하고 출력하기
// 1 2 짝 4 5 짝 7 8 짝 10
// 11 12 짝 14 15 짝 17 18 짝 20
// ...
// 짝 짝 짝짝 짝 짝 짝짝...
// ...

public class Quiz03 {

	public static void main(String[] args) {
		
		// 배열 생성
		String[][] game = new String[10][10];
		
		// 1~100을 game에 채우기
		// 3,6,9 검사해서 '짝'으로 바꿔 저장하기
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game[i].length; j++) {
				int n=(i*10)+(j+1); // n은 1~100, i->10의 자리, j->1의 자리
				
				// 일의 자리와 십의 자리로 분리하기
				int units=n%10;
				int tens=n/10;
				
				// 369검사
				boolean test1=units==3||units==6||units==9;
				boolean test2=tens==3||tens==6||tens==9;
				
				// 검사 후 저장
				if(test1 && test2) {
					game[i][j]="짝짝"; // 3,6,9 둘 다 있을땐 짝짝
				} else if(test1 || test2) {
					game[i][j]="짝"; // 3,6,9 하나만 있을땐 짝
				} else {
					game[i][j]=n+""; // 문자열로 인식
				}
				
				System.out.print(game[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
