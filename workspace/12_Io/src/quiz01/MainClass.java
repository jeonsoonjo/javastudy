package quiz01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// 사용자로부터 국, 영, 수 점수를 입력 받은 뒤
// int[] 배열에 저장하고
// score.dat 파일에 이름, 입력 받은 점수, 평균을 저장하시오
// MainClass2에서 확인

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] subject= {"국어", "영어", "수학"};
		int[] score=new int[subject.length];
		String name="james";
		int total=0;
		double avg=0;
		
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i]+" 입력: ");
			score[i]=sc.nextInt();
			total+=score[i];
		}
		
		avg=total/subject.length;

		// 파일로 보내기
		try (DataOutputStream dos=new DataOutputStream(new FileOutputStream("score.dat"))) {
			dos.writeUTF(name);
			for(int scores:score) {
				dos.writeInt(scores);
			}
			dos.writeDouble(avg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}

}
