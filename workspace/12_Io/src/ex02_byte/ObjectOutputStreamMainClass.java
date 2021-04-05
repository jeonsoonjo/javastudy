package ex02_byte;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamMainClass {

	public static void main(String[] args) {
		
		ObjectOutputStream oos=null;
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream("board.dat"));
			// 1.개별저장
			Board board1=new Board("공지", "잘 읽어라", "관리자");
			oos.writeObject(board1); // board 객체는 반드시 "직렬화"가 되어 있어야 한다
			// 2.배열에 저장
			List<Board> boardList=new ArrayList<Board>();
			boardList.add(new Board("필독", "꼭 읽어라", "관리자"));
			boardList.add(new Board("협조", "부탁한다", "관리자"));
			oos.writeObject(boardList);
			
			System.out.println("board.dat 파일이 생성되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
