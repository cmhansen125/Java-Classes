public class Symbol {

	private String name;
	private int value;

	public Symbol(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {

		String s = "";
		s += name;
		return s;
	}

	public int getValue() {
		
		int i = 0;
		i += value;
		return i;
	}

	public boolean equals(Object o) {
		if (o instanceof Symbol) {
			Symbol other = (Symbol)o;
			if(name.equals(other.name) && value == other.value) {
				return true;
			}
			else {
				return false;
			}
		} 
		else {
			return false;
		}
	}

	public String toString() {
		String d = "";
		d += name;
		return d;
	}
}
			

	
