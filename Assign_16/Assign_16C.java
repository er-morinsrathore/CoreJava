package Assignment11_;

import java.util.ArrayList;

class Prodct {
    String name;
    double price;

    Prodct(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Assign_16C {
	static void calculateTotal(ArrayList<Prodct> cart) {

        double total = 0;

        for (Prodct product : cart) {
            total = total + product.price;
        }

        System.out.println("Total Cart Value: Rs. " + total);
    }
	public static void main(String[] args) {
		 ArrayList<Prodct> cart = new ArrayList<>();

	        cart.add(new Prodct("Redmi Note 12", 12999));
	        cart.add(new Prodct("Boat Headphones", 1999));
	        cart.add(new Prodct("Laptop Bag", 1499));

	        calculateTotal(cart);
	}

}
