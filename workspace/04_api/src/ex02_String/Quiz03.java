package ex02_String;

// 3.파일명과 확장자명을 분리하기

public class Quiz03 {

	public static void main(String[] args) {
		
		String fullname="2021-03-10.jpg";
		int idx=fullname.lastIndexOf("."); // 점을 기준으로 나눔
		
		String filename=fullname.substring(0,idx); // 인덱스 0번째부터 idx 까지
		String extname=fullname.substring(idx+1); // idx 기준 다음 인덱스부터 출력

		System.out.println("파일명: "+filename);
		System.out.println("확장자: "+extname);
		
	}

}
