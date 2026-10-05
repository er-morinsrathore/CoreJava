package Assignment11_;

public class Assign_13D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000;
        int[] transactions = {1000, 2000, 6000, 500, 7000};

        for (int amount : transactions) {

            try {
                if (amount > balance) {
                    throw new Exception("Insufficient balance");
                }

                balance = balance - amount;
                System.out.println("Transaction of " + amount + " successful");
                System.out.println("Remaining balance: " + balance);

            } catch (Exception e) {
                System.out.println("Transaction of " + amount + " failed");
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Transaction complete");
            }
        }
	}

}
