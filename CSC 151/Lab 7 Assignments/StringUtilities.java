/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Static Methods
*	File: StringUtilities.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;

public class StringUtilities {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		String s = input.nextLine();
		System.out.println("This string has leading or trailing whitespace: (true or false)? " + needsTrim(s));
		System.out.println(swap3For4(s));
		System.out.println("This sentance is a palidrome: (true or false)? " + palidrome(s));
		
	}	
	public static boolean needsTrim(String s) {
		String trimedLine = s.trim();
		if (s.equals(trimedLine)) {
			return false;
		} else {
			return true;
		}
	}
	public static String swap3For4(String s) {
		String firstThree = s.substring(0,3);
		String lastFour = s.substring(s.length()-4,s.length());
		String theRest = s.substring(3, s.length()-4);
		String jumbledLine = lastFour + theRest + firstThree;
		
		return jumbledLine;
	}
	public static boolean palidrome(String s) {
		String lowercaseLine = s.toLowerCase();
		String firstHalf = lowercaseLine.substring(0,lowercaseLine.length() / 2);
		String secondHalf = lowercaseLine.substring(lowercaseLine.length() / 2, lowercaseLine.length());
		boolean halves = firstHalf.compareTo(secondHalf) == 0;
		return halves;
	}
}
		
		