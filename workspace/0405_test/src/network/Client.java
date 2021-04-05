package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Socket client=null;
		Scanner sc=null;
		BufferedReader br=null;
		PrintWriter out=null;
		
		
		try {
			// client 생성 및 접속
			client=new Socket();
			client.connect(new InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), 4966));
			
			// 문자기반 스트림으로 진행
			out=new PrintWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
			br=new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
			sc=new Scanner(System.in);
			
			while(true) {
				// server에게 메시지 보내기(to Server)
				System.out.println("Server에게 메시지 입력 >>> ");
				String toServer=sc.nextLine();
				if(toServer.equalsIgnoreCase("exit")) {
					System.out.println("Terminate Client!");
					break;
				}
				out.println(toServer);
				out.flush();
				
				// server가 보낸 메시지 받기(from Server)
				String fromServer=br.readLine();
				System.out.println("from Server : "+fromServer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(out!=null) out.close();
				if(!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
