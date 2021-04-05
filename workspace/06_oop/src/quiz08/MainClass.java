package quiz08;

public class MainClass {

	public static void main(String[] args) {
		
		Producer producer=new Producer();
		
		Singer singer1=new Singer("alice",3); // 가수명, 노래 개수
		Singer singer2=new Singer("emily",5);
		
		producer.produce(singer1, new Song("111","장르1"));
		producer.produce(singer1, new Song("222","장르2"));
		producer.produce(singer1, new Song("333","장르3"));
		
		producer.produce(singer2, new Song("",""));
		producer.produce(singer2, new Song("",""));
		producer.produce(singer2, new Song("",""));
		producer.produce(singer2, new Song("",""));
		producer.produce(singer2, new Song("",""));
		
		singer1.info();
		singer2.info();
		
	}

}
