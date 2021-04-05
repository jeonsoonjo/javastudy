package ex01_char;

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
import java.io.*;

// BufferedWriter 클래스
// 1. 보조 스트림이다
// 2. FileWriter 클래스와 같은 메인 스트림과 함께 사용한다
// 3. 내부 버퍼를 이용해서 동작 속도를 향상시킬 수 있다

public class BufferedWriterMainClass {

	public static void main(String[] args) {
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			fw=new FileWriter("text3.txt");
			bw=new BufferedWriter(fw);
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 보조 스트림 bw를 사용하는 경우에는 bw만 닫으면 된다
			try {
				if(bw!=null) bw.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
