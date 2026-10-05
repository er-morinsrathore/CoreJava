package assignments;

public class Assign_4D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int week = 1; week <= 4; week++) {

            System.out.println("Week " + week);

            for (int day = 1; day <= 7; day++) {

                int likes = (int) (Math.random() * 1000);

                System.out.println("Day " + day + ": " + likes + " likes");
            }

            System.out.println();
        }
	}

}
