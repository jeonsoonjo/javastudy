package dataSendReceive;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 프로젝트명 : DataSendReceive
 * 파일명 : Server.java
 * 작성자 : 전순조
 * 작성일자 : 2021-04-05
 * 설명 : 네트워크 프로그래밍 구현-서버
 */

public class Server {

	public static void main(String[] args) {
		
		ServerSocket server=null;
		Socket client=null;
		BufferedInputStream bis=null;
		
		try {
			// server 생성 및 접속
			server=new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 1234));
			
			while(true) {
				// client 접속처리
				client=server.accept();
				InetSocketAddress isa=(InetSocketAddress)client.getRemoteSocketAddress();
				
				// client로부터 메시지 받기(receiveMsg)
				bis=new BufferedInputStream(client.getInputStream());
				byte[] b=new byte[1024];
				int length=bis.read(b);
				String receiveMsg=new String(b, 0, length, "UTF-8");
				System.out.println("Client("+isa.getHostName()+")로부터 \""+receiveMsg+"\" 데이터를 받았습니다");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
				if(!server.isClosed()) server.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
