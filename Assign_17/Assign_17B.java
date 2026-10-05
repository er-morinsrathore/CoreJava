package Assignment11_;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assign_17B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashMap<String, String> songs = new LinkedHashMap<>();

	        songs.put("Blinding Lights", "The Weeknd");
	        songs.put("Perfect", "Ed Sheeran");
	        songs.put("Believer", "Imagine Dragons");
	        songs.put("Kesariya", "Arijit Singh");

	        for (Map.Entry<String, String> entry : songs.entrySet()) {

	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }
	}

}
