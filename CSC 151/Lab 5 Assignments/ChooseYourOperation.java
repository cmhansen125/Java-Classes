/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: LabGuiStrings 2
*	File: ChooseYourOperation.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import javax.swing.*;

public class ChooseYourOperation {
	
	public static void main(String[] args) {
		
		WidgetView wv = new WidgetView();
		
		int x = (int)(Math.random() * (9-1) + 1);
		int y = (int)(Math.random() * (9-1) + 1);
		
		JLabel j1 = new JLabel("Number 1 is " + x + ".");
		wv.add(j1);
		
		JLabel j2 = new JLabel("Number 2 is " + y + ".");
		wv.add(j2);
		
		JLabel j3 = new JLabel("Enter an operation number: ");
		wv.add(j3);
		
		JTextField jtf1 = new JTextField(10);
		wv.add(jtf1);
		
		JButton jb = new JButton("Press here when you've entered your operation.");
		wv.addAndWait(jb);
		
		String s = jtf1.getText();
		int operation = Integer.parseInt(s);
		
		if (0 < operation && operation < 11 ) {
			int finalanswer = x + y;
			JLabel finalj = new JLabel("Adding x and y equals: " + finalanswer);
			wv.add(finalj);
		} else if (operation % 4 == 0) {
			int finalanswer = x - y;
			JLabel finalj = new JLabel("Subtracting y from x equals: " + finalanswer);
			wv.add(finalj);
		} else if (operation % 5 == 0) {
			int finalanswer = x / y;
			JLabel finalj = new JLabel("Dividing y into x equals: " + finalanswer);
			wv.add(finalj);
		} else if (operation % 2 == 0) {
			double finalanswer =  x / y;
			JLabel finalj = new JLabel("Adding x and y equals: " + finalanswer);
			wv.add(finalj);
		} else {
			int finalanswer = x * y;
			JLabel finalj = new JLabel("Multiplying x and y equals: " + finalanswer);
			wv.add(finalj);
		}
	}
		
}