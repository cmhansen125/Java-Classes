import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilities {

	public static final String DEFAULT_FILE = "sample.txt";

	public static List<String> readAFile() throws FileNotFoundException {
		return readAFile(DEFAULT_FILE);
	}

	public static List<String> readAFile(String fileName) throws FileNotFoundException {
		ArrayList<String> content = new ArrayList<>();

		File f = new File(fileName);
		Scanner scan = new Scanner(f);

		while (scan.hasNextLine()) {
			String l = scan.nextLine();
			Scanner lineBust = new Scanner(l);
			while (lineBust.hasNext()) {
				content.add(lineBust.next());
			}
			lineBust.close();
			content.add("\n");
		}
		scan.close();

		return content;
	}

	public static void printAList(List<String> list) {
		System.out.println();
		for (String s: list) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
