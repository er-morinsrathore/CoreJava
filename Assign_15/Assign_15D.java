package Assignment11_;

import java.io.FileInputStream;
import java.io.IOException;

public class Assign_15D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileInputStream input = new FileInputStream("cartlog.txt");

	            int ch;
	            int lines = 0;

	            while ((ch = input.read()) != -1) {

	                if (ch == '\n') {
	                    lines++;
	                }
	            }

	            input.close();

	            System.out.println("Items added to cart: " + lines);

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
//Saving data to a file using FileWriter or FileOutputStream is similar to how applications store information for later use.
//For example, Zomato or Myntra needs to save details such as orders, products, or user activity. 
//A file can be used for simple data storage while learning, whereas real applications generally use a database for storing large amounts of structured data. 
//Both approaches allow data to be saved and retrieved when needed.