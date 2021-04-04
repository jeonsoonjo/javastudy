package ex01_network;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {
		
		// 원격 호스트
		String host="www.naver.com";
		
		// 인터넷 주소를 처리하는 InetAddress
		InetAddress ia=null;
		try {
			ia=InetAddress.getByName(host);
			System.out.println(ia);
			System.out.println(ia.getHostName());
			System.out.println(ia.getHostAddress());
			
			// 여러개일 경우, 배열에 저장해서 반복문을 통해 확인한다
			InetAddress[] ias=InetAddress.getAllByName(host);
			for(InetAddress i:ias) {
				System.out.println(i.getHostName()+"의 ip 주소: "+i.getHostAddress());
			}
			
			byte[] byteIp=ia.getAddress(); // [-33, -126, -61, 95]
			System.out.println(Arrays.toString(byteIp));
			
			// 예제) [125, 209, 222, 142] 이런 IP 주소로 나타내기
			short[] ip=new short[byteIp.length];
			for(int i=0; i<ip.length; i++) {
				ip[i]=(short)(byteIp[i]<0?byteIp[i]+256:byteIp[i]); // 0보다 작은 값들은 +256을 해준다
			}
			System.out.println(Arrays.toString(ip));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
