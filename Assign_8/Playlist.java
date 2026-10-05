package assignments8_;

public class Playlist {
	String name;
    String description;

    Playlist() {
        this("My Playlist");
    }

    Playlist(String name) {
        this(name, "No description");
    }

    Playlist(String name, String description) {
        this.name = name;
        this.description = description;
    }

    void displayInfo() {
        System.out.println("Playlist Name: " + name);
        System.out.println("Description: " + description);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playlist p1 = new Playlist();
        Playlist p2 = new Playlist("Workout Songs");
        Playlist p3 = new Playlist("Chill Songs", "Songs for relaxing");

        p1.displayInfo();

        System.out.println();

        p2.displayInfo();

        System.out.println();

        p3.displayInfo();
	}

}
