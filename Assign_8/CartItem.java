package assignments8_;

public class CartItem {
	int productId;
    int quantity;

    CartItem(int productId) {
        this.productId = productId;
        quantity = 1;
    }

    CartItem(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    CartItem(CartItem item) {
        this.productId = item.productId;
        this.quantity = item.quantity;
    }

    void displayItem() {
        System.out.println("Product ID: " + productId);
        System.out.println("Quantity: " + quantity);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartItem item1 = new CartItem(101);
        CartItem item2 = new CartItem(102, 3);
        CartItem item3 = new CartItem(item2);

        System.out.println("Product ID only:");
        item1.displayItem();

        System.out.println("\nProduct ID and Quantity:");
        item2.displayItem();

        System.out.println("\nCopy of existing CartItem:");
        item3.displayItem();
	}

}
