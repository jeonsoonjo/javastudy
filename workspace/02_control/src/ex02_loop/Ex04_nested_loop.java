package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		
		// 중첩문, 반복문이 2개 이상
		for (int out=1; out<=10; out++) {
			for(int in=10; in<=50; in+=10) {
				System.out.println(out + "," + in);
			}
		}
		
		// 1주차 1일차 1교시 입니다.
		// 1주차 1일차 2교시입니다.
		// ...
		// 총 3주차, 5일차, 8교시
		for(int a=1; a<=3; a++) {
			for(int b=1; b<=5; b++) {
				for(int c=1; c<=8; c++) {
					System.out.println(a + "주차 " + b + "일차 " + c + "교시입니다");
				}
			}
		}

	}

}
