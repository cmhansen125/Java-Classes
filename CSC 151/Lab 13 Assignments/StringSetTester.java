/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: StringSet
*	File: StringSetTester.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;
public class StringSetTester {
	
	public static void main(String[] args) {
		
		Scanner kybd = new Scanner(System.in);
		StringSet firstSet = new StringSet();
		
		System.out.print("How many Strings will you enter? ");
		int numOfStr = kybd.nextInt();
		kybd.nextLine();
		
		for (int i = 0; i < numOfStr; i++) {
			System.out.print("Enter a string: ");
			String nextString = kybd.nextLine();
			firstSet.add(nextString);
			
		}
		
		System.out.println("The number of Strings in this object is: " + firstSet.size());
		System.out.println("The number of characters in this object is: " + firstSet.numChars());
		System.out.println("The number of Strings in this object that are 5 characters long is: " + firstSet.countStrings(5));
		System.out.println("The number of Strings in this object that are 7 characters long is: " + firstSet.countStrings(7));
	
	}
}