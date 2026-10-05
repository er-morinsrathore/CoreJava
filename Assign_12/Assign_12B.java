package Assignment11_;
import java.util.Scanner;
public class Assign_12B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first song title: ");
        String song1 = sc.nextLine();

        System.out.print("Enter second song title: ");
        String song2 = sc.nextLine();

        if (song1.equals(song2)) {
            System.out.println("Both song titles are exactly the same.");
        } else {
            System.out.println("Song titles are different.");
        }

        int result = song1.compareTo(song2);

        if (result == 0) {
            System.out.println("Both titles are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("First song title comes before the second.");
        } else {
            System.out.println("First song title comes after the second.");
        }

        sc.close();
    }
}
