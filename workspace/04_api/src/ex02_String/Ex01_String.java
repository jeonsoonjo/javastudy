package ex02_String;

public class Ex01_String {

	public static void main(String[] args) {
		
		// 1.동일한 문자열 리터럴은 자바에 의해서 최적화 되기 때문에
		// "apple"이 1개만 있음
		String a="apple";
		String b="apple";
		System.out.println(a==b); // true, 참조비교(주소비교)
		
		// 2.new는 무조건 새로 만듬
		// "banana"는 2개가 있음
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c==d); // false

		// 3.문자열의 길이는 length() 메소드
		System.out.println(a.length()); // 5 -> apple
		
		// 4.문자열의 일부를 추출하는 경우에는 substring() 메소드
		// 1) substring(시작인덱스): 시작인덱스부터 끝까지 추출함
		// 2) substring(시작인덱스, 종료인덱스): 시작인덱스 <= 추출한문자열 < 종료인덱스
		// 예제1) apple 에서 app만 추출하기
		System.out.println(a.substring(0,3)); // 0,1,2 종료인덱스는 포함하지 않으니 3까지 씀
		
		// 5.문자열 양 옆의 공백문자(white space)를 제거하려면 trim() 메소드
		String name="      alice    ";
		System.out.println(name.trim().length()); // 5, 양 옆 공백 다 빼고 문자 길이만 남김
		
		// 6.특정 문자를 찾는 경우 indexOf() 메소드
		// 찾고자 하는 문자(문자열)의 인덱스를 반환함
		String str="best of best of best";
		System.out.println("첫 번째 best의 인덱스: "+str.indexOf("best")); // 0, 처음부터 검색
		System.out.println("두 번째 best의 인덱스: "+str.indexOf("best", 4)); // 8, index 4부터 검색
		System.out.println("두 번째 best의 인덱스: "+str.indexOf("best",str.indexOf("best")+1)); // 8,
		System.out.println("찾는 문자가 없으면 "+str.indexOf("v")); // 없으면 -1
	
		// 7.뒤에서부터 검색하는 lastIndexOf() 메소드
		System.out.println("마지막 best의 인덱스: "+str.lastIndexOf("best")); // 16
		
		// 8.기존 문자를 새로운 문자로 변경하는 replace() 메소드
		System.out.println(str.replace("b", "B")); // 3개 모두 대문자로 변경됨
		System.out.println(str.replace("f", "")); // f 지움
		
	}

}
