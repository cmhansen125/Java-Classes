import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class ExhibitCoree<Integer, Animal> extends HashMap<Integer, Animal> {
	
	private File f;
	
	public void writeToFile(String exhibitName) throws IOException {		
		f = new File(exhibitName + ".txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter outfile = new PrintWriter(fw);
		outfile = new PrintWriter(fw);
		for (Integer name: keySet()) {
			String key = name.toString();
			String value = get(name).toString();
			outfile.print(key + ", " + value + "\n");
		}
		outfile.close();
	}
	
	public Animal getAnimalByTag(int tagNumber) {
		for (Integer name: keySet()) {
			if (name.equals(tagNumber)) {
				return get(name);
			}
		}
		return null;
	}
	
	public Animal getAnimalByName(String name) {
		for (Integer name: keySet()) {
			if (name.getName().equals(name)) {
				return get(name);
			}
		}
	
	}
	
	
	public String toString() {
		String returnString = "";
		for (Integer name: keySet()) {
			String key = name.toString();
			String value = get(name).toString();
			returnString += key + " " + value + "\n";
		}
		return returnString;
	}

}

class AnimalWithName {
	
}
