package Assignment11_;

import java.io.FileWriter;
import java.io.IOException;

public class Assign_15A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileWriter writer = new FileWriter("playlist.txt");

            writer.write("Blinding Lights\n");
            writer.write("Perfect\n");
            writer.write("Believer\n");
            writer.write("Shape of You\n");
            writer.write("Kesariya\n");

            writer.close();

            System.out.println("Playlist created successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
