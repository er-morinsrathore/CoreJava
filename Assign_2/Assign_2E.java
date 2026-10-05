package assignments;

public class Assign_2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rating = 4.7f;

        // Explicit casting: float to int
        int intRating = (int) rating;

        // Implicit casting: int to double
        double doubleRating = intRating;

        System.out.println("Original float rating: " + rating);
        System.out.println("After converting to int: " + intRating);
        System.out.println("After converting int to double: " + doubleRating);
	}

}
