package Assignment11_;

class InsufficientFundsExceptions extends Exception {

    InsufficientFundsExceptions(String message) {
        super(message);
    }
}

class PaymentHandler {

    static int balance = 1000;

    static void processPayment(String amountInput) {

        try {
            int amount = Integer.parseInt(amountInput);

            if (amount > balance) {
                throw new InsufficientFundsExceptions("Insufficient balance");
            }

            balance = balance - amount;
            System.out.println("Payment successful");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid payment amount");

        } catch (InsufficientFundsExceptions e) {
            System.out.println("Error: Insufficient funds");

        } catch (Exception e) {
            System.out.println("Error: Something went wrong");
        }
    }
}

public class Assign_14B {

	public static void main(String[] args) {
		PaymentHandler.processPayment("1500");
	}

}
