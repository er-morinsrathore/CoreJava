package miniProject;
import java.util.ArrayList;

class UserAccount {

    private String username;
    private String password;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addFunds(double amount) {

        balance = balance + amount;

        transactionHistory.add("Added ₹" + amount);

        System.out.println("Updated Balance: ₹" + balance);
        System.out.println("Latest Transaction: "
                + transactionHistory.get(transactionHistory.size() - 1));
    }

    public void spendFunds(double amount) {

        if (amount > balance) {

            System.out.println("Error: Insufficient balance");

        } else {

            balance = balance - amount;

            transactionHistory.add("Spent ₹" + amount);

            System.out.println("Updated Balance: ₹" + balance);
            System.out.println("Latest Transaction: "
                    + transactionHistory.get(transactionHistory.size() - 1));
        }
    }
}

public class Assign_19 {

    static ArrayList<UserAccount> users = new ArrayList<>();

    static void register(String username, String password) {

        for (UserAccount user : users) {

            if (user.getUsername().equals(username)) {
                System.out.println("Username already exists");
                return;
            }
        }

        users.add(new UserAccount(username, password));

        System.out.println("Registration successful");
    }

    static void login(String username, String password) {

        for (UserAccount user : users) {

            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {

                System.out.println("Login successful");
                return;
            }
        }

        System.out.println("Invalid credentials");
    }

    public static void main(String[] args) {

        register("morin123", "pass123");
        register("virat18", "virat123");

        System.out.println();

        login("morin123", "pass123");

        System.out.println();

        UserAccount user = users.get(0);

        user.addFunds(500);
        user.addFunds(1000);

        System.out.println();

        user.spendFunds(400);

        System.out.println();

        user.spendFunds(1500);
    }
}