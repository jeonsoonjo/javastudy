package quiz06;

// 생성자(constructor)로 만들기

public class Book {
	
	// field
	String title;
	String writer;
	int price;
	
	// constructor
	Book(String title, String writer, int price){
		this.title = title;
		this.writer = writer;
		this.price = price;
	} // 두, 세 번째 때문에 실행되기 때문에 맨 처음에 넣어주는 것이 좋다
	Book(String title, int price){
		this(title, "미상", price);
	}
	Book(){
		this("없음", "미상", 0);
	}
	
	void info() {
		String str="제목: "+title+", 저자: "+writer+", 가격: "+price+"원";
		System.out.println(str);
	}

}
