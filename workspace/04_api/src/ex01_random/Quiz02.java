package ex01_random;

import java.util.Scanner;

// 2.UpDown 게임
// 1~10000 사이의 난수가 발생되면 사용자가 해당 난수를 맞히는 게임
// 입력 >>> 5000
// Up
// 입력 >>> 7500
// Down
// 입력 >>> 7499
// 총 3번만에 정답

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rand=(int)(Math.random()*10000)+1;
		int n=0; // 사용자 입력 값
		int times=0; // 입력 횟수
		int top=10000;
		int bottom=1;
		
		do {
			// 입력 받기
			System.out.println("입력 >>> ");
			n=sc.nextInt();
			times++;
			
			// 입력 범위 체크
			if(n>top||n<bottom) {
				System.out.println(bottom+"~"+top+" 범위를 입력하세요");
				continue; // 시작(위)로 돌려보냄
			}
			
			// 입력 받은 숫자와 비교
			if(n==rand) {
				System.out.println("총 "+times+"번만에 정답");
			} else if(n<rand) {
				System.out.println("Up");
				bottom=n+1;
			} else {
				System.out.println("Down");
				top=n-1;
			}
		} while(rand != n);
		
		sc.close();

	}

}
