/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Portfolio1
*	File: PortfolioDriver.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edust
*/

import java.util.ArrayList;
public class PortfolioDriver {

	public static void main(String[] args) {
	
		PortfolioList firstList = new PortfolioList();
		PortfolioList secondList = new PortfolioList();
		
		StockHolding stockOne = new StockHolding("APPL", 1, 10);
		stockOne.setCurrentSharePrice(11);
		firstList.add(stockOne);
		
		StockHolding stockTwo = new StockHolding("GOOG", 2, 20);
		stockTwo.setCurrentSharePrice(21);
		firstList.add(stockTwo);
		
		
		StockHolding stockOneSecond = new StockHolding("SMSG", 3, 30);
		stockOneSecond.setCurrentSharePrice(31);
		secondList.add(stockOneSecond);
		
		StockHolding stockTwoSecond = new StockHolding("GE", 4, 40);
		stockTwoSecond.setCurrentSharePrice(41);
		secondList.add(stockTwoSecond);
		
		StockHolding stockThreeSecond = new StockHolding("BAC", 5, 50);
		stockThreeSecond.setCurrentSharePrice(51);
		secondList.add(stockThreeSecond);
		
		StockHolding stockFourSecond = new StockHolding("FB", 6, 60);
		stockFourSecond.setCurrentSharePrice(61);
		secondList.add(stockFourSecond);
		
		System.out.println(firstList);
		System.out.println(secondList);
		
		System.out.println(secondList.find("SMSG").toString());
		
		secondList.remove(stockOneSecond.getTicker());
		secondList.remove(stockTwoSecond.getTicker());
		secondList.remove(stockThreeSecond.getTicker());
		secondList.remove(stockFourSecond.getTicker());
		
		System.out.println(secondList);
		
	}
}