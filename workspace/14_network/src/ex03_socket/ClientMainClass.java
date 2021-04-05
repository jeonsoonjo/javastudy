package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {
		
				// Socket : 클라이언트
				Socket client=null;
				BufferedOutputStream bos=null;
				BufferedInputStream bis=null;
				Scanner sc=null;
				
				try {
					// 서버 접속
					client=new Socket();
					client.connect(new InetSocketAddress("localhost", 4966));
					System.out.println("서버에 접속되었습니다");
					
					// 서버에 메시지 보내기
					sc=new Scanner(System.in);
					System.out.println("서버에 인사말을 건네보세요 >>> ");
					String message=sc.nextLine();
					bos=new BufferedOutputStream(client.getOutputStream());
					bos.write(message.getBytes("UTF-8"));
					bos.flush();
					
					// 서버에게 받은 메시지에 답변하기
					bis=new BufferedInputStream(client.getInputStream());
					byte[] b=new byte[1024];
					int length=bis.read(b);
					String receiveMsg=new String(b, 0, length, "UTF-8");
					System.out.println(receiveMsg);
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if(bos!=null) bos.close();
						if(bis!=null) bis.close();
						if(!client.isClosed()) client.close(); // socket이 열려있으면 닫아라
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			}

}

