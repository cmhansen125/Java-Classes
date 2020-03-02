/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Final Project
*	File: PortfolioGUI.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.ArrayList;
import java.lang.Math.*;
public class PortfolioGUI {
	
	private PortfolioList portfolioOne;
	private StockHolding current;
	private double cash;
	private JButton buy;
	private JButton sell;
	private JLabel welcome;
	private JLabel j1;
	private JLabel warning;
	private JTextField jtf1;
	private JTextField jtf2;
	private JTextField jtf3;
	private JTextArea area;
	
	public PortfolioGUI(String name) {
		
		WidgetView wv = new WidgetView();
		portfolioOne = new PortfolioList();
		
		String userName = name;
		JLabel jname = new JLabel("                                                                                          Welcome " + userName + "                                                                                          ");
		wv.add(jname);
		welcome = new JLabel("                                                                                          Welcome to your portfolio!                                                                                           ");
		wv.add(welcome);
		
		jtf1 = new JTextField(6);
		jtf2 = new JTextField(6);
		jtf3 = new JTextField(6);
		jtf1.setText("Ticker");
		jtf2.setText("Shares");
		jtf3.setText("per Share");
		wv.add(jtf1);
		wv.add(jtf2);
		wv.add(jtf3);
		
		cash = 1000.00;
		j1 = new JLabel("Cash: " + cash);
		wv.add(j1);
		
		buy = new JButton("Buy");
		StockChange bs = new StockChange(buy);
		buy.addActionListener(bs);
		
		sell = new JButton("Sell");
		sell.addActionListener(new StockChange(sell));
		
		wv.add(buy);
		wv.add(sell);
		area = new JTextArea("");
		wv.add(area);
		warning = new JLabel("");
		wv.add(warning);
		
	}
	
	

	class StockChange extends WidgetViewActionEvent {
		
		private JButton myButton;
		
		public StockChange(JButton buttonToModify) {
			myButton = buttonToModify;
		}
		
		public void actionPerformed(ActionEvent e) {
			int stocks;
			myButton = (JButton) e.getSource();
			String buttonText = myButton.getText();
			warning.setText("");
			String ticker = jtf1.getText();
			String stocksNumber = jtf2.getText();
			
			if (stocksNumber.equals("Shares")) {
				stocks = portfolioOne.find(ticker).getShares();
			} else if (stocksNumber.equals("")) {
				stocks = portfolioOne.find(ticker).getShares();
			} else {
				stocks = Integer.parseInt(stocksNumber);
			}
			String price = jtf3.getText();
			double pricePer = Double.parseDouble(price);
			double priceOfStock = stocks * pricePer;
			
			
			
			if (buttonText.equals("Buy")) {
				current = new StockHolding(ticker, stocks, pricePer);
				cash = cash - priceOfStock;
				if (cash >= 0) {
					j1.setText("Cash: " + cash);
					portfolioOne.add(current);
					area.setText(portfolioOne + "\n");
					welcome.setText("                                                                                          Great Buy!                                                                                          ");
				} else {
					warning.setText("You cannot afford that much. Try again!");
					cash = cash + priceOfStock;
				}
				jtf1.setText("Ticker");
				jtf2.setText("Shares");
				jtf3.setText("per Share");
				
			} else {
				current = portfolioOne.find(ticker);
				current.setCurrentSharePrice(pricePer);
				double profit = current.getInitialSharePrice() ;
				
				profit = profit * stocks;
				
				profit = current.getCurrentProfit();
				
				if (profit >= 0) {
					welcome.setText("                                                                                          Great choice! You made: " + profit + "                                                                                       ");
				} else {
					welcome.setText("                                                                                          Sorry.  You lost: " + Math.abs(profit) + "                                                                                       ");
				}
				
				portfolioOne.remove(current.getTicker());
				
				area.setText(portfolioOne + "\n");
				cash = cash + priceOfStock;
				
				j1.setText("Cash: " + cash);
			
				jtf1.setText("Ticker");
				jtf2.setText("Shares");
				jtf3.setText("per Share");
				profit = 0;
			}
		}
	}
	
	
}