package assignments8_;

public class Registration {
	 void registerUser(String email) {
	        System.out.println("Registered with email: " + email);
	    }

	    void registerUser(String email, String password) {
	        System.out.println("Registered with email and password: " + email);
	    }

	    void registerUser(String email, String password, String phoneNumber) {
	        System.out.println("Registered with email, password and phone number: " + email);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration r = new Registration();

        r.registerUser("user@gmail.com");

        r.registerUser("user@gmail.com", "12345");

        r.registerUser("user@gmail.com", "12345", "9876543210");
	}

}
