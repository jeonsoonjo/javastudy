package quiz03;

public class Singer {

	// field
	private String name;
	private Song song; // private Song[] songs;
	
	// constructor
	public Singer(String name) {
		this.name=name;
	}
	
	// method(getter,setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	
	public void info() {
		System.out.println(name);
		song.info();
	}

}
