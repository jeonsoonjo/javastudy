package quiz10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Student {

	// field
	private String name;
	private int[] scores;
	private double average;
	private char grade; // 학점(A~F)
	private boolean isPass; // 평균 60이상 "합격", 나머지 "불합격"
	
	// constructor
	public Student(String name) {
		this.name=name;
	}

	// method, getter와 setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	// customized 연습
	public void setScores(int scoreCount) {
		// scoreCount만큼 임의의(random) 점수를 scores 배열에 저장
		// 30%의 확률로 0~49 점수가 임의로 생성
		// 40%의 확률로 50~79 점수가 임의로 생성
		// 30%의 확률로 80~100 점수가 임의로 생성
		scores=new int[scoreCount]; // 배열 생성
		for(int i=0; i<scores.length; i++) {
			if(Math.random()<0.3) {
				scores[i]=(int)(Math.random()*50)+0;
			} else if(Math.random()<0.7) {
				scores[i]=(int)(Math.random()*30)+50;
			} else {
				scores[i]=(int)(Math.random()*21)+80;
			}
		}
		// 평균 구하기(향상 for문)
		int total=0;
		for(int score:scores) {
			total+=score;
		}
		double average=(double)total/scores.length; // casting이 1순위, 다음 연산
		setAverage(average);
		// 학점 구하기, 합격 유무
		setPass(true); // 초기화는 합격
		if(average>=90) { setGrade('A');}
		else if(average>=80) {setGrade('B');}
		else if(average>=70) {setGrade('C');}
		else if(average>=60) {setGrade('D');}
		else {setGrade('F'); setPass(false);}
	}
	
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public boolean isPass() {
		return isPass;
	}
	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}
	
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("점수 : "+Arrays.toString(scores)); // [50, 72, 95, 84, 60]
		System.out.println("평균 : "+new DecimalFormat("0.00").format(average)+"점"); // 소수 2자리만 출력(decimalformat사용)
		System.out.println("합점 : "+grade+"학점");
		System.out.println(isPass?"합격":"불합격");
	}

}
