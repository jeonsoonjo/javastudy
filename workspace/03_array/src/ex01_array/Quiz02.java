package ex01_array;

import java.util.Scanner;

// 2.String[] friendList={"타요","짱구","스폰지밥"};
// 새로 사귄 친구의 수를 입력 받아서
// friendList 배열의 길이를 늘이기

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// String 타입의 친구 배열 생성
		String[] friendList= {"타요","짱구","스폰지밥"};
		
		System.out.println("새로 사귄 친구가 몇 명?");
		int newFriend=sc.nextInt();

		// 새로운 배열 생성
		String[] temp=new String[friendList.length+newFriend];
		
		// 새로운 배열로 기존 친구 명단 이동
		for(int i=0; i<friendList.length; i++) {
			temp[i]=friendList[i];
		}
		
		// 새 친구들 입력 받기
		for(int i=friendList.length; i<temp.length; i++) {
			System.out.print("새 친구 이름");
			temp[i]=sc.next();
		}
		
		// 새로운 배열로 갈아타기
		friendList=temp;
		
		// 확인
		for(String friend:friendList) {
			System.out.println(friend);
		}
		
		sc.close();

	}

}
