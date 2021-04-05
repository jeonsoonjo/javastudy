package ex08_static;

// 인스턴스 == 객체

public class Korean {

	// field
	String name; // 인스턴스 필드(인스턴스마다 다르다)
	static final String COUNTRY="한국"; // 클래스 필드라고 부른다(모든 인스턴스가 동일하다)
	
	// 인스턴스가 10개 있다고 가정하면,
	// 메모리에 name은 10개가 있고, country는 1개가 있다
	// 즉, 모든 클래스가 공유하는 메모리를 static 처리한 객체라고 생각하면 된다(누구나 사용할 수 있음)
	// static 처리한 객체는 구분 가능하게 대문자+기울림체로 구분된다
	
}
