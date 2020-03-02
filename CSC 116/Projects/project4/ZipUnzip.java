import java.io.*;
import java.util.*;

public class ZipUnzip {

	public static void main(String [] args) {
		userInterface();
	}
	
	public static void userInterface() {
		Scanner console = new Scanner(System.in);
		boolean compress = false;
		System.out.print("Would you like to (C)ompress or(D)ecompress a file?  Or (Q)uit?");
		String command = console.next();
		char commandl = command.charAt(0);
		if (commandl=='C' || commandl=='c' || commandl=='D' || commandl=='d') {
			Scanner input = getInputScanner(console);
			PrintStream getOutputPrintStream(console);
			if (commandl=='C' || commandl=='c') {
				compress = true;
			}
			processFile(compress,input,output);	
			
		
		
	
	
	public static Scanner getInputScanner(Scanner console){
		Scanner input = null;
		While (input == null) {
			System.out.print("Input File name: ");
			String name = console.next();
			try {
				input = new Scanner(new File(name));
			} catch(FileNotFoundException e) {
				System.out.println("File Not Found. This Program will now Exit.");
				System.exit(1);
			}
		}
		return input;
	}


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


	public static void processFile (boolean compress, Scanner input, PrintStream output){

	}

	public static String compressLine(String line){

	}

	public static String compress(String word) {

	}

	public static String decompressLine(String line){

	}

	public static String decompress(String word) {

	}
