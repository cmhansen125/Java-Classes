/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: BBall 3x3
*	File: Game.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;
public class Game {
	
	private static Scanner kybd = new Scanner(System.in);
	
	private static Team fillRoster() {
		
		Team roster = new Team();
		System.out.println("Enter Team member 1:");
		System.out.print("Name: ");
		String nameOne = kybd.nextLine();
		System.out.print("Height: ");
		int heightOne = kybd.nextInt();
		Player playerOne = new Player(nameOne, heightOne);
		kybd.nextLine();
		
		System.out.println("Enter Team member 2:");
		System.out.print("Name: ");
		String nameTwo = kybd.nextLine();
		System.out.print("Height: ");
		int heightTwo = kybd.nextInt();
		Player playerTwo = new Player(nameTwo, heightTwo);
		kybd.nextLine();
		
		System.out.println("Enter Team member 3:");
		System.out.print("Name: ");
		String nameThree = kybd.nextLine();
		System.out.print("Height: ");
		int heightThree = kybd.nextInt();
		Player playerThree = new Player(nameThree, heightThree);
		kybd.nextLine();
	
		roster.add(playerOne);
		roster.add(playerTwo);
		roster.add(playerThree);
		
		return roster;
	}
	
	
	public static void main(String[] args) {
		
		Scanner kybd = new Scanner(System.in);
		
		Team home = new Team();
		Team visitor = new Team();
		
		System.out.println("Enter the Home Team.");
		home = fillRoster();
		
		System.out.println("Enter the Visitor Team");
		visitor = fillRoster();
		
		double homeAverage = home.averageHeight();
		double visitorAverage = visitor.averageHeight();
		
		
		if (homeAverage > visitorAverage) {
			System.out.println("The Home Team is taller!");
			System.out.println("Taller Team Roster: " + home);
			System.out.println("Smaller Team Roster: " + visitor);
		} else if (visitorAverage > homeAverage) {
			System.out.println("The Visitor Team is taller!");
			System.out.println("Taller Team Roster: " + visitor);
			System.out.println("Smaller Team Roster: " + home);
		} else {
			System.out.println("Both Teams are the same height!");
			System.out.println("Team Roster Home: " + home);
			System.out.println("Team Rostor Visitor: " + visitor);
		}
	}
}