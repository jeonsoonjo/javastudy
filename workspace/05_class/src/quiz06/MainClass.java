package quiz06;

public class MainClass {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("홍길동전", 5000);
		Book b3 = new Book("어린왕자", "생텍쥐베리", 10000);
		
		b1.info(); // 제목: 없음, 저자: 미상, 가격: 0원
		b2.info(); // 제목: 홍길동전, 저자: 미상, 가격: 5000원
		b3.info(); // 제목: 어린왕자, 저자: 생텍쥐베리, 가격: 10000원

	}

}
