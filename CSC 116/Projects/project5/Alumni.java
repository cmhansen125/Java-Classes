import java.util.*;
import java.io.*;

/**
 * This program calls a file and reads it.  It then will display the information based on the users input and choice.
 @author Coree Hansen
 */
 
public class Alumni {

	public static final String start = "art";
	/**
	 * This method gets the file from the user when they start the program.  It trys the file to make sure it is valid.
	 * It then asks the user for the information they desire using 'S' 'L' 'D' 'Y' 'Q'.  All of them except 'Q' will have the program loop
	 * and keep going.  'Q' makes the program quit
	 *@param args command line arguments used to retrieve the file
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		if(args.length!=1) {
			System.out.println("Usage: java Alumni filename");
			System.exit(1);
		}
		Scanner input = null;
		try {
			input = new Scanner(new File(args[0]));
		}
		catch (FileNotFoundException e) {
			System.out.println("Unable to access input file: " + args[0]);
			System.exit(1);
		}
		
		int count = 0;
		while(input.hasNextLine()) {
			input.nextLine();
			count++;
		}
		String[] names = new String[count];
		String[] degrees = new String[count];
		int[] years = new int[count];

		Scanner inputUse = null;
		try {
			inputUse = new Scanner(new File(args[0]));
		}
		catch (FileNotFoundException e) {
			System.out.println("Unable to access input file: " + args[0]);
			System.exit(1);
		}
		for(int i=0; i<count-1; i++) {
				names[i] = inputUse.next();
				degrees[i] = inputUse.next();
				years[i] = inputUse.nextInt();
			}

		String commandLine = start;
		char command = start.charAt(0);
		do { 
		System.out.println("Alumni Information - Please enter an option below.")
;
		System.out.println("S - Display Statistics");
		System.out.println("L - List all alumni");
		System.out.println("D -List alumni by degree"); 
		System.out.println("Y - List alumni by year"); 
		System.out.println("Q - Quit the program");
		System.out.print("Option: ");
		commandLine = console.next();
		command = commandLine.charAt(0);
		
			if(command=='s' || command=='S') {
				displayStatistics(names,degrees,years);
			}
			if(command=='l' || command=='L') {
				listAll(names,degrees,years);
			}
			if(command=='d' || command=='D') {
				listByDegree(console,names,degrees,years);
			}
			if(command=='y' || command=='Y') {
				listByYear(console,names,degrees,years);
			}
			if(command=='q' || command=='Q') {
				System.out.println("Goodbye!");
				System.exit(1);	
			}
		}  while (command!='q' || command!='Q');
		
		System.out.println("Goodbye!");
		System.exit(1);	
	}
	
	
	
	
	
	
	
	//Display statistics as shown above
	/**
	 * This method will display the statistical information of the file.
	 *@param String[] names the array of names that the method calls on
	 *@param String[] degrees the array of different degrees people can have
	 *@param int[] years the different years people graduated from
	 */
	public static void displayStatistics(String[] names, String[] degrees, int[] years) {
		System.out.println("Number of Alumni in file: " + names.length);


		System.out.println("By degree: ");
		int countB = 0;
		int countM = 0;
		int countP = 0;
		for(int i=0; i<degrees.length-1; i++) {
			if (degrees[i].equals("B.S.")) {
				countB ++;
			}
			if (degrees[i].equals("M.S.")){
				countM ++;
			}
			if (degrees[i].equals("Ph.D.")) {
				countP ++;
			}
		}
		System.out.println(" B.S.: "+ countB);
		System.out.println(" M.S.: "+ countM);
		System.out.println(" Ph.D.: "+ countP);
		
		int count6069 =0;
		int count7079 =0;
		int count8089 =0;
		int count9099 =0;
		int count0009 =0;
		int count1019 =0;
		for( int i=0; i<years.length-1; i++) {
			if (years[i]>=1960 && years[i] <=1969)  {
				count6069 ++;
			}
			if (years[i]>=1970 && years[i] <=1979)  {
				count7079 ++;
			}
			if (years[i]>=1980 && years[i] <=1989)  {
				count8089 ++;
			}
			if (years[i]>=1990 && years[i] <=1999)  {
				count9099 ++;
			}
			if (years[i]>=2000 && years[i] <=2009)  {
				count0009 ++;
			}
			if (years[i]>=2010 && years[i] <=2019)  {
				count1019 ++;
			}
		}
		System.out.println(" ");
		System.out.println("By Year:");
		System.out.println(" 1960-1969: "+ count6069);
		System.out.println(" 1970-1979: "+ count7079);
		System.out.println(" 1980-1989: "+ count8089);
		System.out.println(" 1990-1999: "+ count9099);
		System.out.println(" 2000-2009: "+ count0009);
		System.out.println(" 2010-2019: "+ count1019);
		System.out.println(" ");
	}

//List all alumni as shown above

	/**
	 * This method will list all the information of the file.
	 *@param String[] names the array of names that the method calls on
	 *@param String[] degrees the array of different degrees people can have
	 *@param int[] years the different years people graduated from
	 */
	public static void listAll(String[] names, String[] degrees, int[] years) {
		System.out.println("Year     Degree     Name");
		for(int i=0; i<names.length-1; i++) {
			System.out.println(years[i] + "     " + degrees[i] + "       " + names[i]);	
		}		
	}
//Prompt the user for a degree and list all alumni with that degree as shown above

	/**
	 * This method will display the information based on the degree input of the user from the file.
	 *@param console The scanner the method uses to determine the degree wanted
	 *@param String[] names the array of names that the method calls on
	 *@param String[] degrees the array of different degrees people can have
	 *@param int[] years the different years people graduated from
	 */
	public static void listByDegree(Scanner console, String[] names, String[] degrees, int[] years) {
		System.out.print("Enter Degree (B.S., M.S., Ph.D.): ");
		String degree = console.next();
		if(degree.equals("B.S.") || degree.equals("M.S.") || degree.equals("Ph.D.")) {
			System.out.println("Alumni with Degree: " + degree);			
			for(int i=0; i<=degrees.length-1; i++) {			
				if(degree.equals(degrees[i])) {
					System.out.println(years[i] +"     " + names[i]);
				}
			}
		} else {
			System.out.println("Invalid degree");
		}				
}


//Prompt the user for a year and list all alumni with that year as shown above

	/**
	 * This method will display the information based on the year inputted by the user from the file.
	 *@param console The scanner the method uses to determine the year wanted
	 *@param String[] names the array of names that the method calls on
	 *@param String[] degrees the array of different degrees people can have
	 *@param int[] years the different years people graduated from
	 */
	public static void listByYear(Scanner console, String[] names, String[] degrees, int[] years) {
	
	System.out.print("Enter Year (1960-2020): ");
		int year = console.nextInt();
		if(year >=1960 && year<2020){
			System.out.println("Alumni with Graduation Date :" + year);			
			for(int i=0; i<=years.length-1; i++) {			
				if(year==years[i]) {
					System.out.println(degrees[i] + "     " + names[i]);
				}
			}
		} else {
			System.out.println("Invalid Year");
		}				

	}
}
