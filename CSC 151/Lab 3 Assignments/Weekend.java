/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Did You Ever Have To Make Up Your Mind?
*	File: Weekend.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;

public class Weekend {
	
	public static void main(String[] args) {
		
		// declares variables that will be input by scanner
		boolean parents;
		boolean weather;
		boolean money;
		
		Scanner imput = new Scanner(System.in);
		
		//setting variables using boolean terms
		System.out.print("True or False: Your parents are coming into town this weekend? ");
		parents = imput.nextBoolean();
		
		System.out.print("True or False: The weather is going to be nice this weekend? ");
		weather = imput.nextBoolean();
		
		System.out.print("True or False: You are going to be rich this weekend? ");
		money = imput.nextBoolean();
		
		//determining what to do for the weekend based off chart
		if (parents == true) {
			System.out.println("Go to the cinema!");
		} else if (weather == true && money == true) {
			System.out.println("Go shopping!");
		} else if (weather != true && money != true) {
			System.out.println("Stay in!");
		} else {
			System.out.println("Go to the cinema!");
		}
		
		
	}
	
	
}