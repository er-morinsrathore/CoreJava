package assignments;

public class Assign_5B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matchScores = {{180, 165, 190}, {175, 160, 185}, {200, 170, 195}, {155, 180, 165},
	            {190, 175, 200} };

	        System.out.println("IPL Match Scores");

	        for (int team = 0; team < 5; team++) {

	            System.out.print("Team " + (team + 1) + ": ");

	            for (int match = 0; match < 3; match++) {
	                System.out.print(matchScores[team][match] + "\t");
	            }

	            System.out.println();
	        }
	}

}
