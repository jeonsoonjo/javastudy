package ex04_dql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import connection.DBConnection;

public class SelectOneMainClass {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement ps=null;;
		ResultSet rs=null; // SELECT문의 결과 행(Row)를 저장한다

		try {
			
			con=DBConnection.getConnection();
			String sql="SELECT no, name, department, hireDate FROM staff WHERE no=5";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery(); // DML과 차이점, SELECT문의 실행은 쿼리이다!(업데이트 아님 주의!!)
			// rs에 저장된 데이터는 "반드시" next() 메소드를 호출한다
			// next() 메소드
			// 1. 결과 행에서 순서대로 한 행씩 꺼낸다
			// 2. 꺼낼 결과 행이 존재하면 true, 아님 false
			if(rs.next()) {
				/*
					// rs에서(row 한 줄) 하나씩(column)을 빼려면 getInt(1), getInt("no") 숫자나 문자열로 뺀다
					// getInt, getString, getDate.. 등등
					int no=rs.getInt(1);
					String name=rs.getString(2);
					String department=rs.getString("department");
					Date hireDate=rs.getDate("hireDate");
					System.out.println("no= "+no+", name= "+name+", department= "+department+", hireDate= "+hireDate);
				*/
				
				// 문제: HashMap으로 해보기
				Map<String, Object> staff=new HashMap<String, Object>();
				staff.put("no", rs.getInt("no"));
				staff.put("name", rs.getString("name"));
				staff.put("department", rs.getString("department"));
				staff.put("hireDate", rs.getDate("hireDate"));
				System.out.println("no= "+staff.get("no")+", name= "+staff.get("name")+", department= "+staff.get("department")+", hireDate= "+staff.get("hireDate"));	
				
			} else {
				System.out.println("해당 staff이 없습니다");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
