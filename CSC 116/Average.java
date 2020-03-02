import java.util.*;



public class Average {


	public static void main(String[] args) {


		Scanner console = new Scanner(System.in);



		System.out.print("Number of Scores:  ");


		int numberOfScores = console.nextInt();


		if (numberOfScores >= 1) {

			int sum = 0;

			int max = 0;

			int min = 0;

		
	for(int i = 1; i <= numberOfScores; i++) {

				System.out.print("Enter Score " + i + ":  ");

				int score = console.nextInt();

			
				sum += score;

				if (i == 1) {

					min = score;

					max = score;

				}

				else if (score < min) {

					min = score;

				}

				else if (score > max) {

				max = score;

				}

			}

		double average = (double) sum/numberOfScores;

		System.out.println("Average:  " + average + "");

		}
		
	}

}
		
