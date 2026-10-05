package Assignment11_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Assign_17D {
	static void displayTop3(HashMap<String, Integer> users) {

        ArrayList<Map.Entry<String, Integer>> list =
                new ArrayList<>(users.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> a,
                               Map.Entry<String, Integer> b) {

                return b.getValue() - a.getValue();
            }
        });

        System.out.println("Top 3 Instagram Users:");

        for (int i = 0; i < 3 && i < list.size(); i++) {

            Map.Entry<String, Integer> entry = list.get(i);

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> users = new HashMap<>();

	        users.put("virat18", 270000000);
	        users.put("cristiano", 650000000);
	        users.put("leomessi", 500000000);
	        users.put("dhoni", 50000000);
	        users.put("rohit45", 45000000);

	        displayTop3(users);
	}

}
//A HashMap is similar to a database table because it stores data using a key and its corresponding value. 
//For example, in a Zomato order history, the order ID can be the key and the order details can be the value. 
//Just like a database uses a unique ID to find a particular record, a HashMap uses its key to quickly find the associated value.