package ex02_loop;

import java.util.Scanner;

// 5. 10000원 모두 사용하기
// 현재 10000원이 있다
// 결제금액은 5000원이다
// 현재 5000원이 있다
// 결제금액 -100원
// -100원은 결제할 수가 없다
// 현재 5000원이 있다
// 결제금액 10000원
// 5000원이 부족하다
// 결제금액 5000원
// 현재 0원이 있다

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money=10000;
		
		while(true) {
			System.out.println("현재  " + money + "원이 있습니다");
			if(money==0) {
				break;
			}
			
			System.out.print("결제금액");
			int spend=sc.nextInt();
			
			if(spend<0) {
				System.out.println(spend + "원은 결제할 수 없습니다");
			} else if(spend>money) {
				System.out.println((spend-money) + "원 부족합니다");
			} else {
				money -= spend;
			}
		}
		
		sc.close();

	}

}
