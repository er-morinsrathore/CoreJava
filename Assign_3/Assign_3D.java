package assignments;

public class Assign_3D {

	public static void main(String[] args) {
		
		int cartTotal = 450;
		String status = (cartTotal >= 500)? "Eligible for Free Delivery"
		        : "Add more items for Free Delivery";
		System.out.println(status);

        // Method 1: Using if-else
        String status1;

        if (cartTotal >= 500) {
            status1 = "Eligible for Free Delivery";
        } else {
            status1 = "Add more items for Free Delivery";
        }

        System.out.println("Using if-else:");
        System.out.println(status1);


        // Method 2: Using nested conditions
        String status2;

        if (cartTotal >= 500) {
            status2 = "Eligible for Free Delivery";
        } else {
            if (cartTotal > 0) {
                status2 = "Add more items for Free Delivery";
            } else {
                status2 = "Cart is empty";
            }
        }

        System.out.println("\nUsing nested conditions:");
        System.out.println(status2);
	}

}
