package quiz01;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class MainClass2 {

	public static void main(String[] args) {
		
		try (DataInputStream dis=new DataInputStream(new FileInputStream("score.dat"))) {
			String name=dis.readUTF();
			System.out.println("이름: "+name);
			int[] score=new int[3];
			for(int i=0; i<score.length; i++) {
				score[i]=dis.readInt();
				System.out.println(score[i]+" ");
			}
			System.out.println();
			double avg=dis.readDouble();
			System.out.println("평균: "+avg);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
