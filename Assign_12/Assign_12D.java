package Assignment11_;
import java.util.Scanner;
public class Assign_12D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter WhatsApp message: ");
	        String message = sc.nextLine();

	        if (message.length() > 30) {
	            System.out.println(message.substring(0, 30) + "...");
	        } else {
	            System.out.println(message);
	        }

	        sc.close();
	}

}
