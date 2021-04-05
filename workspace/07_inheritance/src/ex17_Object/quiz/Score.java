package ex17_Object.quiz;

public class Score {

	// field
	private int kor, eng, mat;

	// constructor
	public Score() {} // score1 생성자
	public Score(int kor, int eng, int mat) { // MainClass에 값이 있다
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// method
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		return "[국어: "+kor+", 영어: "+eng+", 수학: "+mat+"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Score) {
			Score s=(Score)obj; // Score타입으로 캐스팅
			return (kor==s.kor&&eng==s.eng&&mat==s.mat);
		}
		return false;
	}
	
}
