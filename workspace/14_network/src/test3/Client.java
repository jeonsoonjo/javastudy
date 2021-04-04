package test3;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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
			
			// C:\\MyClient dir에서 보낼 파일명 입력하기
			sc=new Scanner(System.in);
			System.out.println("보낼 파일명 입력 >>> ");
			String filename=sc.nextLine();
			dir=new File("C:\\MyClient");
			file=new File(dir, filename);
			
			// server에 파일명 전송(dataoutput)
			dos=new DataOutputStream(new FileOutputStream(file));
			dos.writeUTF(filename);
			
			// server에 파일내용도 전송(읽고 보내기)
			bis=new BufferedInputStream(client.getInputStream());
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
