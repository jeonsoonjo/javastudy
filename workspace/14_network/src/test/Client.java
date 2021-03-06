package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Socket client=null;
		Scanner sc=null;
		BufferedOutputStream bos=null;
		BufferedInputStream bis=null;
		
		try {
			// client 생성 및 접속
			client=new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			
			// server에게 메시지 보내기
			sc=new Scanner(System.in);
			System.out.println("server에게 메시지 보내기 >>> ");
			String msg=sc.nextLine();
			bos=new BufferedOutputStream(client.getOutputStream());
			bos.write(msg.getBytes("UTF-8"));
			bos.flush();
			
			// server로부터 답변 메시지 받기
			bis=new BufferedInputStream(client.getInputStream());
			byte[] b=new byte[1024];
			int length=bis.read(b);
			String receiveMsg=new String(b, 0, length, "UTF-8");
			System.out.println("Server : "+receiveMsg);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
				if(bos!=null) bos.close();
				if(!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();                      
			}
		}

	}

}
