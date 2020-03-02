/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Command Line Processing
*	File: LineProcessing.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class LineProcessing {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < args.length; i++) {
			
			Integer.parseInt(args[i]);
			
			if (Integer.parseInt(args[i]) % 2 == 0) {
				sum = sum + Integer.parseInt(args[i]);
			} else {
				sum = sum - Integer.parseInt(args[i]);
			}
			
		}
		
		System.out.println("The total is " + sum);
	}

}