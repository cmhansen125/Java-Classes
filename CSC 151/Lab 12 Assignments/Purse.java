/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Britsh Purse
*	File: Purse.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class Purse{
	
	private String purseOwner;
	private int shillingsOwned;
	private int penceOwned;
	private int count;
	
	public Purse() {
		
	}
	
	public Purse(String name, int shillings, int pence) {
		purseOwner = name;
		shillingsOwned = shillings;
		penceOwned = pence;
		}
		
	public String getOwnersName() {
		return purseOwner;
	}
	
	public int getShillings() {
		return shillingsOwned;
	}
		
	public int getPence() {
		return penceOwned;
	}
	
	public void setPurseOwner(String name) {
		purseOwner = name;
	}
	
	public void setShillingsInPurse(int shillings) {
		shillingsOwned += shillings;
		
	}
	
	public void setPenceInPurse(int pence) {
		penceOwned += pence;
		
	}
	
	public String toString() {
		return "This purse has " + shillingsOwned + " shillings and " + penceOwned + " pence.";
	}
	
}