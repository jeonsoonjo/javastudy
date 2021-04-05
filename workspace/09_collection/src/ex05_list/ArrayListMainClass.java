package ex05_list;

import java.util.ArrayList;
import java.util.List;

/*
	ArrayList 클래스
	1. List 인터페이스를 구현한 클래스이다
	2. 생성방법
		1) ArrayList<E> list=new ArrayList<E>();
		2) List<E> list=new ArrayList<E>();
 	3. 배열을 구현한 클래스이다. 자동으로 길이를 조정한다
 	4. 장점: 순차적인 접근이 빠르다
 	5. 단점: 중간 위치에 추가/삭제가 느리다
 	6. 즉, 추가/삭제가 자주 일어나지 않는 빠른 시스템이다
*/

public class ArrayListMainClass {

	public static void main(String[] args) {
		
		// 1. 생성
		List<String> list=new ArrayList<String>();

		// 2. 추가
		list.add("브레드");
		list.add("짱구");
		list.add("자두");
		list.add("순대");
		
		// 3. 삭제
		list.remove(0); // 브레드가 삭제됨
		list.remove("짱구");
		
		// 4. 크기 확인(저장되어 있는 데이터의 개수)
		System.out.println("리스트의 길이: "+list.size()); // 자두만 남았기에 길이가 1로 나온다
		
		// 5. 포함 여부 확인
		if(list.contains("둘리")) {
			System.out.println("둘리가 있습니다");
		} else {
			System.out.println("둘리가 없습니다");
		}
		
		// 6. 요소 가져오기
		System.out.println("첫 번째 요소: "+list.get(0));
		System.out.println("마지막 요소: "+list.get(list.size()-1));
		
		// 7. 전체 순회
		// 1) 일반 for문
		int length=list.size(); // size() 메소드 호출을 1번만 진행하도록 변수에 저장해 둔다
		for(int i=0; i<length; i++) { // length는 참조변수이기에 더 빠르다
			// for(int i=0; length=list.size(); i++){} // size()는 메소드이므로 메모리도 차지하고 느리다
			System.out.println((i+1)+"번째 요소: "+list.get(i));
		}
		
		// 2) 향상 for문
		for(String element:list) {
			System.out.println(element);
		}
		
		// 8. 출력
		System.out.println("한 번에 출력: "+list);
		
		// 9. 초기화
		list.clear();
		System.out.println("한 번에 출력: "+list);
		
	}

}
