package quiz01;

import java.sql.Date;
import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.title = "어린왕자";
		b.writer = "생텍쥐베리";
		b.price = 10000;
		b.stock = 20;
		Calendar date = Calendar.getInstance();
		date.set(2020, 0, 10);
		long timestamp = date.getTimeInMillis();
		b.pubDate = new Date(timestamp);
		b.isBest = true;
		
		System.out.println(b.title);
		System.out.println(b.writer);
		System.out.println(b.price);
		System.out.println(b.stock);
		System.out.println(b.pubDate);
		System.out.println(b.isBest?"베스트셀러":"일반서적");
		
	}

}
