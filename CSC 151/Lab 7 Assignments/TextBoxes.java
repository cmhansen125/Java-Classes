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
public class TextBoxes {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of sides: ");
		int side = input.nextInt();	
		String s = textBoxString(side);
		System.out.println(s);
		
		System.out.print("Enter a number of sides: ");
		side = input.nextInt();	
		System.out.print("Enter a character of your choice: ");
		char bChar = input.next().charAt(0);	
		s = textBoxString(side, bChar);
		System.out.println(s);
		
		System.out.print("Enter a number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter a number of columns: ");
		int cols = input.nextInt();
		s = textBoxString (rows, cols);
		System.out.println(s);
		
		System.out.print("Enter a number of rows: ");
		rows = input.nextInt();
		System.out.print("Enter a number of columns: ");
		cols = input.nextInt();
		System.out.print("Enter a character of your choice: ");
		char c1 = input.next().charAt(0);
		System.out.print("Enter another character of your choice: ");
		char c2 = input.next().charAt(0);
		s = textBoxString (rows, cols, c1, c2);
		System.out.println(s);
		
	}
	
	public static String textBoxString (int side) {
		
		char text = '*';
		String textBox = "";
		for (int i = 0; i < side; i++) {
			textBox = textBox + "\n";
			for (int j = 0; j < side; j++){
				textBox = textBox + text;
			}
		}
		return textBox;
	}
	
	public static String textBoxString(int side, char bChar) {
				
		String textBox = "";
		for (int i = 0; i < side; i++) {
			textBox = textBox + "\n";
			for (int j = 0; j < side; j++){
				textBox = textBox + bChar;
			}
		}
		return textBox;		
	}
	
	public static String textBoxString(int rows, int cols) {
		
		char text = '*';
		String textBox = "";
		for (int i = 0; i < rows; i++) {
			textBox = textBox + "\n";
			for (int j = 0; j < cols; j++){
				textBox = textBox + text;
			}
		}
		return textBox;	
	}	
	public static String textBoxString(int rows, int cols, char c1, char c2){
		
		String textBox = "";
		for (int i = 0; i < rows; i++) {
			textBox = textBox + "\n";
			for (int j = 0; j < cols; j++){
				 if ( (i + j)%2 == 0) {
                  textBox = textBox + c1;
				 } else {
                  textBox = textBox + c2;
				}
			}
		}
		return textBox;	
	
	}
}