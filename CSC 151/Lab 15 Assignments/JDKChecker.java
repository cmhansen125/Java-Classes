/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Available JDK
*	File: JDKChecker.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.Scanner;
public class JDKChecker {
	
	public static void main(String[] args) {
		
		String urlString = "http://www.oracle.com/technetwork/java/javase/downloads/index.html";
		
		try {
			java.net.URL url = new java.net.URL(urlString);
		
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.nextLine();
				if (line.contains("Java SE 8u")) {
					
					String subLine = line.substring(555, 560);
					
					System.out.println(subLine);
					System.exit(1);
				}
			}
		} catch (java.net.MalformedURLException ex) {
			ex.printStackTrace();
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: No such file.");
		}
		
		
		
	}
	
	
}