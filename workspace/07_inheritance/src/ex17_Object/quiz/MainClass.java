package ex17_Object.quiz;

public class MainClass {

	public static void main(String[] args) {
		
		Score score1=new Score();
		Score score2=new Score(70,80,90); // 국어, 영어, 수학 점수

		score1.setKor(70);
		score1.setEng(80);
		score1.setMat(90);
		
		System.out.println(score1); // [국어: 70, 영어:80, 수학:90]
		System.out.println(score2); // [국어: 70, 영어:80, 수학:90]
		
		if(score1.equals(score2)) {
			System.out.println("성적이 같습니다");
		} else {
			System.out.println("성적이 다릅니다");
		}
		
	}

}
