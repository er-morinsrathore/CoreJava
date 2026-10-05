package assignments;

public class InstaProfile {
	 String username;
	    int followers;

	    void increaseFollowers(int count) {
	        followers = followers + count;
	        System.out.println("Updated followers: " + followers);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstaProfile profile = new InstaProfile();

        profile.username = "morin";
        profile.followers = 1000;

        System.out.println("Username: " + profile.username);
        System.out.println("Initial followers: " + profile.followers);

        profile.increaseFollowers(100);
        profile.increaseFollowers(50);
	}
}
//	Class 1: User
//	Methods:
//	1. createUser()
//	2. updateUser()
//
//	Class 2: Post
//	Methods:
//	1. createPost()
//	2. deletePost()
//
//	Class 3: Comment
//	Methods:
//	1. addComment()
//	2. deleteComment()