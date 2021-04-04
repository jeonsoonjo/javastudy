package test2;

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
		// client가 보낸 file을 저장할 dir생성
		File dir=new File("C:\\MyServer");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		DataInputStream dis=null;
		File file=null;
		BufferedOutputStream bos=null;
		
		
		
		try {
			// client가 파일명+파일내용을 읽음(datainput)
			dis=new DataInputStream(client.getInputStream());
			String fileame=dis.readUTF();
			
			// client가 보낸 file 저장
			file=new File(dir, fileame);
			bos=new BufferedOutputStream(new FileOutputStream(file));
			byte[] b=new byte[1024];
			int length=0;
			while((length=dis.read(b))!=-1) {
				bos.write(b, 0, length);
			}
			System.out.println(file.getAbsolutePath()+" 파일을 저장했습니다");
			
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
