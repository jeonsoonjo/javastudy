package ex06_set;

import java.util.LinkedHashSet;
import java.util.Set;

// 순서가 있다, 중복 불가능

public class LinkedHashSetMainClass {

	public static void main(String[] args) {
		
		// LinkedHastSet 클래스는 저장된 요소들의 순서가 유지된다
		Set<String> set=new LinkedHashSet<String>();
		
		set.add("html");
		set.add("css");
		set.add("javascript");
		set.add("html");
		set.add("css");
		set.add("javascript"); // 중복 확인하기 위해
		
		for(String s:set) {
			System.out.println(s);
		}
		
	}

}
