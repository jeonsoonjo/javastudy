package ex06_set;

import java.util.HashSet;
import java.util.Set;

/*
	HashSet 클래스
	1. Set 인터페이스를 구현한 클래스
	2. 기본 특징
		1) 인덱스가 없다(순서가 없다)
		2) 중복 저장이 불가능하다
	3. 기본적인 사용법은 List와 같지만 인덱스가 없음에 주의한다(일반 for문 사용 불가, 향상 for문 사용 가능)
	4. 순서가 없다
*/

public class HashSetMainClass {

	public static void main(String[] args) {
		
		// HashSet 배열 생성
		Set<String> set=new HashSet<String>();
		
		// 추가
		set.add("java");
		set.add("java");
		set.add("jsp");
		set.add("jsp");
		set.add("spring");
		set.add("spring");
		
		// 요소의 크기 확인
		System.out.println("요소 개수: "+set.size());
		
		// 순회(향상 for문 사용)
		for(String s:set) {
			System.out.println(s);
		}
		
	}

}
