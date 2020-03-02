/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: StockHolding	
*	File: StockHoldingMain.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class StockHoldingMain {

	public static void main(String[] args) {
		
		StockHolding apple = new StockHolding("AAPL", 19, 103.97);
		System.out.println("Apple initial cost: " + apple.getInitialCost());
		apple.setCurrentSharePrice(105.5);
		System.out.println("Apple profit: " + apple.getCurrentProfit());
		System.out.println(apple.getTicker());
		System.out.println(apple);
		
		StockHolding bankOfAmerica = new StockHolding("BAC", 15, 17.0);
		System.out.println("\nBank of America's initial cost: " + bankOfAmerica.getInitialCost());
		bankOfAmerica.setCurrentSharePrice(16.68);
		System.out.println("Bank of Americ's profit: " + bankOfAmerica.getCurrentProfit());
		System.out.println(bankOfAmerica);
		
		StockHolding google = new StockHolding("GOOG", 100, 794);
		System.out.println("\nGoogle initial cost: " + google.getInitialCost());
		google.setCurrentSharePrice(795.02);
		System.out.println("Google profit: " + google.getCurrentProfit());
		System.out.println(google);
		
	}

}



