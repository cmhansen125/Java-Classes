/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Rooms and More
*	File: Room.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class Room {
	
	private int area;
	
	public Room(int area) {
		this.area = area;
	}
	
	public int getSquareFeet() {
		return area;
	}
	
	public int getCapacity() {
		return area / 9;
	}
	
	public void setRoomArea(int area) {
		this.area = area;
	}
	
	public String toString() {
		return "The area of the room is " + getSquareFeet() + "and the capacity is " + getCapacity();
	}


}