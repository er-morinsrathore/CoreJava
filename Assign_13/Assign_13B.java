package Assignment11_;
import java.util.Scanner;
public class Assign_13B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter wallet balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();

        try {
            if (amount > balance) {
                throw new Exception("Purchase amount exceeds wallet balance");
            }

            balance = balance - amount;
            System.out.println("Purchase successful");
            System.out.println("Remaining balance: " + balance);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
	}

}
