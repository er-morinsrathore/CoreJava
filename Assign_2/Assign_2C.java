package assignments;

import java.util.Scanner;

public class Assign_2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        System.out.print("Do you have a payment method linked? (true/false): ");
        boolean hasPaymentMethod = sc.nextBoolean();

        if (userAge >= 18 && hasPaymentMethod) {
            System.out.println("Booking allowed");
        }

        sc.close();
	}

}
