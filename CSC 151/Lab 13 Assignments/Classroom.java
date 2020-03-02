/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Rooms and More
*	File: Classroom.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class Classroom extends Room {
	
	private int chairs;
	
	public Classroom(int area) {
		super(area);
	}
	
	public Classroom(int numberChairs, int area){
		super(area);
		this.chairs = numberChairs;
	}
	
	public int getNumberOfChairs() {
		return chairs;
	}
	
	public void setNumberOfChairs(int chairs) {
		this.chairs = chairs;
	}
	
	@Override
	public int getCapacity() {
		return getNumberOfChairs();
	}
	
	public String toString() {
		return "The area of the Classroom is " + getSquareFeet() + "\nThe number of chairs in the room is " + getNumberOfChairs();
	}
	
}