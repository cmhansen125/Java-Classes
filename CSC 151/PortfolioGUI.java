/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Final Project
*	File: PortfolioGUI.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import javax.swing.*;
public class PortfolioGUI {
	
	public static void main(String[] ags) {
		
		WidgetView wv = new WidgetView();
		
		JTextField jtf1 = new JTextField("Stock");
		JTextField jtf2 = new JTextField("Shares");
		JTextField jtf3 = new JTextField("perShare");
		wv.add(jtf1);
		wv.add(jtf2);
		wv.add(jtf2);
		
	}
}