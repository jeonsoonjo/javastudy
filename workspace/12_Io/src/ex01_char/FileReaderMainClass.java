package ex01_char;

/*
	FileReader 클래스
	1. "문자 기반 + 입력 스트림"이다 (Reader)
	2. 문자를 읽을 때 사용
		1) 통신 : 상대방이 보낸 문자를 받을 때
		2) 파일 : 텍스트 파일을 읽을 때
	3. 입력 메소드 : read()
	4. 입력 단위 : char[], int
	5. 예외 처리가 필요하다
	
*/

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMainClass {

	public static void main(String[] args) {
		
		try (FileReader fr=new FileReader("text1.txt")){
			/*
				// read() 메소드를 이용해서 읽기
				while(true) {
					int ch=fr.read(); // 몇 글자인지 읽어들인다, 읽은 문자 또는 -1(마지막 문자)이 ch에 저장된다
					if(ch==-1) { // 모두 읽어 들였다면
						break;
					}
					System.out.print((char)ch); // 72101108108111327497118973310781059910132116111321091011011163212111111733 -> 문자가 아닌 문자코드값이다
					// 문자를 읽을 때는 char로 캐스팅해야 한다
				}
			*/
			
			int ch=0;
			while((ch=fr.read())!=-1) {
				System.out.println((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
