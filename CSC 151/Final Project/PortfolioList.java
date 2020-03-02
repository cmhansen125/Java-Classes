/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Final Project
*	File: PortfolioList.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/
import java.util.ArrayList;
public class PortfolioList {
	
	private ArrayList<StockHolding> portfolioArray = new ArrayList<StockHolding>();
	
	public PortfolioList(){
		
	}	
	
	public void add(StockHolding stock) {
		portfolioArray.add(stock);
	}
		
	public void remove(String ticker) {
		for (int i = 0; i < portfolioArray.size(); i++) {
			if (portfolioArray.get(i).getTicker().equals(ticker)) 
				portfolioArray.remove(i);
		}
	}
	
	public StockHolding find(String ticker) {
		for (int i = 0; i < portfolioArray.size(); i++) {
			if (portfolioArray.get(i).getTicker().equals(ticker)) 
				return portfolioArray.get(i);
		}
		return null;
	}
	
	public String toString() {
		int numberOfStocks = portfolioArray.size();
		String returnString = "";
		for (int i = 0; i < numberOfStocks; i++) {
			returnString += portfolioArray.get(i) + "\n";
		}
			
		return returnString;
	}
	
}