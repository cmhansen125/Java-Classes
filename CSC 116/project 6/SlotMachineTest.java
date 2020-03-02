/**
 * Tests for the slot machine's public methods
 */
public class SlotMachineTest {
	
	private SlotMachine m;
	
	public static void main(String [] args) {
		SlotMachineTest test = new SlotMachineTest();
		test.testConstructor();
		System.out.println();
		test.testMakeBet();
		System.out.println();
		test.testTurnReel();
		System.out.println();
		test.testDetermineOutcome();
		System.out.println();
	}
	
	public void setUp(int seed) {
		//Create a slot machine for testing
		m = new SlotMachine(seed);
	}

	/**
	 * Tests the current state of the slot machine to determine
	 * if the player has won.
	 */
	public void testDetermineOutcome() {
		setUp(0);
		
		System.out.println("testDetermineOutcome()");
		
		//Test the initial configuration of symbols shown
		//in the slot machine reels
		m.determineOutcome();
		System.out.printf("%18s: %s    %18s: %s\n", "Expected Tokens", 100, "Actual Tokens", m.getNumberOfTokens());
		System.out.printf("%18s: %s    %18s: %s\n", "Expected Status", "3 State Symbols! 50 Tokens!", "Actual Status", m.getStatus());
		
		//TODO write test case here.
		
	}

	/**
	 * Tests that the reels turn correctly
	 */
	public void testTurnReel() {
		setUp(0);
		
		System.out.println("testTurnReel()");
		
		//Provided test case
		m.turnReel(); //Turns reel at index 0
		System.out.printf("   Reel 0: %18s: %d    %18s: %d\n", "Expected Index", 1, "Actual Index", m.getCurrentIndexOfReel(0));
		System.out.printf("   Reel 1: %18s: %d    %18s: %d\n", "Expected Index", 0, "Actual Index", m.getCurrentIndexOfReel(1));
		System.out.printf("   Reel 2: %18s: %d    %18s: %d\n", "Expected Index", 0, "Actual Index", m.getCurrentIndexOfReel(2));
		
		setUp(1);
		
		System.out.println("testTurnReel()");
		
		
		m.turnReel();
		m.turnReel();
		System.out.printf("   Reel 0: %18s: %d    %18s: %d\n", "Expected Index", 1, "Actual Index", m.getCurrentIndexOfReel(0));
		System.out.printf("   Reel 1: %18s: %d    %18s: %d\n", "Expected Index", 4, "Actual Index", m.getCurrentIndexOfReel(1));
		System.out.printf("   Reel 2: %18s: %d    %18s: %d\n", "Expected Index", 0, "Actual Index", m.getCurrentIndexOfReel(2));
		
	}

	/**
	 * Ensures that the tokens for a bet are removed from
	 * the player's token total.
	 */
	public void testMakeBet() {
		setUp(0);
		
		System.out.println("testMakeBet()");
		
		//Provided test case
		m.makeBet();
		System.out.printf("%18s: %d    %18s: %d\n", "Expected Tokens", 45, "Actual Tokens", m.getNumberOfTokens());
		
		setUp(1);
		
		System.out.println("testMakeBet()");
		
		m.makeBet();
		m.makeBet();
		System.out.printf("%18s: %d    %18s: %d\n", "Expected Tokens", 40, "Actual Tokens", m.getNumberOfTokens());
	}

	/**
	 * Tests that the slot machine is constructed correctly
	 */
	public void testConstructor() {
		setUp(0);
		
		System.out.println("testConstructor()");
		
		
		//TODO write test case here. HINT: Use the getter methods of the SlotMachine class to validate
		//that the state of the SlotMachine is correct when it is initially created.
		
	}

}
