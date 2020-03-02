/**

*Output temperature in C and F from 0 to 30 C

*@author Coree Hansen

*/


public class TempConverter {

	public static final int MIN_TEMP = 0;
	
	public static final int MAX_TEMP = 30;
	

	
	/**

	* Output temperatures in C and F from 0 to 30 C
	
	*@param args command line arguments

	*/


	public static void main(String[] args) {

		for(int tempC = MIN_TEMP; tempC <= MAX_TEMP; tempC++) {

		System.out.print(tempC + " C ");

		double tempF = convertTemp(tempC);

		System.out.println(tempF  + " F");

		}

	}


	
/**

	*Converts temperature in Celsius to Fahrenheit

	*@param tempC temperature in Celsius

	*@return temperature in Fahrenheit

	*/


	public static double convertTemp(int tempC) {

		
return (9.0*tempC/5.0) + 32.0;

	}

}
	

