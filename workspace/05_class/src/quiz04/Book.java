package quiz04;

// overloading

public class Book {

	// field
	String title;
	String writer;
	int price;
	
	// method
	void set(String t, String w, int p) {
		title = t;
		writer = w;
		price = p;
	} // 첫 번째
	
	void set(String t, String w) {
		set(t,w,0);
	} // 두 번째 -> 첫 번째 로직으로 다 들어감
	
	void set(String t, int p) {
		set(t,"미상",p);
	} // 세 번째
	
	void info() {
		String str="제목: "+title+", 저자: "+writer+", 가격: "+price+"원";
		System.out.println(str);
	}
	
}
