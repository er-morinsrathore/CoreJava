package assignments;

public class Playlists {
	 int totalSongs = 0;

	    void addSong() {
	        totalSongs++;
	        System.out.println("Song added to playlist");
	    }
	    void checkSongCount() {
	        System.out.println("Total number of songs: " + totalSongs);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playlists p = new Playlists();

        p.addSong();
        p.addSong();
        p.addSong();

        p.checkSongCount();
	}

}
