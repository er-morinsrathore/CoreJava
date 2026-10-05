package assignments;

public class Assign_5C {

	public static void main(String[] args) {

		double[] transactions = {250.50, 450.00, 180.75, 520.00, 310.25,
	            275.00, 600.50, 150.00, 425.75, 350.00};

	        double total = 0;
	        double minimum = transactions[0];
	        double maximum = transactions[0];

	        for (int i = 0; i < transactions.length; i++) {

	            total = total + transactions[i];

	            if (transactions[i] < minimum) {
	                minimum = transactions[i];
	            }

	            if (transactions[i] > maximum) {
	                maximum = transactions[i];
	            }
	        }

	        System.out.println("Total spent: ₹" + total);
	        System.out.println("Minimum order value: ₹" + minimum);
	        System.out.println("Maximum order value: ₹" + maximum);
	    }
	}