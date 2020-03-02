/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Final Project
*	File: PortfolioGUIMain.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;
public class PortfolioGUIMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = input.nextLine();
		
		new PortfolioGUI(name);
	}
}




