
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;
import java.util.Scanner;

public class MenuFromProperties {

	public static void main(String[] args) throws InterruptedException, URISyntaxException, FileNotFoundException,
			IOException, ClassNotFoundException {

		String language;
		String country;
		
		language = new String("en");
		country = new String("US");
		
		Locale currentLocale;
		ResourceBundle menuChoices;
		
		currentLocale = new Locale(language, country);
		
		menuChoices = ResourceBundle.getBundle("MenuBundle", currentLocale);
		
		
		Scanner kybd = new Scanner(System.in);

		int userChoice = -1;

		userChoice = Utils.userChoose(kybd, menuChoices);
		
		language = new String("es");
		country = new String("Me");
		
		Locale newLocale = new Locale(language, country);
		
		menuChoices = ResourceBundle.getBundle("MenuBundle", newLocale);
		
		userChoice = Utils.userChoose(kybd, menuChoices);
		
		
		
		
	}

}
