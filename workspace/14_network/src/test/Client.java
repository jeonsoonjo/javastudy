package test;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Socket client=null;
		File dir=null;
		File file=null;
		DataOutputStream dos=null;
		BufferedInputStream bis=null;
		Scanner sc=null;
		
		try {
			// client 생성 및 접속
			client=new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			
			// c:\MyServer 디렉터리에 있는 파일 중 하나의 이름을 입력 받아 파일 전송하기
			// 전송할 파일명 입력 받기
			sc=new Scanner(System.in);
			System.out.println("전송할 파일명 입력 >>> ");
			String filename=sc.nextLine();
			dir=new File("C:\\MyServer");
			file=new File(dir, filename);
			
			// server에게 파일 전송 준비
			dos=new DataOutputStream(client.getOutputStream());
			dos.writeUTF(filename);
			
			// 파일 내용을 읽어서 server에게 파일 전송
			bis=new BufferedInputStream(new FileInputStream(file));
			byte[] b=new byte[1024];
			int length=0;
			while((length=bis.read(b))!=-1) {
				dos.write(b, 0, length);
			}
			System.out.println(file.getAbsolutePath()+" 파일을 server로 전송했습니다");
			
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
