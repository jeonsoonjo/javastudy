package test2;

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
		Scanner sc=null;
		File dir=null;
		File file=null;
		DataOutputStream dos=null;
		BufferedInputStream bis=null;
		
		try {
			// client 생성 및 접속
			client=new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			
			// c:\\MyClient dir 내부 파일 중 보낼 파일명 입력
			sc=new Scanner(System.in);
			System.out.println("보낼 파일명을 입력하세요");
			String filename=sc.nextLine();
			dir=new File("C:\\MyClient");
			file=new File(dir, filename);
			
			// 파일명 server에 전송(dataoutput)
			dos=new DataOutputStream(client.getOutputStream());
			dos.writeUTF(filename);
			
			// 파일 내용을 읽고 server에 전송(fileinput)
			bis=new BufferedInputStream(new FileInputStream(file));
			byte[] b=new byte[1024];
			int length=0;
			while((length=bis.read(b))!=-1) {
				dos.write(b, 0, length);
			}
			System.out.println(file.getAbsolutePath()+" 파일을 전송했습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
				if(dos!=null) dos.close();
				if(!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
