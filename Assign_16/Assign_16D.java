package Assignment11_;

import java.util.HashMap;
import java.util.Map;

public class Assign_16D {

	public static void main(String[] args) {

		HashMap<String, Integer> followers = new HashMap<>();

        followers.put("virat18", 270000000);
        followers.put("cristiano", 650000000);
        followers.put("leomessi", 500000000);
        followers.put("dhoni", 50000000);
        followers.put("rohit45", 45000000);

        int maxFollowers = 0;

        for (Map.Entry<String, Integer> entry : followers.entrySet()) {

            if (entry.getValue() > maxFollowers) {
                maxFollowers = entry.getValue();
            }
        }

        System.out.println("Username(s) with highest followers:");

        for (Map.Entry<String, Integer> entry : followers.entrySet()) {

            if (entry.getValue() == maxFollowers) {
                System.out.println(entry.getKey());
            }
        }
	}

}
//Collections like ArrayList and HashSet help applications such as Spotify or BookMyShow temporarily store songs, movies, or users in memory. 
//The application can work with this data quickly before storing or retrieving the permanent data from a database.