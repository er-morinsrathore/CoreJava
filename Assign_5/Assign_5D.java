package assignments;

public class Assign_5D {

	public static void main(String[] args) {
		
		char[][] seats = {
	            {'A', 'B', 'A', 'A', 'B', 'A'},
	            {'B', 'A', 'A', 'B', 'A', 'A'},
	            {'A', 'A', 'B', 'A', 'B', 'A'},
	            {'B', 'B', 'A', 'A', 'A', 'B'},
	            {'A', 'A', 'A', 'B', 'A', 'A'}
	        };

	        int availableSeats = 0;

	        for (int row = 0; row < 5; row++) {

	            for (int column = 0; column < 6; column++) {

	                if (seats[row][column] == 'A') {
	                    availableSeats++;
	                }
	            }
	        }

	        System.out.println("Number of available seats: " + availableSeats);
	}

}
/*A 2D array can represent a database table where each row represents one record.
Each column can represent a different piece of information about that record.
For example, a Spotify playlist can have columns for song name, artist, and duration.
Each row would contain the details of one song.
For example, one row could contain "Blinding Lights", "The Weeknd", and 200 seconds.*/
