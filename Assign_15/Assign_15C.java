package Assignment11_;

import java.io.FileOutputStream;
import java.io.IOException;


public class Assign_15C {
	static void addToCart(String item) {

        try {
            FileOutputStream output = new FileOutputStream("cartlog.txt", true);

            String message = "Added: " + item + "\n";

            output.write(message.getBytes());

            output.close();

            System.out.println("Item added to cart");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addToCart("Redmi Note 12 - Rs. 12999");
        addToCart("Boat Headphones - Rs. 1999");
	}

}
