package assignments;

import java.util.Scanner;

public class Assign_3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter wallet balance: ");
        int balance = sc.nextInt();

        if (balance < 100) {
            System.out.println("Low Balance Warning.");
        } else {
            System.out.println("Sufficient Balance.");
        }

        sc.close();
	}

}
