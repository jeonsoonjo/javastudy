package dataSendReceive;

import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 프로젝트명 : DataSendReceive
 * 파일명 : Client.java
 * 작성자 : 전순조
 * 작성일자 : 2021-04-05
 * 설명 : 네트워크 프로그래밍 구현-클라이언트
 */

public class Client {

	public static void main(String[] args) {
		
		Socket client=null;
		Scanner sc=null;
		BufferedOutputStream bos=null;
		
		try {
			// client 생성 및 접속
			client=new Socket();
			client.connect(new InetSocketAddress("localhost", 1234));
			InetSocketAddress isa=(InetSocketAddress)client.getRemoteSocketAddress();
			
			// server에게 메시지 보내기(sendMsg)
			sc=new Scanner(System.in);
			System.out.println("서버에게 전송할 메시지를 입력하세요 >>> ");
			String sendMsg=sc.nextLine();
			bos=new BufferedOutputStream(client.getOutputStream());
			bos.write(sendMsg.getBytes("UTF-8"));
			bos.flush();
			System.out.println("서버("+isa.getHostName()+")로 \""+sendMsg+"\" 데이터를 전송했습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null) bos.close();
				if(!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();                      
			}
		}

	}

}
