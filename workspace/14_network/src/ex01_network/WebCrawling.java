package ex01_network;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawling {

	public static void main(String[] args) {
		
		URL url=null;
		HttpURLConnection con=null;
		BufferedReader br=null;
		
		try {
			url=new URL("https://www.daum.net/");
			con=(HttpURLConnection)url.openConnection();
			br=new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line=null;
			while((line=br.readLine())!=null) {
				// line: <a href="https://search.daum.net/search?w=tot&amp;q=%ED%95%AB%EC%83%B7+%ED%95%B4%EC%B2%B4&amp;DA=NPI&amp;rtmaxcoll=NNS" class="link_favorsch @2">핫샷 해체</a>
				// 이와 같이 link_favorsch만 포함된 line이 필요하다
				if(line.contains("link_favorsch @")) {
					// System.out.println(line);
					// String[] temps=line.split(">"); > 포함된 문자까지 빼고 출력해준다
					// System.out.println(temps[1]);
					
					// line.split(">")[1]:윤세아 출연확정</a
					// line.split(">")[1].split("<"):{"윤세아 출연확정", "/a"}
					// line.split(">")[1].split("<")[0]: "윤세아 출연확정"
					System.out.println(line.split(">")[1].split("<")[0]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(con!=null) con.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
