package assignments;

import java.util.Scanner;

public class Assign_3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 13) {
            System.out.println("Kids Section");
        } else if (age <= 17) {
            System.out.println("Teen Section");
        } else {
            System.out.println("Adult Section");
        }

        sc.close();
	}

}
