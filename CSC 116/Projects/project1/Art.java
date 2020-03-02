/**
*Outputs the ASCII art I have chosen to recreate, the Master Sword from the
*Legend of Zelda
*@author Coree Hansen
*Art based off of work on http://www.zeldauniverse.net/forums/creativity-corner/7673-ascii-art.html
*/

public class Art {

	/**
	* Outputs the ASCII art, the Master Sword
	*@param args comman line arguments (not used)
	*/
	
	public static void main(String[] args) {
		Hilt();
		Sword();
		Sword();
		Sword();
		Sword();
		Base();
	}
	
	/**
	*outputs the Hilt of the Sword, the top
	*/
	
	public static void Hilt() {
		System.out.println("           __  ");
		System.out.println("           ||");
		System.out.println("           ||");
		System.out.println("       ____||____");
		System.out.println("    __/#________#\\__");   
		System.out.println("   /  _/  | ||  \\_  \\");
		System.out.println("  |__|    | ||    |__|");
	}
	/**
	*outputs the Sword, the middle
	*/
	
	public static void Sword() {
		System.out.println("          | ||");
	}
	
	/**
	*outputs the Base of the Sword, the bottom
	*/
	public static void Base() {
		System.out.println("      ____|_||________");
		System.out.println("     /     /\\     \\   \\");
		System.out.println("    #     /__\\     #   #");
		System.out.println("   /     /\\  /\\     \\   \\");
		System.out.println("  #     /__\\/__\\     #   #");
		System.out.println(" /____________________\\___\\");
	}
}



