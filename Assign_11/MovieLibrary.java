package Assignment11_;

interface Searchable {

    void search(String keyword);
}


public class MovieLibrary implements Searchable{
	String[] movies = {
	        "Inception",
	        "Interstellar",
	        "The Dark Knight",
	        "Avengers",
	        "Avengers Endgame"
	    };

	    public void search(String keyword) {

	        for (int i = 0; i < movies.length; i++) {

	            if (movies[i].toLowerCase().contains(keyword.toLowerCase())) {
	                System.out.println(movies[i]);
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieLibrary library = new MovieLibrary();

        library.search("avengers");
	}

}
//Abstraction hides the implementation details and exposes only the methods that another layer needs.
//In a Zomato-style application, the service layer can use an abstract class as a contract for database operations.
//For example, an abstract FoodOrderService could expose createOrder(), getOrder(), and cancelOrder().
//An interface could define a contract such as OrderRepository with methods saveOrder(), findOrder(), and deleteOrder().
//The service layer calls these methods without needing to know how the database operations are internally implemented.