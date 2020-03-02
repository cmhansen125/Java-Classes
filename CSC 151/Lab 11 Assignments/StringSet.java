/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: StringSet
*	File: StringSet.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class StringSet {
	
	private String[] stringArray = new String[10];
	private int numOfStrings = 0;
	
	public StringSet() {
	}
	
	public void add(String newStr) {
		stringArray[numOfStrings] = newStr;	
		numOfStrings++;
	}	
		
	
	public int size() {
		
		return numOfStrings;
	}
	public int numChars() {
		int numOfChars = 0;
		for (int i = 0; i < numOfStrings; i++) {
			numOfChars += stringArray[i].length();
		}
		return numOfChars;
	}
	public int countStrings(int len) {
		int numOfStringsWithLen = 0;
		int length = len;
		for (int i = 0; i < numOfStrings; i++) {
			if (stringArray[i].length() == length) {
				numOfStringsWithLen++;
			}
		}
		return numOfStringsWithLen;
	}
	
	
}