package assignments;

public class Assign_4E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] scores = {75, 42, 110, 35, 85, 200, 95, 60};

	        for (int i = 0; i < scores.length; i++) {

	            if (scores[i] < 50) {
	                continue;
	            }

	            if (scores[i] == 200) {
	                break;
	            }

	            System.out.println("Score: " + scores[i]);
	        }
	}

}
