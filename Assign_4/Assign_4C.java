package assignments;

import java.util.Scanner;

public class Assign_4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String artist;
        int count = 0;

        do {
            System.out.print("Enter your favorite music artist (type 'exit' to stop): ");
            artist = sc.nextLine();

            if (!artist.equalsIgnoreCase("exit")) {
                count++;
            }

        } while (!artist.equalsIgnoreCase("exit"));

        System.out.println("Number of artists entered: " + count);

        sc.close();
    }
}
