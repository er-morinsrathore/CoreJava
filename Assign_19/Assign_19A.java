package miniProject;

class UserAccounts {

    private String username;
    private String password;
    private double balance;

    UserAccounts(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Assign_19A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAccounts user = new UserAccounts("morin123", "pass123");

        user.setBalance(500);

        System.out.println("Balance: " + user.getBalance());
	}

}
