/**
 * This programs askes the user for an amount of meals, what type of meals (hamburger, chicken sandwich, or fish sandwich) and if they want a combo and if they want to supersize the combo.
 * It then adds up the cost for all the meals and gives the total the user owes
 *
 *@author  Coree Hansen
 * 
 */

import java.util.*;
public class FastFoodPOS {

	public static final int HAMBURGER = 250;
	public static final int CHICKEN_SANDWICH = 300;
	public static final int FISH_SANDWICH = 275;
	public static final int COMBO = 200;
	public static final int SUPERSIZE = 50;

/**
 * This method askes the user for an amount of meals, what type of meals (hamburger, chicken sandwich, or fish sandwich) and if they want a combo and if they want to supersize the combo.
 * It then gives the total the user owes
 * @param args command line arguments (not used)
 */
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("              Welcome to Wolfpack Fast Food POS!");
		System.out.println("When prompted,  please enter the number of meals to be purchased, the type");
		System.out.println("of each meal--H (Hamburger), C (Chicken Sandwich), or F (Fish Sandwich)--and");
		System.out.println("whether or not it is a Combo. If it is a Combo, you will be prompted as to ");
		System.out.println("whether or not it should be Supersize. The total cost of the meals will then be displayed.\n");
		System.out.print("Number of meals to purchase: ");
		int totalInCents = 0;
		int meals = console.nextInt();
		if(meals > 0) {
			for(int i= 1; i<= meals; i++) {
				System.out.print("Hamburger(H), Chicken Sandwich(C), or Fish Sandwich(F)?");
				String meal = console.next();
				char mealtype = meal.charAt(0);
				boolean isCombo = false;
				boolean isSupersize = false;
				if(mealtype=='H' || mealtype=='h' || mealtype=='C' || mealtype=='c' || mealtype=='F' || mealtype=='f') {
					System.out.print("Would you like a combo?:");
					String Combo= console.next();
					if(Combo.startsWith("Y") || Combo.startsWith("y")) {
						isCombo = true;
						System.out.print("Would you like to supersize your combo?: ");
						String Supersize = console.next();
						if(Supersize.startsWith("Y") || Supersize.startsWith("y")) {
							isSupersize = true;
						}
					}
				}
			totalInCents = totalInCents + getMealCost(mealtype,isCombo,isSupersize);
			
			
			}
		double total = totalInCents/100.;
		System.out.printf(" Total: $%.2f\n", total);
		} else {
			System.out.println("Invalid Input");
		}
		
		
	}
	
/**
 * This method takes the information from the main method and calculates the cost on each meal in cents.
 *
 * @param mealtype char representing the type of meal; hamburger, chicken sandwich, or fish sandwich
 * @param isCombo true or false as to whether the person wants a combo
 * @param isSupersize true or false as to whether the person wants to supersize their combo
 * @throws IllegalArgumentException if the mealType is not 'h','H','c','C','f', or 'F' OR if isCombo is false and isSupersize is true.
 * 
 */


	public static int getMealCost(char mealtype,boolean isCombo,boolean isSupersize) {
		
		int mealcost = 0;
		
			if(mealtype=='H' || mealtype=='h') {
			if(isCombo==true) {
				if(isCombo==true && isSupersize==true) {
				mealcost = mealcost + HAMBURGER + COMBO + SUPERSIZE;
				} if(isCombo==true && isSupersize==false) { 
					mealcost = mealcost + HAMBURGER + COMBO;
				} if (isCombo==false && isSupersize==true) {
					throw new IllegalArgumentException("Invalid Input");
				} 
			} else { mealcost = mealcost + HAMBURGER;
			}	
		} else if(mealtype=='C' || mealtype=='c') {
			if(isCombo==true) {
				if(isCombo==true && isSupersize==true) {
				mealcost = mealcost + CHICKEN_SANDWICH + COMBO + SUPERSIZE;
				} if(isCombo==true && isSupersize==false) { 
					mealcost = mealcost + CHICKEN_SANDWICH + COMBO;
				} if (isCombo==false && isSupersize==true) {
					throw new IllegalArgumentException("Invalid Input");
				}
			} else { mealcost = mealcost + CHICKEN_SANDWICH;
			} 
			
		} else if(mealtype=='F' || mealtype=='f') {
			if(isCombo==true) {
				if(isCombo==true && isSupersize==true) {
				mealcost = mealcost + FISH_SANDWICH + COMBO + SUPERSIZE;
				} if(isCombo==true && isSupersize==false) { 
					mealcost = mealcost + FISH_SANDWICH + COMBO;
				} if (isCombo==false && isSupersize==true) {
					throw new IllegalArgumentException("Invalid Input");
			} 
			} else { mealcost = mealcost + FISH_SANDWICH;
			}
			
		} else {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		int totalInCents = mealcost;
		return totalInCents;		
	}	
}
  