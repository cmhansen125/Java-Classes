/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: 'Tis the Season
*	File: TisTheSeason.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;

public class TisTheSeason {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//setting constants for if statements
		final int MONTH_OF_SPRING = 3;
		final int DATE_OF_SPRING = 21;
		
		final int MONTH_OF_SUMMER = 6;
		final int DATE_OF_SUMMER = 20;
		
		final int MONTH_OF_FALL = 9;
		final int DATE_OF_FALL = 21;
		
		final int MONTH_OF_WINTER = 12;
		final int DATE_OF_WINTER = 20;
		
		//declaring variables that will be inputted by scanner
		int month;
		int day;
		String season;
		
		System.out.println("Enter the Month using numbers 1-12: ");
		month = input.nextInt();
		
		System.out.println("Enter the Day using numbers 1-31: ");
		day = input.nextInt();
		
		//determining the season using if statements and imput
		
		if (month < MONTH_OF_SPRING) {
			System.out.println("It's Winter!");
			
		} else if (month == MONTH_OF_SPRING) {
			if (day < DATE_OF_SPRING) {
			System.out.println("It's Winter!");	
			} else {
					System.out.println("It's Spring!");
			}
		} else if (month > MONTH_OF_SPRING && month < MONTH_OF_SUMMER) {
			System.out.println("It's Spring!");
			
		} else if (month == MONTH_OF_SUMMER) {
				if (day < DATE_OF_SUMMER) {
			System.out.println("It's Spring!");	
			
			} else {
					System.out.println("It's Summer!");
			}
		} else if (month > MONTH_OF_SUMMER && month < MONTH_OF_FALL) {
			System.out.println("It's Summer!");
			
		} else if (month == MONTH_OF_FALL) {
				if (day < DATE_OF_FALL) {
			System.out.println("It's Summer!");	
			} else {
					System.out.println("It's Fall!");
			}
		} else if (month > MONTH_OF_FALL && month < MONTH_OF_WINTER) {
			System.out.println("It's Fall!");
			
		} else if (month == MONTH_OF_WINTER) {
				if (day < DATE_OF_SPRING) {
			System.out.println("It's Fall!");	
			} else {
					System.out.println("It's Winter!");
			}
		}				
	}
	
}