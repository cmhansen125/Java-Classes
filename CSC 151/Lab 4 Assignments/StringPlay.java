/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: String Play
*	File: StringPlay.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;

public class StringPlay{
	
	public static void main(String[] args){
		
		// This gets the text that the program will use
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		String aLine = input.nextLine();
		
		// This determines whether the line has whitespace and then tells the user if it does
		String trimedLine = aLine.trim();
		
		if (aLine.equals(trimedLine)) {
			System.out.println("The original String has no leading or trailing whitespace.");
		} else {
			System.out.println("The original String has leading or trailing whitespace.");
		}
		
		// This takes the first 3 letters of the line and switches them with the last 4		
		String firstThree = aLine.substring(0,3);
		String lastFour = aLine.substring(aLine.length()-4,aLine.length());
		String theRest = aLine.substring(3, aLine.length()-4);
		String jumbledLine = lastFour + theRest + firstThree;
		
		System.out.println(jumbledLine);
		
		// This prints out the line in all uppercase
		System.out.println(aLine.toUpperCase());
		
		// This compares the lowercase version to the original version to see if they are the same
		String lowercaseLine = aLine.toLowerCase();
		
		System.out.println(aLine.compareTo(lowercaseLine));
		
		// This determines whether the different halves of the line are the same
		String firstHalf = aLine.substring(0,aLine.length() / 2);
		String secondHalf = aLine.substring(aLine.length() / 2, aLine.length());
		boolean halves = firstHalf.compareTo(secondHalf) == 0;
		
		System.out.println(halves);
		
	}
}