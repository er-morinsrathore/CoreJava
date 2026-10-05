package Assignment11_;

class OutOfStockException extends Exception {

    OutOfStockException(String message) {
        super(message);
    }
}


public class Assign_14A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int availableStock = 5;
	        int requestedQuantity = 8;

	        try {
	            if (requestedQuantity > availableStock) {
	                throw new OutOfStockException("Requested quantity is more than available stock");
	            }

	            System.out.println("Product added to cart");

	        } catch (OutOfStockException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
