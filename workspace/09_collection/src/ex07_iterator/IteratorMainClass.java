package ex07_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
	Iterator 인터페이스
	1. Collection(List, Set)을 순회할 경우에 사용한다
	2. "반복자"라고 한다
	3. 순회를 하고자 하는 Collection에 iterator()메소드를 부착해서 생성한다
	4. 인덱스 유무와 상관없이 사용한다
*/

public class IteratorMainClass {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		
		set.add("movie");
		set.add("music");
		set.add("sport");
		
		// set를 순회할 수 있는 Iterator 객체 생성
		// Iterator는 인터페이스이기에 new는 불가능하다
		// Iterator 생성 시 HashSet과 같은 타입으로 지정한다
		Iterator<String> itr=set.iterator();
		
		// hasNext() : 다음 요소가 있으면 true, 없으면 false
		// next() : 다음 요소를 가져온다
		while(itr.hasNext()) { // set에 남아 있는 요소가 있으면
			String str=itr.next();
			System.out.println(str);
		}
		
		// 순서 있다, 중복 가능
		List<String> list=new ArrayList<String>();
		list.add("운동");
		list.add("뜨개질");
		list.add("요리");
		list.add("요리");
		
		Iterator<String> itr2=list.iterator();
		while(itr2.hasNext()) {
			String str2=itr2.next();
			System.out.println(str2);
		}

	}

}
