package assignments;

import java.util.Scanner;

public class Assign_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of unread messages: ");
        int messages = sc.nextInt();

        String result = (messages == 0) ? "No new messages": (messages <= 10) ? "Few messages"
                : "Too many messages";

        System.out.println(result);

        sc.close();
	}

}
