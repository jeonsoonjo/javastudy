package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	// method
	// 1.결과타입 : Connection
	// 2.메소드명 : getConnection
	// 3.매개변수 : 없음
	// 4.예외처리 : ClassNotFoundException, SQLException -> 어떤 예외인지 모르면 그냥 Exception 이라고 써도 된다
	// throw의 의미
	// getConnection() 메소드에서는 예외처리를 하지 않겠다
	// getConnection() 메소드를 호출하는 곳으로 예외를 던져서(책임을 넘김) 처리하겠다
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="spring";
		String password="1111";
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}
	
}
