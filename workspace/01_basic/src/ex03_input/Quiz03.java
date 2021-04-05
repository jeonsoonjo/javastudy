package ex03_input;

import java.util.Scanner;

// 3. 나이를 입력 받아서 "성인", "미성년자" 구분 출력하기

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 >>> ");
		int age = sc.nextInt();
		
		System.out.println(age >= 20 ? "성인" : "미성년자");

		sc.close();

	}

}
