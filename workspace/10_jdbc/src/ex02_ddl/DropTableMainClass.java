package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class DropTableMainClass {

	public static void main(String[] args) {
		
		Connection con=null; // try에서 선언하면 try문 밖에서 처리가 되지 않기에 밖으로 빼준다
		PreparedStatement ps=null; // 이렇게 빼 준 이유는, finally에서도 con과 ps를 사용하기 위해서
		
		try {
			
			con=DBConnection.getConnection();
			String sql="DROP TABLE staff";
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("staff 테이블이 삭제되었습니다");	
			
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
