package assignments8_;

public class Movie {
	void addReview(int rating) {
        System.out.println("Rating: " + rating);
    }

    void addReview(int rating, String comment) {
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + comment);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Movie movie = new Movie();

	        movie.addReview(4);
	        movie.addReview(5, "Excellent movie!");
	}

}
