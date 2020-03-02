/**
 * @(#)CalorieCalculator.java
 *
 *
 *
 * @author Erik Griffis, Coree Hansen
 * 
 */
import java.util.*;

public class CalorieCalculator {


	public static final double LIGHT_ACTIVITY_FACTOR=1.375;

	/**
	* prompts for gender,weight,height,age
	* calls method to calculate required calories
	* prints the final value
	*/
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.print("Gender (M or F): ");
		String genderstring = console.next();

		char gender = (char)genderString.charAt(0);
		if(gender=='M' || gender=='m' || gender=='f' || gender == 'F'){
			
			System.out.print("Weight (in pounds): ");
			double weight = console.nextDouble();

			if (weight<=0){
				
				System.out.println("Invalid weight");

				System.exit(0);

			}

			System.out.print("Height (inches): ");
			int height = console.nextInt();

			if (height<=0){

				System.out.println("Invalid height");

				System.exit(0);

			}

			System.out.print("Age (years): ");
			int age = console.nextInt();
			if (age<=0){

				System.out.println("Invalid age");

				System.exit(0);

			}
				double calorieReq = calculateCalories(gender,weight,height,age);

			System.out.printf("Daily Calorie Requirement: %.4f\n", calorieReq);
		
	}
		else{

			System.out.println("Invalid gender");

			System.exit(0);

		}


	}

	/**
	* returns total calories needed.
	* @param gender char representing male or female
	* @param weight weight in pounds
	* @param height height in inches
	* @param age age in years
	* @return calorieReq
	* @throws IllegalArgumentException if gender is not 'f','F','m','M',
	*/
	public static double calculateCalories(char gender, double weight, int height, int age) {

		
		double BMR=0;

		if (gender=='m'||gender=='M') {

			BMR=66+(6.23*weight)+(12.7*height)-(6.8*age);

		} else if (gender=='f'||gender=='F') {

			BMR=655+(4.35*weight)+(4.7*height)-(4.7*age);
		} else {

			throw new IllegalArgumentException("Invalid gender");

		}
		double calorieReq = LIGHT_ACTIVITY_FACTOR*BMR;

		return calorieReq;

	}
}
