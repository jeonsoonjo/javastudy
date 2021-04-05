package ex04_socket_thread;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {
		
		Socket client=null;
		File dir=null;
		File file=null;
		DataOutputStream dos=null;
		BufferedInputStream bis=null;
		Scanner sc=null;
		
		try {
			
			// 서버 접속
			client=new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			
			// c:\MyServer 디렉터리 내부의 파일 중 하나의 이름을 입력 받아서 해당 파일 전송
			sc=new Scanner(System.in);
			System.out.println("전송할 파일명 입력 >>> ");
			String filename=sc.nextLine();
			
			dir=new File("C:\\MyClient");
			file=new File(dir, filename);
			
			// 서버로 파일명 보내기
			dos=new DataOutputStream(client.getOutputStream());
			dos.writeUTF(filename);
			
			// 파일내용을 읽어서 서버로 파일내용 보내기
			// 파일내용을 읽기 위해 FileInputStream이 필요
			// 성능을 높이기 위해 BufferedInputStream 사용
			bis=new BufferedInputStream(new FileInputStream(file));
			byte[] b=new byte[1024];
			int length=0;
			while((length=bis.read(b))!=-1) {
				dos.write(b, 0, length);
			}
			System.out.println(file.getAbsolutePath()+" 파일을 서버로 전송했습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos!=null) dos.close();
				if(bis!=null) bis.close();
				if(!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
