import java.io.*;
import java.util.*;

 /**
  * This program takes a file given by the user, and compresses it or decompresses to a file inputted by the user.
  * @author Coree Hansen
  */
  
public class ZipUnzip {

	public static final String THE = "~";

	public static final String ION = "&";

	public static final String ING = "#";

	public static final String AN = "%";

	public static final String RE = "@";

	public static final String CON = "$";


	public static final String TILDE = "the";

	public static final String AMPERSAND = "ion";

	public static final String NUMBER_SIGN = "ing";

	public static final String PERCENT_SIGN = "an";

	public static final String AT_SIGN = "re";

	public static final String DOLLAR_SIGN = "con";

	
	 /**
	 * This method directs to the method userInterface.
	 * @param args command line arguments (not used)
	 */
	 
	public static void main(String [] args) {
		userInterface();
	}
	
	/**
     	* Provides the user interface,
     	* It asks whether the user would like to compress or decompress a file or quit.
     	*/
	 
	public static void userInterface() {
		Scanner console = new Scanner(System.in);
		boolean compress = false;
		System.out.print("Would you like to (C)ompress or(D)ecompress a file?  Or (Q)uit?");
		String command = console.next();
		char commandl = command.charAt(0);
		if (commandl=='C' || commandl=='c' || commandl=='D' || commandl=='d') {
			Scanner input = getInputScanner(console);
			PrintStream output = getOutputPrintStream(console);
			if (commandl=='C' || commandl=='c') {
				compress = true;
			}
			processFile(compress,input,output);
		} else if (commandl=='Q' ||commandl=='q') {
			System.exit(1);
		} else {
			System.out.println("Invalid Entry, please try again.");
			System.exit(1);
		}
	}
	
	 /**
	 * Asks the user for in input file.
	 * if file doesnt exist, will give a FileNotFoundException.
	 * @param console Scanner that method uses for user input.
	 */
			
	public static Scanner getInputScanner(Scanner console){
		Scanner input = null;
		while (input == null) {
			System.out.print("Input File name: ");
			String name = console.next();
			try {
				input = new Scanner(new File(name));
			} catch(FileNotFoundException e) {
				System.out.println("File Not Found. Please Try Again.");
			}
		}
		return input;
	}
	
	/**
	 * Asks the user for an output file
	 * If file exsists, the program will state that and exit
	 * @param console  Scanner that method uses for user input
	 */
	 
	public static PrintStream getOutputPrintStream(Scanner console){
		System.out.print("Enter Filename for Output: ");
		String filename = console.next();
		File f = new File(filename);
		if(f.exists()) {
			System.out.println("File Exists, Exiting");
			System.exit(1);
		}
		PrintStream getOutputPrintStream = null;
		try {
			getOutputPrintStream = new PrintStream(f);
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found. This Program will now Exit.");
			System.exit(1);
		}
		return getOutputPrintStream;
	}
	
	 /**
	 * Processes each line and determine whether the file is being compressed or decompressed.
	 * @param compress Boolean which determines whether to compress or decompress a file by being true or false.
	 * @param input Scanner that reads the file to be compressed/decompressed.
	 * @param output PrintStream that takes the proccessed line and puts it into a new file
	 */
	 
	public static void processFile (boolean compress, Scanner input, PrintStream output){

		while(input.hasNextLine()) {

			String line = input.nextLine();
			if (compress==true) {

			String compressedLine = compressLine(line);

			output.println(compressedLine);

			} else {

			String decompressedLine = decompressLine(line);

			output.println(decompressedLine);
			}
		}
	}
	
	 /**
	  * This method reads the line from input and gives it to the method compress word by word.
	  * @param line Line from input which is read token by token
	  */
	  
	public static String compressLine(String line){
		Scanner scan = new Scanner(line);

		String compressedLine = "";
	
		while(scan.hasNext()) {

			String word = compress(scan.next());
		
	compressedLine += word + " ";

			}
		return compressedLine;
	}

	 /**
	  * This method checks the word given to it for the substrings "the", "ion", "ing
	  * "an", "re", and "con".  It then replaces those phrases wtih constants and returns the word.
	  * @param Word from compressLine which has certain phrases taken out of it.
	  */
	  
	public static String compress(String word) {

		if( word.contains("the")) {

			int i = word.indexOf("the");

			
word = word.substring(0,i) + THE + word.substring(i+3);

		}

		if( word.contains("ion")) {

			int j = word.indexOf("ion");


			word = word.substring(0,j) + ION + word.substring(j+3);

		}

		if( word.contains("ing")) {

			int k = word.indexOf("ing");

			word = word.substring(0,k) + ING + word.substring(k+3);

		}

		if( word.contains("an")) {

			int l = word.indexOf("an");


			word = word.substring(0,l) + AN + word.substring(l+2);

		}

		if( word.contains("re")) {

			int m = word.indexOf("re");


			word = word.substring(0,m) + RE + word.substring(m+2);

		}

		if( word.contains("con")) {

			int n = word.indexOf("con");

			word = word.substring(0,n) + CON + word.substring(n+3);

		}

		return word;
	}

	 /**
	  * This method reads the line from input and gives it to the method decompress word by word.
	  * @param line Line from input which is read token by token
	  */
	  
	public static String decompressLine(String line) {

		Scanner scan = new Scanner(line);

		String decompressedLine = "";

		while(scan.hasNext()) {

			String word = decompress(scan.next());
			decompressedLine += word + " ";

		}


		return decompressedLine;
 
	}



	 /**
	  * This method checks the word given to it for the substrings "~", "&", "#", "%",
	  * "@", and "$".  It then replaces those phrases wtih constants and returns the word.
	  * @param Word from decompressLine which has certain phrases taken out of it.
	  */
	  	public static String decompress(String word){

	
				

		if( word.contains("~")) {

			int i = word.indexOf("~");

			word = word.substring(0,i) + TILDE + word.substring(i+1);

		}

		if( word.contains("&")) {

			int j = word.indexOf("&");


			word = word.substring(0,j) + AMPERSAND + word.substring(j+1);

		}

		if( word.contains("#")) {

			int k = word.indexOf("#");


			word = word.substring(0,k) + NUMBER_SIGN + word.substring(k+1);

		}

		if( word.contains("%")) {

			int l = word.indexOf("%");

			
word = word.substring(0,l) + PERCENT_SIGN + word.substring(l+1);

		}

		if( word.contains("@")) {

			int m = word.indexOf("@");


			word = word.substring(0,m) + AT_SIGN + word.substring(m+1);

		}

		if( word.contains("$")) {

			int n = word.indexOf("$");

			
word = word.substring(0,n) + DOLLAR_SIGN + word.substring(n+1);

		}


		return word;

	}

}
	



