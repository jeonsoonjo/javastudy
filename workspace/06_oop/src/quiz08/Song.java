package quiz08;

public class Song {

	// field
	private String title;
	private String genre;
	
	// constructor
	public Song(String title, String genre) {
		this.title=title;
		this.genre=genre;
	}
	
	// method
	public void info() {
		System.out.println(title+"("+genre+")");
	}
	
}
