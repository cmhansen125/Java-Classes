import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class RedactedDocument {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner kybd = new Scanner(System.in);
		
		System.out.print("Enter a trigger word: ");
		String trigger = kybd.next();
		
		List<String> file = new ArrayList<>(Utilities.readAFile());

		ListIterator<String> list = file.listIterator();
		
		while (list.hasNext()) {
			
			String nextString = list.next();
			nextString = nextString.toLowerCase();
			if (nextString.equals(trigger)) {
				int elementNumber = list.previousIndex();
				elementNumber -= 1;
				String newString = "";
				if (file.get(elementNumber).contains("\n")) {
					int numOfStars = file.get(elementNumber -1).length();
					for (int i = 0; i< numOfStars; i++) {
						newString += "*";
					}
					newString = newString;
					file.set(elementNumber-1, newString);
				} else {
					int numOfStars = file.get(elementNumber).length();
					for (int i = 0; i< numOfStars; i++) {
						newString += "*";
					}
					file.set(elementNumber, newString);
				}
				
				
			}
			
		}
		
		Utilities.printAList(file);
		kybd.close();
	}
}
