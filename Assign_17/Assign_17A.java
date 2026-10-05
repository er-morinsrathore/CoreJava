package Assignment11_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assign_17A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Double> orders = new HashMap<>();

	        orders.put("ORD101", 450.50);
	        orders.put("ORD102", 799.00);
	        orders.put("ORD103", 320.75);
	        orders.put("ORD104", 1250.00);
	        orders.put("ORD105", 599.50);

	        Iterator<Map.Entry<String, Double>> itr = orders.entrySet().iterator();

	        while (itr.hasNext()) {

	            Map.Entry<String, Double> entry = itr.next();

	            System.out.println(entry.getKey() + " : Rs. " + entry.getValue());
	        }
	}

}
