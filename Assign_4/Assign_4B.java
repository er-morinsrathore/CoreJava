package assignments;

public class Assign_4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] orderAmounts = {250.50, 430.00, 180.75, 520.00, 310.25};

        int i = 0;
        double total = 0;

        while (i < orderAmounts.length) {
            total = total + orderAmounts[i];
            i++;
        }

        System.out.println("Total amount spent: ₹" + total);
	}

}
