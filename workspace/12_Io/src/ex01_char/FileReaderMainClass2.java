package ex01_char;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMainClass2 {

	public static void main(String[] args) {
		
		try(FileReader fr=new FileReader("text3.txt")) {
			
			char[] cbuf=new char[5];
			
			while(true) {
				int readCharCount=fr.read(cbuf); // 읽은 내용은 cbuf에 저장되고, readCharCount에는 읽은 글자 수가 저장된다
												 // 파일 끝에 도달하면 -1을 readCharCount에 반환한다
				if(readCharCount==-1) {
					break;
				}
				System.out.print(cbuf);
			}
			// 출력 결과
			// 안녕하세요 : cbuf
			// .\n반갑습 : cbuf
			// 니다. 갑습 : cbuf
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
