package quiz08;

public class Singer {

	// field
	private String name;
	private Song[] songs;
	private int idx;
	
	// constructor
	public Singer(String name, int songCount) {
		this.name=name;
		this.songs=new Song[songCount]; // this를 붙여도 안 붙여도 됨. 구분만 가능
	}
	
	// method
	public void addsong(Song song) {
		if(idx<songs.length) {
		songs[idx++]=song;
		// addSong() 호출마다 idx가 증가하므로, idx는 추가된 노래의 개수이다
		} else {
			System.out.println("더 이상 노래를 추가할 수 없습니다");
		}
	}

	public void info() {
		// 가수명, 노래목록
		System.out.println("가수명: "+name);
		System.out.println("===== 노래 목록 =====");
		/*
			for(int i=0; i<songs.length; i++) {
				if(songs[i] != null) {
					songs[i].info();
				} // 노래목록이 없는 가수가 나올 때를 대비 -> 안 그럼 NullPointerException이 나옴
			}
		*/
		for(int i=0; i<idx; i++) {
			songs[i].info();
		}
	}
	
}
