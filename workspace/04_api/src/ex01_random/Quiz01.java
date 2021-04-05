package ex01_random;

// 1.임시비밀번호 발급하기
// 영문대문자 + 아라비아숫자 6자리
// 5:5 확률

public class Quiz01 {

	public static void main(String[] args) {
		
		char[] charSet = {
				'0','1','2','3','4','5',
				'6','7','8','9','A','B',
				'C','D','E','F','G','H',
				'I','J','K','L','M','N',
				'O','P','Q','R','S','T',
				'U','V','W','X','Y','Z'
		};
	
		// 방법1. 인덱스를 랜덤하게 생성 -> 0 <= random < charSet.length
		String tempPw=""; // 빈문자열로 초기화
		for(int n=0; n<6; n++) { // 6번 반복을 의미
			int idx=(int)(Math.random()*charSet.length)+0; // 0~35까지의 랜덤 수
			tempPw+=charSet[idx]; // tempPw 누적
		}
		System.out.println(tempPw);
		
		// 방법2. 문자==정수
		// 0~9	48~57
		// A~Z	65~90
		// a~z	97~122
		String tempPw2="";
		for(int n=0; n<6; n++) {
			if(Math.random()<0.5) {
				int arabia=(int)(Math.random()*10)+'0';
				tempPw2+=(char)arabia; // casting
			} else {
				int alphabet=(int)(Math.random()*26)+'A';
				tempPw2+=(char)alphabet;
			}
		}
		System.out.println(tempPw2);
	
	}

}
