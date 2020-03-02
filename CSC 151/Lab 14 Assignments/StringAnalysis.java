/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: StringSet Yet Again
*	File: StringAnalysis.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.awt.event.ActionEvent;
import javax.swing.*;
public class StringAnalysis {
	
	private StringSet sSet;
	private JTextField inputStr;
	private JLabel numStr;
	private JLabel numChar;
	
	public StringAnalysis() {
		
		WidgetView wv = new WidgetView();
		sSet = new StringSet();
		JLabel prompt = new JLabel("Push to include String");
		
		inputStr = new JTextField(10);
		
		JButton pushMe = new JButton("Push to include String");
		
		numStr = new JLabel("Number of Strings: " + sSet.size());
		numChar = new JLabel("Number of Characters: " + sSet.numChars());
		
		StringAdder action = new StringAdder(pushMe);
		pushMe.addActionListener(action);
		
		wv.add(prompt);
		wv.add(inputStr);
		wv.add(pushMe);
		wv.add(numStr);
		wv.add(numChar);
		
	}
	
	class StringAdder extends WidgetViewActionEvent {
		
		private JButton myButton;
		
		public StringAdder(JButton buttonToModify) {
			myButton = buttonToModify;			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			sSet.add(inputStr.getText());
			inputStr.setText("");
			
			numStr.setText("Number of Strings: " + sSet.size());
			numChar.setText("Number of Characters: " + sSet.numChars());
			
			}
	}
}