/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Portfolio1
*	File: StockHolding.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class StockHolding {
	
	String stockTicker;
	int shares;
	double intPrice;
	double currentPrice;
	
	public StockHolding(String ticker, int numberShares, double initialPrice) {
		stockTicker = ticker;
		shares = numberShares;
		intPrice = initialPrice;
	}
	String getTicker() {
		return stockTicker;
	}
	public int getShares() {
		return shares;
	}
	public double getInitialSharePrice() {
		return intPrice;
	}
	public double getCurrentSharePrice() {
		return currentPrice;
	}
	public double getInitialCost() {
		return shares * intPrice;
	}
	public double getCurrentValue() {
		return shares * currentPrice;
	}
	public double getCurrentProfit() {
		return shares * (currentPrice - intPrice);
	}
	public String toString() {
		return "Stock "  + stockTicker + ", " + shares + " shares bought at " + intPrice + ", " + "Current Price is " + currentPrice;
	}	
	void setCurrentSharePrice(double sharePrice) {
		currentPrice = sharePrice;
	}
}