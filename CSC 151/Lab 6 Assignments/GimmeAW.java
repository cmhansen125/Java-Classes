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

public class GimmeAW {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		String s = "";
		String wAndtLocation = "";
		
		
		System.out.print("Please enter a sentence(to quit, type -1): ");
		s = input.nextLine();
		
		while (!s.equals("-1")) {
			
			for (int i = 0; i < s.length(); i++) {
				
				char letter = s.charAt(i);
				
				
				if (letter == 'w' || letter == 't') {
					
					wAndtLocation = wAndtLocation + i + ", ";
				} 
				
			}
			
			if (wAndtLocation.equals("") && !s.equals("-1")) {
				System.out.println("There are no instances of 'w' or 't' in this sentence.");
			} else {
				wAndtLocation = wAndtLocation.substring(0, wAndtLocation.length() - 2);
				System.out.println("'w' or 't' are at locations " + wAndtLocation);
			}
			
			wAndtLocation = "";
			System.out.print("Please enter a sentence(to quit, type -1): ");
			s = input.nextLine();
		}
		
		System.out.println("Bye!");
	}
			
}
