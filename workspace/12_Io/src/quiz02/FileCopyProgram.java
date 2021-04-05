package quiz02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyProgram {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("water.mp4"); // 원본
			fos=new FileOutputStream("water2.mp4"); // 복사본
			
			byte[] b=new byte[1024]; // 1KB
			while(true) {
				int readByte=fis.read(b); // 영상 저장은 b, 실제 읽은 바이트수는 readByte
				if(readByte==-1) {
					break;
				}
				fos.write(b, 0, readByte);
			}
			System.out.println("water.mp4 파일이 복사되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
				if(fis!=null) fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
