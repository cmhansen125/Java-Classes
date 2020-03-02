public class Reel {

	private Symbol[] symbols;
	private int index;
	private int direction;

	public static final int NUMBER_OF_SYMBOLS = 5;  
	public static final String[] SYMBOL_NAMES = {"State Symbols", "Hearts", 
"Bars", "Cherries", "Sevens"};
	public static final int[] SYMBOL_VALUES = {10, 25, 50, 75, 100};



	public Reel(int direction) {
		index = 0;
		symbols = new Symbol[NUMBER_OF_SYMBOLS];
		for(int i = 0; i<NUMBER_OF_SYMBOLS; i++) {
			symbols[i] = new Symbol(SYMBOL_NAMES[i],SYMBOL_VALUES[i]);
		}
		this.direction = direction;
	}

	public Symbol getCurrentSymbol() {
		return symbols[index];
	}

	public int getCurrentIndex() {
		return index;
	}
	
	public void turn() {
		this.index += this.direction;
		if(index == -1) {
			this.index = 4;
		}
		if(index == 5) {
			this.index = 0;
		}

	}


	public String toString() {
		String s = "";
		s += "Current index: " + this.index;
		s += "\nCurrent Symbol: " + this.symbols[index];
		s += "\nSymbol 0: State Symbols 10" + "\nSymbol 1: Hearts 25";
		s += "\nSymbol 2: Bars 50" + "\nSymbol 3: Cherries 75";
		s += "\nSymbol 4: Sevens 100";
		return s;
	}
		

  
  
}

