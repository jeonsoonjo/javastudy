package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class UpdateMainClass {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			
			con=DBConnection.getConnection();
			String sql="UPDATE staff SET department=? WHERE no=?";
			// 조건식을 달지 않으면 전체가 바뀌니 주의할 것!
			// sql문은 작은따옴표(')임을 주의해야 한다
			ps=con.prepareStatement(sql);
			
			// ? 변수처리 했을 경우
			ps.setString(1, "영업");
			ps.setInt(2, 3);
			
			int result=ps.executeUpdate();
			if(result==0) {
				System.out.println("정보가 수정되지 않았습니다");
			} else {
				System.out.println("정상적으로 정보가 수정되었습니다");
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
