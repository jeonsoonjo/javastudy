package ex02_byte;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamMainClass {

	public static void main(String[] args) {
		
		ObjectInputStream ois=null;
		
		try {
			ois=new ObjectInputStream(new FileInputStream("board.dat"));
			
			Board board=(Board)ois.readObject();
			System.out.println(board);
			
			List<Board> boardList=(ArrayList<Board>)ois.readObject(); // 배열을 캐스팅 했을 시 경고문이 뜬다
			for(Board b:boardList) {
				System.out.println(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null) ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
