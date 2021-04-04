package connection;

import java.sql.Connection;

public class TestMainClass {

	public static void main(String[] args) {
		
		// DBConnection 클래스의 getConnection() 메소드를 호출한다
		// getConnection() throws Exception 이므로 try-catch를 준비한다
		
		try {
			
			// === 인스턴스 메소드 getConnection() ===
			// DBConnection connection=new DBConnection(); // new로 생성할 필요가 없다
			// Connection con=connection.getConnection();
			
			// === 클래스 메소드 getConnection() === 추천!!
			// 클래스 메소드 처리는 static으로 한다
			Connection con=DBConnection.getConnection();
			
			System.out.println("DB에 접속되었습니다");
			con.close();
			System.out.println("DB접속이 해제되었습니다");
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
