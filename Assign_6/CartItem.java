package assignments;

public class CartItem {
	
	 String itemName;
	    int quantity;

	    void increaseQuantity() {
	        quantity++;
	        System.out.println("Updated Quantity: " + quantity);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartItem item = new CartItem();

        item.itemName = "Wireless Mouse";
        item.quantity = 1;

        System.out.println("Item Name: " + item.itemName);
        System.out.println("Initial Quantity: " + item.quantity);

        item.increaseQuantity();
        item.increaseQuantity();
	}

}
