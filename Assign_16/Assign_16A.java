package Assignment11_;

import java.util.ArrayList;

class Song {
    String title;
    String artist;
    double duration;

    Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println();
    }
}

public class Assign_16A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Blinding Lights", "The Weeknd", 3.20));
        songs.add(new Song("Perfect", "Ed Sheeran", 4.23));
        songs.add(new Song("Believer", "Imagine Dragons", 3.24));
        songs.add(new Song("Shape of You", "Ed Sheeran", 3.53));
        songs.add(new Song("Kesariya", "Arijit Singh", 4.28));

        for (Song song : songs) {
            song.display();
        }
	}

}
