package Assignment11_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assign_17C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> products = new HashMap<>();

	        products.put("Redmi Note 12", 12999);
	        products.put("USB Cable", 500);
	        products.put("Laptop Bag", 1499);
	        products.put("Keyboard", 900);
	        products.put("Monitor", 8500);

	        Iterator<Map.Entry<String, Integer>> itr = products.entrySet().iterator();

	        while (itr.hasNext()) {

	            Map.Entry<String, Integer> entry = itr.next();

	            if (entry.getValue() > 1000) {
	                System.out.println(entry.getKey() + " : Rs. " + entry.getValue());
	            }
	        }
	}

}
