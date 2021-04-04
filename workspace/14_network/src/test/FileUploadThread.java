package test;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.Socket;

public class FileUploadThread extends Thread {

	// field
	private Socket client;

	// method
	public Socket getClient() {
		return client;
	}

	public void setClient(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		// client가 보낸 파일을 저장할 디렉토리 생성
		File dir=new File("C:\\MySoonjo");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		DataInputStream dis=null;
		File file=null;
		BufferedOutputStream bos=null;
		
		try {
			// client가 보낸 파일명 + 파일내용 읽기
			dis=new DataInputStream(client.getInputStream());
			String filename=dis.readUTF();
			
			// 지정해둔 디렉토리에 저장하기
			file=new File(dir, filename);
			bos=new BufferedOutputStream(new FileOutputStream(file));
			byte[] b=new byte[1024];
			int length=0;
			while((length=dis.read(b))!=-1) {
				bos.write(b, 0, length);
			}
			System.out.println(file.getAbsolutePath()+" 파일이 server에 저장되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null) bos.close();
				if(dis!=null) dis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
