/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Zap Dashes
*	File: ZapDashes.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;
public class ZapDashes {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write your identification number with 2 dashes included: ");
		String idNumber = input.nextLine();
		
		int d = idNumber.indexOf('-');
		
		String firstPart = idNumber.substring(0,d);
		String secondPart = idNumber.substring(d+1);
		
		int e = secondPart.indexOf('-');
		
		String thirdPart = secondPart.substring(e+1);
		String finalSecondPart = secondPart.substring(0,e);
		
		System.out.println(firstPart + finalSecondPart +thirdPart);	
	}
}