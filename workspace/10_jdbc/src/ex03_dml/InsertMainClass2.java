package ex03_dml;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertMainClass2 {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			
			con=DBConnection.getConnection();
			// 쿼리문에 변수 처리되는 부분은 ?으로 처리한다
			String sql="INSERT INTO staff(no, name, department, hireDate) VALUES(?,?,?,?)";
			ps=con.prepareStatement(sql);
			
			// 변수처리(?에 값 전달하기)
			ps.setInt(1, 2); // 1번째 ?에 데이터 2 전달 -> 사원 번호
			ps.setString(2, "emily"); // 2번째 ?에 데이터 emily 전달 => 사원 이름
			ps.setString(3, "인사"); // 3번째 ?에 데이터 인사 전달 -> 사원 부서
			ps.setDate(4, new Date(System.currentTimeMillis())); // 4번째 ?에 데이터 new Date 전달 -> 사원 고용날짜
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
				if(con!=null) ps.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
