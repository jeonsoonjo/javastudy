package ex03_dml;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
import java.sql.*; // 위에 처럼 import가 많아지면 sql.* 사용해 모든 sql을 import하면 된다

import connection.DBConnection;

public class InsertMainClass {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try
		{
			con=DBConnection.getConnection();
			String sql="INSERT INTO staff(no, name, department, hireDate) VALUES(1,'alice','총무','21/03/22')";
			ps=con.prepareStatement(sql);
			
			// executeUpdate 메소드 반환 값
			// 변화가 생긴 행(Row)의 개수가 반환된다(그래서 int 타입으로)
			// 실패하면 0이 반환되고, 성공하면 INSERT된 행(Row)의 개수가 반환된다
			int result=ps.executeUpdate();
			if(result==0) {
				System.out.println("행이 추가되지 않았습니다");
			} else {
				System.out.println("정상적으로 행이 추가되었습니다");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
