/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: StringSet
*	File: StringSet.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.util.ArrayList;
public class StringSet {
	
	private ArrayList<String> list = new ArrayList<String>();
	
	
	public StringSet() {
	}
	
	public void add(String newStr) {
		list.add(newStr);	
	}	
	
	public int size() {
		return list.size();
	}
	public int numChars() {
		int numOfChars = 0;
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			numOfChars += str.length();
		}
		return numOfChars;
	}
	
	public int countStrings(int len) {
		int numOfStringsWithLen = 0;
		int length = len;
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.length() == length) {
				numOfStringsWithLen++;
			}
		}
		return numOfStringsWithLen;
	}
	
	
}