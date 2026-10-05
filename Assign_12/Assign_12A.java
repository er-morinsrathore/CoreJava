package Assignment11_;

public class Assign_12A {
	static String maskUsername(String username) {

        String result = "";

        for (int i = 0; i < username.length(); i++) {

            if (i < username.length() - 4) {
                result = result + "*";
            } else {
                result = result + username.charAt(i);
            }
        }

        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String username = "insta_rockstar123";

	        String maskedUsername = maskUsername(username);

	        System.out.println("Original Username: " + username);
	        System.out.println("Masked Username: " + maskedUsername);
	}

}
