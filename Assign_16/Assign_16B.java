package Assignment11_;

import java.util.HashSet;

public class Assign_16B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> usernames = new HashSet<>();

	        usernames.add("morin123");
	        usernames.add("virat18");
	        usernames.add("foodie_raj");
	        usernames.add("pizza_lover");
	        usernames.add("zomato_user");
	        usernames.add("virat18");
	        usernames.add("morin123");

	        System.out.println("Unique usernames:");

	        for (String username : usernames) {
	            System.out.println(username);
	        }
	}

}
