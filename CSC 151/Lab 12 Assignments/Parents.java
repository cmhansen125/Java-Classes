/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Britsh Purse
*	File: Parents.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;
public class Parents {
	
	public static void main(String[] args) {
		
		Purse sophie = new Purse();
		Purse sally = new Purse();
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter 1 for Sophie, 2 for Sally, or 0 to exit: ");
		int child = input.nextInt();
		input.nextLine();
		while ( child > 3 && child < -1) {
			System.out.print("Please Enter from 1 to three. \nEnter 1 for Sophie, 2 for Sally, or 0 to exit: ");
			child = input.nextInt();
			input.nextLine();
		}
		
		while (child != 0) {
			System.out.print("Enter 1 to give pence, 2 to give shillings, 3 to query her purse: ");
			int choice = input.nextInt();
			input.nextLine();
			
			if (child == 1) {
				if(choice == 1) {
					System.out.print("Enter the pence to give: ");
					int amount = input.nextInt();
					input.nextLine();
					sophie.setPenceInPurse(amount);
					System.out.print("\n");
				}
				
				if(choice == 2) {
					System.out.print("Enter the shillings to give: ");
					int amount = input.nextInt();
					input.nextLine();
					sophie.setShillingsInPurse(amount);
					System.out.print("\n");
				}
				
				if(choice == 3) {
					System.out.println(sophie + "\n");
				}
			}
			if (child == 2) {
				if(choice == 1) {
					System.out.print("Enter the pence to give: ");
					int amount = input.nextInt();
					input.nextLine();
					sally.setPenceInPurse(amount);
					System.out.print("\n");
				}
				
				if(choice == 2) {
					System.out.print("Enter the shillings to give: ");
					int amount = input.nextInt();
					input.nextLine();
					sally.setShillingsInPurse(amount);
					System.out.print("\n");
				}
				
				if(choice == 3) {
					System.out.println(sally + "\n");
				}
			
			}
			
			
			System.out.print("Enter 1 for Sophie, 2 for Sally, or 0 to exit: ");
			child = input.nextInt();
			input.nextLine();
		
			while ( child > 3 && child < -1) {
				System.out.println("Please Enter from 1 to three. \nEnter 1 for Sophie, 2 for Sally, or 0 to exit: ");
				child = input.nextInt();
				input.nextLine();
			}
			
		}
		
		
		
		
	}
	
}