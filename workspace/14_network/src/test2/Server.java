package test2;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket server=null;
		Socket client=null;
		
		try {
			// server 생성 및 접속
			server=new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
			
			while(true) {
				// client 접속처리
				client=server.accept();
				
				// client가 server에게 file 전송
				FileUploadThread upload=new FileUploadThread(); // thread 생성
				upload.setClient(client);
				upload.start();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(!server.isClosed()) server.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
