package assignments;

public class MovieTicket {
	
	 String movieTitle;
	    String seatNumber;

	    MovieTicket(String movieTitle, String seatNumber) {
	        this.movieTitle = movieTitle;
	        this.seatNumber = seatNumber;
	    }

	    void printTicket() {
	        System.out.println("Movie: " + movieTitle);
	        System.out.println("Seat Number: " + seatNumber);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MovieTicket ticket = new MovieTicket("Inception", "A12");

	        ticket.printTicket();
	}

}
