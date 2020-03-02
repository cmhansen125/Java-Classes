import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordAnalyzer {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		
		Set<String> one = new HashSet<>();
		Set<String> two = new HashSet<>();
		
		if(file.exists()) {
			while (sc.hasNext()) {
				String word = sc.next();
				word = word.toLowerCase();
				if (one.contains(word)) {
					two.add(word);
				} else {
				one.add(word);
				}
			}
		}
		
		System.out.println(one);
		System.out.println(two);
		sc.close();
	}
}