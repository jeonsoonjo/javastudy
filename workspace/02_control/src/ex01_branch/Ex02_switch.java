package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {
		
		int choice = 1;
		
		switch(choice) { // switch문에는 boolean, string문이 올 수 없음
		case 1:
			System.out.println("1이다");
			break; // switch문 종료
				   // break 미사용시  : 실행되다 해당 조건이 참이면 출력. 문제는 이 후 나머지도 그대로 출력함.
		case 2:
			System.out.println("2이다");
			break;
		default: // if의 else와 같음. 위 case 경우가 아닐 때
			System.out.println("1과 2가 아니다");
			break;
		}

	}

}
