import java.util.*;

public class SlotMachine {

	public static final int BET_AMOUNT = 5;
	public static final int TOKEN_START_AMOUNT = 50;
	public static final int NUMBER_OF_REELS = 3;
	public static final int UPWARDS = -1;
	public static final int DOWNWARDS = 1;

	private Reel[] reels;
	private int tokens;
	private String status;
	private Random rand;

	public SlotMachine(int seed) {
		rand = new Random(seed);		
		tokens = TOKEN_START_AMOUNT;
		reels = new Reel[NUMBER_OF_REELS];
		reels[0] = new Reel(DOWNWARDS);
		reels[1] = new Reel(UPWARDS);
		reels[2] = new Reel (DOWNWARDS); 
		status = new String("Pull Lever to Begin");
	}
	
	public void makeBet() {
		if(tokens >= 5) {
			 tokens -= 5;
		}
	}
	
	public int getNumberOfTokens() {
		return tokens;
	}

	public String getStatus() {
		return status;
	}
	
	public int getCurrentIndexOfReel(int index) {
		return reels[index].getCurrentIndex();
	}

	public void turnReel() {
		int r = rand.nextInt(NUMBER_OF_REELS);
		reels[r].turn();
	}

	public void determineOutcome() {
		
		status = "You lose";
		Symbol symbol = reels[0].getCurrentSymbol();		
		if(reels[0].getCurrentSymbol().equals(reels[1].getCurrentSymbol()) && reels[1].getCurrentSymbol().equals(reels[2].getCurrentSymbol())) {
			status = "3 " + reels[0].getCurrentSymbol() + "!\t You won " + symbol.getValue() *5 +" tokens!";
			tokens += (symbol.getValue() *5);
		}
		if(reels[0].getCurrentSymbol().equals(reels[1].getCurrentSymbol())) {
			symbol = reels[0].getCurrentSymbol();			
			status = "2 " + reels[0].getCurrentSymbol() + "!\t You won " + symbol.getValue() *2 +" tokens!";
			tokens += (symbol.getValue() *2);			
		}
		if (reels[0].getCurrentSymbol().equals(reels[2].getCurrentSymbol())) {
			symbol = reels[0].getCurrentSymbol();			
			status = "2 " + reels[0].getCurrentSymbol() + "!\t You won " + symbol.getValue() *2 +" tokens!";
			tokens += (symbol.getValue() *2);
		}
		if (reels[1].getCurrentSymbol().equals(reels[2].getCurrentSymbol())) {
			 symbol = reels[1].getCurrentSymbol();			
			status = "2 " + reels[1].getCurrentSymbol() + "!\t You won " + symbol.getValue() *2 +" tokens!";
			tokens += (symbol.getValue() *2);
		}
		

	}
			













}
