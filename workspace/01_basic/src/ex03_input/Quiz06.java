package ex03_input;

import java.util.Scanner;

// 6. 주민번호(하이픈 없이) 전체 입력 받아서 "남", "여" 구분 출력하기

public class Quiz06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호입력(하이픈 없이) >>> ");
		String id = sc.next();
		char genderNum = id.charAt(6);
		
		// String gender = (genderNum == '1' || genderNum == '3') ? "남자" : "여자";
		
			/*
				문자는 코드값을 가지고 있습니다.
				문자를 연산하는 경우 "코드값"이 연산됩니다.
				'1' % 2  -->  49 % 2
				'2' % 2  -->  50 % 2
				-----
				알아두면 좋은 코드 값
				'0' : 48
				'A' : 65
				'a' : 97
			*/
		String gender = (genderNum % 2 == 1) ? "남자" : "여자";

		System.out.println("성별은 " + gender + "입니다.");
		
		sc.close();

	}

}
