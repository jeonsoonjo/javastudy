package ex03_input;

import java.util.Scanner;

// 4. int 타입의 매출액 + 등급("VIP", "일반") 입력 받아서 실매출액 출력하기
// "VIP"는 20% 할인, "일반"은 5% 할인

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매출액 >>> ");
		int salesMoney = sc.nextInt();
		System.out.print("등급 >>> ");
		String grade = sc.next();
		
		// grade == "VIP" : grade.equals("VIP")
		// double disCountRate = grade.equals("VIP") ? 0.2 : 0.05;
		double disCountRate = grade.equalsIgnoreCase("VIP") ? 0.2 : 0.05;
		
		salesMoney -= (salesMoney * disCountRate);
		
		System.out.println("실 매출액: " + salesMoney);

		sc.close();

	}

}
