package Assignment11_;

import java.io.FileReader;
import java.io.IOException;

public class Assign_15B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileReader reader = new FileReader("playlist.txt");

	            int ch;
	            int lineNumber = 1;
	            String song = "";

	            while ((ch = reader.read()) != -1) {

	                if (ch == '\n') {
	                    System.out.println(lineNumber + ". " + song);
	                    lineNumber++;
	                    song = "";
	                } else {
	                    song = song + (char) ch;
	                }
	            }

	            if (!song.equals("")) {
	                System.out.println(lineNumber + ". " + song);
	            }

	            reader.close();

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
