package assignments;

public class Playlist {
	
	 String playlistName;
	    int totalSongs;
	    
	    void displayInfo() {
	        System.out.println("Playlist Name: " + playlistName);
	        System.out.println("Total Songs: " + totalSongs);
	    }

	public static void main(String[] args) {
		Playlist p = new Playlist();

        p.playlistName = "My Favorites";
        p.totalSongs = 25;

        p.displayInfo();
	}

}
