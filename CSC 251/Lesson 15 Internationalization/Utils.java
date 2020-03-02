
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;

public class Utils {

	public static int userChoose(Scanner kybd, String[] choices) {
		int choice = -1;
		System.out.println("Make a Selection: ");
		for (int i = 0; i < choices.length; i++) {
			System.out.println("\t[" + i + "] " + choices[i]);
		}
		choice = kybd.nextInt();
		return choice;
	}

	public static int userChoose(Scanner kybd, ResourceBundle choices) {
		int choice = -1;
		Enumeration bundleChoices = choices.getKeys();
		System.out.println("Make a Selection: ");
		while (bundleChoices.hasMoreElements()) {
			String key = (String)bundleChoices.nextElement();
			String value = choices.getString(key);
			System.out.println("\t[" + key + "] " + value);
		}
		choice = kybd.nextInt();
		return choice;
	}
}
