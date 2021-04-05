package ex03_api;

import java.sql.Date;

public class Ex03_Date {

	public static void main(String[] args) {
		
		// java.sql.Date
		// DB의 Data타입에 맞게끔 wrapping 처리한 클래스
		// 잘 사용하지 않음
		long date = System.currentTimeMillis();
		Date today = new Date(date);
		
		System.out.println(today);

	}

}
