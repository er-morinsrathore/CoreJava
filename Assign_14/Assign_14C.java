package Assignment11_;

class OutOfStockException2 extends Exception {

    OutOfStockException2(String message) {
        super(message);
    }
}

class InsufficientFundsException2 extends Exception {

    InsufficientFundsException2(String message) {
        super(message);
    }
}


public class Assign_14C {
	static void placeOrder(boolean available, int walletBalance, int orderAmount)
            throws OutOfStockException, InsufficientFundsException {

        if (orderAmount < 0) {
            throw new IllegalArgumentException("Order amount cannot be negative");
        }

        if (!available) {
            throw new OutOfStockException("Dish is currently unavailable");
        }

        if (orderAmount > walletBalance) {
            throw new InsufficientFundsException("Insufficient wallet balance");
        }

        System.out.println("Order placed successfully");
    }
	 public static void main(String[] args) {

	        try {
	            placeOrder(false, 500, 300);

	        } catch (OutOfStockException e) {
	            System.out.println("Error: " + e.getMessage());

	        } catch (InsufficientFundsException e) {
	            System.out.println("Error: " + e.getMessage());

	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
