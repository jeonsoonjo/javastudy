package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertQuiz {

	public static void main(String[] args) {
		
		// 임의의 3명의 staff을 삽입해라
		// 반복문과 배열을 사용해라
		int[] noList= {3,4,5};
		String[] nameList= {"david","james","jack"};
		String[] departList= {"영업","총무","기획"};
		String[] hireDateList= {"88/04/13","20/06/05","19/04/17"};
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
	
			con=DBConnection.getConnection();
			String sql="INSERT INTO staff VALUES(?,?,?,?)"; // 테이블명 다음 생략 가능, values는 생략 불가
			ps=con.prepareStatement(sql);
			int result=0; // 초기화
			for(int i=0; i<noList.length; i++) {
				ps.setInt(1, noList[i]);
				ps.setString(2, nameList[i]);
				ps.setString(3, departList[i]);
				ps.setString(4, hireDateList[i]);
				result+=ps.executeUpdate(); // result+=1;(정상실행), result+=0;(실패)
			}
			System.out.println("총 "+result+"명의 staff이 삽입되었습니다");
			
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
