package ex02_String;

import java.util.Scanner;

// 1.시간을 입력 받아서 출력하기
// 시간 입력 >>> 9
// 분 >>> 5
// 초 >>> 30
// 9:05:30

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 시간 입력받기
		int hour=0;
		int minute=0;
		int second=0;
		System.out.print("시간을 입력하세요"); hour=sc.nextInt();
		System.out.print("분을 입력하세요"); minute=sc.nextInt();
		System.out.print("초를 입력하세요"); second=sc.nextInt();
		
		// 시간, 분, 초를 문자열로 변환
		String sHour=hour+"";
		String sMinute=minute+"";
		String sSecond=second+"";
		
		if(sMinute.length()==1) { // 한 글자 라면, 5분 -> 05
			sMinute="0"+sMinute;
		}
		if(sSecond.length()==1) { // 한 글자 라면, 5초 -> 05
			sSecond="0"+sSecond;
		} // 시간은 한 자리라서 변경할 필요가 없음
		
		String time=sHour+":"+sMinute+":"+sSecond;
		System.out.println(time);

		sc.close();

	}

}
