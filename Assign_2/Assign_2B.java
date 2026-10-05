package assignments;

import java.util.Scanner;

public class Assign_2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Zomato wallet balance: ");
        double balance = sc.nextDouble();

        double cashback = 0;

        if (balance > 500) {
            cashback = balance * 0.10;
        }

        double finalBalance = balance + cashback;

        System.out.println("Cashback: ₹" + cashback);
        System.out.println("Final Balance: ₹" + finalBalance);

        sc.close();
	}

}
