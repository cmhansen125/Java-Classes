/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Midterm
*	File: GuessALetter.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;

public class GuessALetter {
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String solution = generateRandomLetter();
		String guess = "";
		int compare = -1;
		System.out.println(solution);
		System.out.print("Guess a letter between a and z: ");
		while (compare != 0) {
			System.out.print("Enter your one-letter guess: ");
			guess = input.next();
			compare = compareTo(solution, guess);
			if (compare > 0) {
				System.out.println("Go to the right.");
			} else if (compare < 0) {
				System.out.println("Go to the left.");
			} else {
				System.out.println("You got it!");
			}
		}
	}
	
	public static String generateRandomLetter() {
		
		int i = (int)(Math.random() * 26);
		char j = ALPHABET.charAt(i);
		System.out.println(j);
		String k = j + "";
		return k;
	}
	
	public static int compareTo(String solution, String guess) {
		
		int comparision = solution.compareTo(guess);
		return comparision;
	}
}