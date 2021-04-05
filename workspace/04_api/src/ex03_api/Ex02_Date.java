package ex03_api;

import java.util.Date;

public class Ex02_Date {

	public static void main(String[] args) {
		
		// java.util.Date -> java.sql.Date로 사용함
		
		// 1. 자바 내에서 사용하는 날짜, 시간 처리 클래스
		// 2. 많은 메소드가 deprecate 되었기 때문에 사용하지 않아도 된다
		Date today=new Date();
		System.out.println(today);
		
	}

}
