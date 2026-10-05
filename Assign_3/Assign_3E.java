package assignments;

public class Assign_3E {
	static void filterByMinRating(int[] ratings, int minRating) {

        for (int i = 0; i < ratings.length; i++) {

            if (ratings[i] >= minRating) {
                System.out.println(ratings[i]);
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] ratings = {2, 4, 5, 3, 4, 1, 5};
	        int minRating = 4;

	        System.out.println("Ratings greater than or equal to " + minRating + ":");

	        filterByMinRating(ratings, minRating);
	}

}
