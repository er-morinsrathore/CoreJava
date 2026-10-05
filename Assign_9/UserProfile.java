package assignments8_;

public class UserProfile {
	String name;

    UserProfile(String name) {
        this.name = name;
    }

    void displayProfile() {
        System.out.println("Name: " + name);
    }
}

class InfluencerProfile extends UserProfile {

    int followers;

    InfluencerProfile(String name, int followers) {
        super(name);
        this.followers = followers;
    }

    void displayInfluencer() {
        displayProfile();
        System.out.println("Followers: " + followers);
    }
}

class BrandProfile extends UserProfile {

    String brandName;

    BrandProfile(String name, String brandName) {
        super(name);
        this.brandName = brandName;
    }

    void displayBrand() {
        displayProfile();
        System.out.println("Brand Name: " + brandName);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfluencerProfile influencer =
                new InfluencerProfile("Rahul", 50000);

        BrandProfile brand =
                new BrandProfile("Amit", "TechWorld");

        influencer.displayInfluencer();

        System.out.println();

        brand.displayBrand();
	}

}
