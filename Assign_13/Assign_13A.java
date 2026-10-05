package Assignment11_;

public class Assign_13A {
	 static void withdrawAmount(int balance, int amount) throws Exception {
	        if (amount > balance) {
	            throw new Exception("Insufficient balance");
	        }

	        balance = balance - amount;
	        System.out.println("New Balance: " + balance);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            withdrawAmount(5000, 2000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
