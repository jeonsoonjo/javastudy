package test4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket server=null;
		Socket client=null;
		Scanner sc=null;
		BufferedReader br=null;
		PrintWriter out=null;
		
		try {
			// server 생성 및 접속
			server=new ServerSocket();
			server.bind(new InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), 4966));
			
			// client 접속처리
			client=server.accept();
			InetSocketAddress isa=(InetSocketAddress)client.getRemoteSocketAddress();
			System.out.println("접속 client : ["+isa.getHostString()+"]");
			
			// 문자기반 스트림으로 진행하기
			br=new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
			out=new PrintWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
			sc=new Scanner(System.in);
			
			while(true) {
				// client가 보낸 메시지 받기(from client)
				String fromClient=null;
				fromClient=br.readLine();
				if(fromClient==null) {
					System.out.println("Disconnect by Client");
					break;
				}
				System.out.println("From Client : "+fromClient);
				
				// client에게 답변 메시지 보내기(to client)
				System.out.println("To client >>> ");
				String toClient=sc.nextLine();
				out.println(toClient);
				out.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null) out.close();
				if(br!=null) br.close();
				if(!server.isClosed()) server.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
