/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Event Processing	
*	File: UpDown.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.lang.Math.*;
public class UpDown {
	
	private JButton upDown;
	private JButton downUp;
	private JLabel left;
	private JLabel right;
	
	public UpDown() {
		
		WidgetView wv = new WidgetView();
		
		upDown = new JButton("Go up/down");
		downUp = new JButton("Go down/up");
		left = new JLabel("0");
		right = new JLabel("0");
		
		wv.add(left);
		
		LabelChanger action = new LabelChanger(upDown);
		upDown.addActionListener(action);
		
		downUp.addActionListener(new LabelChanger(downUp));
		
		wv.add(upDown);
		wv.add(downUp);
		
		wv.add(right);
	}
	
	class LabelChanger extends WidgetViewActionEvent {
		
		private JButton myButton;
		private int randomNumber;
		
		public LabelChanger(JButton buttonToModify) {
			myButton = buttonToModify;			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			myButton = (JButton) e.getSource();
			String buttonText = myButton.getText();
			
			if (buttonText.equals("Go up/down")) {
				
				String leftString = left.getText();
				int leftNumber = Integer.parseInt(leftString);
				randomNumber = (int) (Math.random() * 10 + 1);
				left.setText(leftNumber + randomNumber + "");
				
				String rightString = right.getText();
				int rightNumber = Integer.parseInt(rightString);
				randomNumber = (int) (Math.random() * 10 + 1);
				right.setText(rightNumber - randomNumber + "");	
				
			}  else {
				
				String leftString = left.getText();
				int leftNumber = Integer.parseInt(leftString);
				randomNumber = (int) (Math.random() * 10 + 1);
				left.setText(leftNumber - randomNumber + "");
				
				String rightString = right.getText();
				int rightNumber = Integer.parseInt(rightString);
				randomNumber = (int) (Math.random() * 10 + 1);
				right.setText(rightNumber + randomNumber + "");				
			}
		}
	}
	
}

