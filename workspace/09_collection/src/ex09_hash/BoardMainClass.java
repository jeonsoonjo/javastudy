package ex09_hash;

import java.util.HashSet;
import java.util.Set;

public class BoardMainClass {

	public static void main(String[] args) {
		
		Board board1=new Board(1000, "공지", "관리자");
		Board board2=new Board(1000, "공지", "관리자");
		Board board3=new Board(1000, "공지", "관리자");

		Set<Board> set=new HashSet<Board>();
		set.add(board1);
		set.add(board2);
		set.add(board3);
		
		System.out.println(set);
		// 실행결과
		// [ex09_hash.Board@22f71333, ex09_hash.Board@13969fbe, ex09_hash.Board@6cd8737]
		// 자바는 해시코드 개념을 잘 모른다.. 무조건 저장하기에 주소지가 다 다른 곳에 저장되어 있음
		// hashCode() 메소드로 오버라이드해야 함
		
	}

}
