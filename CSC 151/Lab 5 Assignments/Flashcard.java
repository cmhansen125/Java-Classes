/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: LabGuiStrings 1
*	File: Flashcard.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import javax.swing.*;

public class Flashcard {
	
	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * (9 - 1) + 1);
		int number2 = (int)(Math.random() * (9 - 1) + 1);
		int answer = number1 * number2;
		int enteredanswer;
	
		WidgetView wv = new WidgetView();
	
		JLabel j1 = new JLabel("What is " + number1 + " times " + number2 + "?");
		wv.add(j1);
	
		JTextField jtf1 = new JTextField(10);
		wv.add(jtf1);
		
		JButton jb = new JButton("Click this button when you enter your answer!");
		wv.addAndWait(jb);
	
		String s = jtf1.getText();
		enteredanswer = Integer.parseInt(s);
	
		if (answer == enteredanswer) {
			JLabel j2 = new JLabel("That's right!  Good job!");
			wv.add(j2);	
		} else {
			JLabel j2 = new JLabel("Sorry, the correct answer is " + answer);
			wv.add(j2);
		}
	}
		
}