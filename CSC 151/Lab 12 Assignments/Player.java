/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: BBall 3x3
*	File: Player.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class Player {
	
	private String playerName;
	private int playerHeight;
	
	public Player() {
		
	}
	
	public Player(String name, int height) {
		playerName = name;
		playerHeight = height;		
	}
	
	public String getName() {
		return playerName;
	}
	
	public int getHeight() {
		return playerHeight;
	}
	
	public void setPlayerName(String name) {
		playerName = name;
	}
	
	public void setPlayerHeight(int height) {
		playerHeight = height;
	}
	
	public String toString() {
		return "(Player: " + playerName + ", Height: " + playerHeight + ") ";
	}
	
}