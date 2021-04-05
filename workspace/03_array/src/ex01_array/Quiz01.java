package ex01_array;

import java.util.Scanner;

// 1.길이가 3인 String 타입의 배열을 선언하고,
// 3개의 이름을 입력 받아서 배열에 저장하고 확인하기

public class Quiz01 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		// String 타입의 배열 선언 및 생성, 이름 입력받기
		String[] names=new String[3];
		for(int i=0; i<names.length; i++) {
			System.out.print((i+1)+"번째 이름 입력");
			names[i]=sc.next();
		}
		
		// 저장하고 확인, advanced for문 추천
		// for(변수:배열명)
		for(String name:names) {
			System.out.println(name);
		}
	
		sc.close();
		
	}

}
