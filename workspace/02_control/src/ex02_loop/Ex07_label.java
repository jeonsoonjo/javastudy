package ex02_loop;

public class Ex07_label {

	public static void main(String[] args) {
		
		// label
		// 1. 소스코드의 특정 위치를 지정하는 방법
		// 2. 방법
		//		label : 소스코드
		
		// dan X n = (dan * n)
		
		for(int dan=2; dan<=9; dan++) {
			for(int n=1; n<=9; n++) {
				System.out.println(dan + "X" + n + "=" + (dan*n));
				if(dan==5 && n==5) {
					break; // 5단만 5x5에 중지되고 6단부터 다시 실행됨, 내부 for문이라 그렇다 -> label사용
				}
			}
			
			/* 
			 	outer : for(int dan=2; dan<=9; dan++) {
				inner : for(int n=1; n<=9; n++) {
					System.out.println(dan + "X" + n + "=" + (dan*n));
					if(dan==5 && n==5) {
						break outer;
					}
				}
			*/
		
		}

	}

}
