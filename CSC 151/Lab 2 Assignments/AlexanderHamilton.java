/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Alexander Hamilton We Love you
*	File: AlexanderHamilton
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;

public class AlexanderHamilton {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SHILLINGS_IN_POUNDS = 20;
		final int PENCE_IN_SHILLINGS = 12;
				
		int pounds;
		int shillings;
		int pence;
		int priceOfPieInPounds;
		int priceOfPieInShillings;
		int priceOfPieInPence;
		int priceOfBeerInPounds;
		int priceOfBeerInShillings;
		int priceOfBeerInPence;
		
		//Assign the different inputs
		System.out.println("Enter the pounds that Jack has:");
		pounds = input.nextInt();
		
		System.out.println("Enter the shillings that Jack has:");
		shillings = input.nextInt();

		System.out.println("Enter the pence that Jack has:");
		pence = input.nextInt();

		System.out.println("Enter the pounds for the pie:");
		priceOfPieInPounds = input.nextInt();
		
		System.out.println("Enter the shillings for the pie:");
		priceOfPieInShillings = input.nextInt();
		
		System.out.println("Enter the pence for the pie:");
		priceOfPieInPence = input.nextInt();
		
		System.out.println("Enter the pounds for the beer:");
		priceOfBeerInPounds = input.nextInt();
		
		System.out.println("Enter the shillings for the beer:");
		priceOfBeerInShillings = input.nextInt();
		
		System.out.println("Enter the pence for the beer:");
		priceOfBeerInPence = input.nextInt();
		
		//Convert all currency into pence for easier computations
		int convertedPence = (pounds * SHILLINGS_IN_POUNDS + shillings) * PENCE_IN_SHILLINGS + pence;
				
		int convertedPriceOfPie = (priceOfPieInPounds * SHILLINGS_IN_POUNDS + priceOfPieInShillings) * PENCE_IN_SHILLINGS + priceOfPieInPence;
					
		int convertedPriceOfBeer = (priceOfBeerInPounds * SHILLINGS_IN_POUNDS + priceOfBeerInShillings) * PENCE_IN_SHILLINGS + priceOfBeerInPence;
				
		//Compute the change that Jack will get back
		int changeRemainingInPence = convertedPence - convertedPriceOfPie - convertedPriceOfBeer;
		
		//Convert the change from pence only into Pence, Shillings, and Pounds
		int changeRemainingInShillings = changeRemainingInPence / PENCE_IN_SHILLINGS;
		changeRemainingInPence = changeRemainingInPence % PENCE_IN_SHILLINGS;
		int changeRemainingInPounds = changeRemainingInShillings / SHILLINGS_IN_POUNDS;
		changeRemainingInShillings = changeRemainingInShillings % SHILLINGS_IN_POUNDS;
		
		//Display final change in different currency
		System.out.println("Jack's change is: " + changeRemainingInPounds + " pounds, " + changeRemainingInShillings + " shillings, " + changeRemainingInPence + " pence.");
	}

}