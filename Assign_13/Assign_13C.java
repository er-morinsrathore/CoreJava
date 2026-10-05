package Assignment11_;

class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {
        super(message);
    }
}

public class Assign_13C {
		static int balance = 5000;

	    static void sendMoney(int amount) throws InsufficientFundsException {

	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds");
	        }

	        balance = balance - amount;
	        System.out.println("Money sent successfully");
	        System.out.println("Remaining balance: " + balance);
	    }

	    public static void main(String[] args) {

	        try {
	            sendMoney(6000);
	        } catch (InsufficientFundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
