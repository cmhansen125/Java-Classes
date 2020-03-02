/**
* Outputs the distance a basketball travels using the series formula
*@author Coree Hansen
* Formula is used from project site: http://courses.ncsu.edu/csc116/common/Balik/Projects/Project2/project2.html
*/

import java.util.*;

public class BasketballDistanceCalculator {

	public static final int MAX_R_VALUE = 1000;
	
	/**
 	* Outputs the angle and the distance a basketball travels using the series formula
 	* @param args command line arguments (not used)
	*/
	 

	 public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter initial height (ft): ");
		Double heighT = console.nextDouble() ;
		System.out.print("Enter rebound fraction r (0 < r < 1): ");
		Double rebounD = console.nextDouble();
		
		double distancE = calculateTotalDistance(heighT, rebounD);
		System.out.printf("Distance: %.2f ft. \n", distancE);
	}

	/**
 	* Calculates the distance a projectile travels
 	* @param heighT initial height of projectile in feet
	* @param rebounD angle at which the ball rebound in a fraction
	* @return distance traveled by projectile in feet
	*/
	
	public static double calculateTotalDistance(double heighT, double rebounD) {
		double distance = heighT;		
		for (int i = 1; i <= MAX_R_VALUE; i++) {
		distance = distance + 2.0*heighT*Math.pow(rebounD, i);
		
		}
	return (distance);
}
}
