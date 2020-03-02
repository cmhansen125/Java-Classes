/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: LinearPerson	
*	File: LinearPersonPair.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class LinearPersonPair {
	
	public static void main(String[] args) {
		
		LinearPerson sophie = new LinearPerson();
		sophie.turn();
		sophie.move();
		sophie.move();
		sophie.turn();
		sophie.move();
		System.out.println(sophie.position);
		
		LinearPerson anna = new LinearPerson(3);
		anna.move();
		anna.turn();
		anna.move();
		anna.turn();
		anna.move();
		System.out.println(anna.position);

		
	}
}	
	
class LinearPerson {
	
	int position;
	boolean direction;
		
	LinearPerson() {
		position = 0;
		direction = true;
	}
		
	LinearPerson(int newPosition){
		position = newPosition;
		direction = true;
	}
	
	public void turn() {
		if (direction) {
			direction = false;
		} else {
			direction = true;
		}
		
	}
	
	public void move() {
		if (direction){
			position++;
		} else {
			position--;
		}
	}
	
	public int getPosition() {
		
		return position;
	}
		
	
}