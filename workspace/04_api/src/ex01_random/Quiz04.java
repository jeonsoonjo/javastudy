package ex01_random;

import java.util.Scanner;

// 4.가위바위보
// 가위바위보 >>> 가위
// Player는 가위, Computer 보. 이겼습니다
// 가위바위보 >>> 바위
// Player는 바위, Computer 바위. 비겼습니다
// 가위바위보 >>> 보
// Player 보, Computer 가위. 졌습니다
// 1승 1무 입니다

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] gababo= {"가위","바위","보"};
		
		int win=0;
		int draw=0;
		
		loop:
		while(true) {
			// 가위바위보 입력
			System.out.print("가위바위보 >>> ");
			int player=0; // 가위를 초기화(인덱스값)
			switch(sc.next()) {
			case "바위":
				player=1; 
				break;
			case "보":
				player=2;
			} // 가위=0, 바위=1, 보=2
			System.out.print("Player는 "+gababo[player]);
			
			int computer=(int)(Math.random()*3)+0;
			System.out.print(", Computer는 "+gababo[computer]);
			
			// 승패 비교
			// player : 0(가), 1(바), 2(보)
			// computer : 0, 1, 2
			// diff = player - computer
			// 1.이긴경우 : diff = -2, 1
			// 2.비긴경우: diff = 0
			// 3.진 경우: diff = 이 외의 값
			switch(player-computer) {
			case -2:case 1:
				System.out.println(", 이겼습니다");
				win++;
				break;
			case 0:
				System.out.println(", 비겼습니다");
				draw++;
				break;
			default:
				System.out.println(", 졌습니다");
				break loop;
			}

		}
		System.out.println(win+"승 "+draw+"무");
		
		sc.close();

	}

}
