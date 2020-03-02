/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Loops
*	File: GimmeAW.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;

public class Averages {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.print("How many students? ");
		int students = input.nextInt();
		String s = "";
		double average = 0;
		double male_scores = 0;
		int male_attendence = 0;
		double female_scores = 0;
		int female_attendence = 0;
		int student_number = 0;
		
		for (int i = 0; i < students; i++) {
			student_number = i + 1;
			System.out.print("Is student " + student_number + " male or female? (m/f) ");
			s = input2.nextLine();
			char student_sex = s.charAt(0);
			System.out.print("What is student " + student_number + "'s average? ");
			
			if(student_sex == 'm' || student_sex == 'M') {
				average = input.nextDouble();
				male_scores = male_scores + average;
				male_attendence = male_attendence + 1;
				
			} else if(student_sex == 'f' || student_sex == 'F') {
				average = input.nextDouble();
				female_scores = female_scores + average;
				female_attendence = female_attendence + 1;
	
			} 
		}
		
		System.out.println("The " + male_attendence + " male students average is " + male_scores/male_attendence);
		System.out.println("The " + female_attendence + " female students average is " + female_scores/female_attendence); 
	}
	
}