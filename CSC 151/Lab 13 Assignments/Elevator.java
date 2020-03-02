/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Rooms and More
*	File: Elevator.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class Elevator extends Room {
	
	private int currentFloor;
	
	public Elevator (int area) {
		super(area);
	}
	
	public void up(int floors) {
		currentFloor += floors;
	}
	
	public void down(int floors) {
		currentFloor -= floors;
	}
	
	public String toString() {
		return "The area of the elevator is " + getSquareFeet() + "\nThe capacity of the elevator is " + getCapacity() + "\nThe current floor is " + currentFloor;
	}
}