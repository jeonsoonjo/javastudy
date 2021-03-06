package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket server=null;
		Socket client=null;
		BufferedInputStream bis=null;
		Scanner sc=null;
		BufferedOutputStream bos=null;
		
		try {
			// server 생성 및 접속
			server=new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
			
			while(true) {
				// client 접속처리
				client=server.accept();
				InetSocketAddress isa=(InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("client 접속 : ["+isa.getHostName()+"]");
				
				// client로부터 메시지 받기
				bis=new BufferedInputStream(client.getInputStream());
				byte[] b=new byte[1024];
				int length=bis.read(b);
				String receiveMsg=new String(b, 0, length, "UTF-8");
				System.out.println("Client : "+receiveMsg);
				
				// client에게 답변 메시지 보내기
				sc=new Scanner(System.in);
				System.out.println("client에게 메시지 보내기 >>> ");
				String sendMsg=sc.nextLine();
				bos=new BufferedOutputStream(client.getOutputStream());
				bos.write(sendMsg.getBytes("UTF-8"));
				bos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null) bos.close();
				if(bis!=null) bis.close();
				if(!server.isClosed()) server.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
