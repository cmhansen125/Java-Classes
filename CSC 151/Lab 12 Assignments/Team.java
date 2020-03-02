/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: BBall 3x3
*	File: Team.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Arrays;
public class Team {
	
	private static final int MAX_PLAYERS = 3;
	private Player[] myTeam = new Player[MAX_PLAYERS];
	private int playerPosition = 0;
	
	public Team() {
		
	}
	
	public void add(Player player) {
		if (playerPosition < MAX_PLAYERS) {
			myTeam[playerPosition] = player;
			playerPosition++;
		} 
	}
	
	public Player[] getCurrentTeamMembers() {
		return myTeam;
	}
	
	public int averageHeight() {
		int averageTeamHeight = 0;
		for (int i = 0; i < playerPosition; i++) {
			averageTeamHeight += myTeam[i].getHeight();	
		}
		averageTeamHeight = averageTeamHeight / playerPosition;
		return averageTeamHeight;
	}
	
	public String toString() {
		String returnString = "";
		for (int i = 0; i < playerPosition; i++) {
			returnString += myTeam[i];
		}
			
		return "Number of players: " + playerPosition + " Team: " + returnString;
		
	}
}