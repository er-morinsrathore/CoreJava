package Assignment11_;

public class Assign_12C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder orderId = new StringBuilder("ORD");

        int number = (int) (Math.random() * 900000) + 100000;

        orderId.append(number);

        System.out.println("Order ID: " + orderId);
	}

}
