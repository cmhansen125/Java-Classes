/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: My Grade 
*	File: MyGrade
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;

public class MyGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Define each constant
		final double LABS_PERCENT = .2;
		final double READING_QUIZ_PERCENT = .15;
		final double MIDTERM_PERCENT = .25;
		final double PROJECT_PERCENT = .15;
		final double FINAL_PERCENT = .25;
		
		double labsAverage;
		double readingQuizAverage;
		double midtermAverage;
		double projectAverage;
		double finalAverage;
		double studentAverage;
		
		//Assign the different inputs
		System.out.print("Enter Labs average in percent:");
		labsAverage = input.nextDouble();
		
		System.out.print("Enter Reading Quiz average in percent:");
		readingQuizAverage = input.nextDouble();
		
		System.out.print("Enter Midterm average in percent:");
		midtermAverage = input.nextDouble();
		
		System.out.print("Enter Project average in percent:");
		projectAverage = input.nextDouble();
		
		System.out.print("Enter Final average in percent:");
		finalAverage = input.nextDouble();
		
		//Calculate students score
		studentAverage = (labsAverage * LABS_PERCENT) + (readingQuizAverage * READING_QUIZ_PERCENT) + (midtermAverage * MIDTERM_PERCENT) + (projectAverage * PROJECT_PERCENT) + (finalAverage * FINAL_PERCENT);
		System.out.print("Your average is : " + studentAverage + "%");
		
	}	


}