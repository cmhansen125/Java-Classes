/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: Lies, D@^# Lies and Statistics
*	File: AveragingNumbers.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class AveragingNumbers{
	
	public static void main(String[] args) {
		//creats an array containing 1 million elements (tested with 5)
		double[] lies = new double[10];
		//assigns a random number to each element
		for (int i = 0; i < lies.length; i++) {
			lies[i] = Math.random();
		}
		
		//uses the avg method to calculate the average  of the array
		double averageRandom = avg(lies);
		System.out.println("The average for this array is " + averageRandom);
		
		//calls the loToHi method to sort the array into a new array
		double[] liesLoToHi = loToHi(lies);	
		//uses the avg method to calculate the average of the new array from loToHi
		double averageLoToHi = avg(liesLoToHi);
		System.out.println("The average for the second array (low to high) is " + averageLoToHi);
		
		//calls the hiToLo method to sort the original array into a new one
		double[] liesHiToLo = hiToLo(lies);
		//uses the avg method to calculate the average of the new array from hiToLo
		double averageHiToLo = avg(liesHiToLo);
		System.out.println("The average for the third array (high to low) is " + averageHiToLo);
		
		//Tests whether the averages are identical
		if ( (averageRandom == averageHiToLo ) && (averageRandom == averageLoToHi) ) {
			System.out.println("The three averages are the same!");
		} else {
			System.out.println("The three averages are not the same!");
		}
	}
	
	public static double avg(double[] original) {
		
		double average = 0;
		for (int j = 0; j < original.length; j++) {
			average = average + original[j];
		}
		average = average / original.length;
		return average;
	}
	
	public static double[] loToHi(double[] original) {
		
		double [] returnarray = new double [original.length];
		System.arraycopy(original, 0, returnarray, 0, original.length);
		java.util.Arrays.sort(returnarray);
		return returnarray;		
	}
	
	public static double[] hiToLo(double[] original) {
		
		double [] returnarray = new double [original.length];
		java.util.Arrays.sort(original);
		
		for (int i = 0, j = original.length-1; i <original.length; i++, j--) {
			returnarray[j] = original[i];
		}
				
		return returnarray;
	}
}