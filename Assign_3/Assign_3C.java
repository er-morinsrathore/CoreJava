package assignments;

import java.util.Scanner;

public class Assign_3C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter cuisine: ");
        String cuisine = sc.nextLine();

        switch (cuisine) {
            case "Indian":
                System.out.println("1. Indian Accent");
                System.out.println("2. Biryani Blues");
                System.out.println("3. Sagar Ratna");
                break;

            case "Chinese":
                System.out.println("1. Mainland China");
                System.out.println("2. Wow! Momo");
                System.out.println("3. Yo! China");
                break;

            case "Italian":
                System.out.println("1. Pizza Hut");
                System.out.println("2. Domino's Pizza");
                System.out.println("3. La Piazza");
                break;

            case "Mexican":
                System.out.println("1. Taco Bell");
                System.out.println("2. Chili's");
                System.out.println("3. California Burrito");
                break;

            default:
                System.out.println("Cuisine Not Found");
        }

        sc.close();
	}

}
