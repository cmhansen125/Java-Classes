import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class FrequentWords {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		Scanner sc2 = new Scanner(file);
		Map<String, Integer> map = new TreeMap<>();
		
		if(file.exists()) {
			while (sc.hasNext()) {
				String word = sc.next();
				word = word.toLowerCase();
				if (!map.containsKey(word)) {
					map.put(word, 1);
				} else {
					int value = map.get(word);
					value++;
					map.put(word, value);
				}
			}
			
			while (sc2.hasNext()) {
				String word = sc2.next();
				word = word.toLowerCase();
				int value = map.get(word);
				if (value == 1) {
					map.remove(word);
				}
			}

			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			for (Map.Entry<String, Integer> entry: entrySet)
				System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
			
			sc.close();
			sc2.close();
		}
	}

}
