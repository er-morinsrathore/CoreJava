package Assignment11_;

class InsufficientFundsException5 extends Exception {

    InsufficientFundsException5() {
        super("Insufficient funds for ticket booking");
    }
}

public class Assign_14D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            int userBalance = 100;
	            int ticketPrice = 150;

	            if (userBalance < ticketPrice) {
	                throw new InsufficientFundsException5();
	            }

	            System.out.println("Booking successful!");

	        } catch (InsufficientFundsException5 e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
