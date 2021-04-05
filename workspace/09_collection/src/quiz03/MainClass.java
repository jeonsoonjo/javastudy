package quiz03;

import java.util.HashSet;
import java.util.Set;

// 로또 번호 6개 HashSet에 저장하기

public class MainClass {

	public static void main(String[] args) {
		
		// 생성
		Set<Integer> lotto=new HashSet<Integer>();
		
		// 번호 생성
		while(lotto.size()!=6) { // 로또의 크기가 6이 아닐때까지, 어차피 중복 저장은 불가
			lotto.add((int)(Math.random()*45)+1);			
		}
		
		// 순회
		System.out.println(lotto);
		
	}

}
