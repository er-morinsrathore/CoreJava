package assignments8_;

public class Song {
	String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}

class PremiumSong extends Song {

    boolean lyricsAccess;

    PremiumSong(String title, String artist, boolean lyricsAccess) {
        super(title, artist);
        this.lyricsAccess = lyricsAccess;
    }

    void displaySong() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Lyrics Access: " + lyricsAccess);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PremiumSong song = new PremiumSong(
		            "Blinding Lights",
		            "The Weeknd",
		            true
		        );

		        song.displaySong();
	}

}
