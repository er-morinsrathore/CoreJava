package assignments;

public class MovieTickets {
	double price;
    static int totalTickets = 0;

    void bookTicket(int amount) {
        price = amount;
        totalTickets++;
    }

    static void checkTotalTickets() {
        System.out.println("Total tickets booked: " + totalTickets);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTickets ticket1 = new MovieTickets();
        MovieTickets ticket2 = new MovieTickets();

        ticket1.bookTicket(250);
        ticket2.bookTicket(300);

        MovieTickets.checkTotalTickets();

	}

}
