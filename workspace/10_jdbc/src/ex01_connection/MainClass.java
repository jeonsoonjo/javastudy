package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			// 1. oracle.jdbc.driver.OracleDriver 클래스를 메모리에 load한다
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ClassNotFoundException 예외발생, try-catch 처리하면 된다
			
			// 2. 접속 정보
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe"; // Oracle 11g Express Edition용
															  // DB 서버주소 127.0.0.1 (==localhost)
			String user="spring"; // 대소문자 구분 없음
			String password="1111";
			
			// 3. 접속
			// DriverManager 클래스가 접속을 담당하고, 접속 결과는  Connection 인터페이스에 저장한다
			Connection con=DriverManager.getConnection(url, user, password); // SQLException 발생 가능
			
			// 4. 접속이 성공하면 여기로 도착
			System.out.println("DB에 접속되었습니다");
			
			// 5. 접속 종료
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
