package test;

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
		File dir=null;
		File file=null;
		DataOutputStream dos=null;
		BufferedInputStream bis=null;
		Scanner sc=null;
		
		try {
			// client �깮�꽦 諛� �젒�냽
			client=new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			
			// c:\MyServer �뵒�젆�꽣由ъ뿉 �엳�뒗 �뙆�씪 以� �븯�굹�쓽 �씠由꾩쓣 �엯�젰 諛쏆븘 �뙆�씪 �쟾�넚�븯湲�
			// �쟾�넚�븷 �뙆�씪紐� �엯�젰 諛쏄린
			sc=new Scanner(System.in);
			System.out.println("�쟾�넚�븷 �뙆�씪紐� �엯�젰 >>> ");
			String filename=sc.nextLine();
			dir=new File("C:\\MyServer");
			file=new File(dir, filename);
			
			// server�뿉寃� �뙆�씪 �쟾�넚 以�鍮�
			dos=new DataOutputStream(client.getOutputStream());
			dos.writeUTF(filename);
			
			// �뙆�씪 �궡�슜�쓣 �씫�뼱�꽌 server�뿉寃� �뙆�씪 �쟾�넚
			bis=new BufferedInputStream(new FileInputStream(file));
			byte[] b=new byte[1024];
			int length=0;
			while((length=bis.read(b))!=-1) {
				dos.write(b, 0, length);
			}
			System.out.println(file.getAbsolutePath()+" �뙆�씪�쓣 server濡� �쟾�넚�뻽�뒿�땲�떎");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos!=null) dos.close();
				if(bis!=null) bis.close();
				if(!client.isClosed()) client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
