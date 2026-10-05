package assignments8_;

public class AppUser {
	String name;

    AppUser(String name) {
        this.name = name;
    }
}

class VerifiedUser extends AppUser {

    VerifiedUser(String name) {
        super(name);
    }
}

class CelebrityUser extends VerifiedUser {

    CelebrityUser(String name) {
        super(name);
        System.out.println("Welcome, " + name + "!");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CelebrityUser user = new CelebrityUser("Virat Kohli");
	}	

}
