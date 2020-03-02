/**
* Outputs the distance a football is thrown using the Trajectory of a Projectile Formula
*@author Coree Hansen
* Formula is used from wikipedia site: http://en.wikipedia.org/wiki/Trajectory_of_a_projectile
*/

import java.util.*;

public class FootballDistanceCalculatorB {

	public static final double GRAVITATIONAL_ACCELERATION = 32.174;  //feet per sec^2
	public static final double CONVERT_MPH = 1.46666667; //Miles/Hour to Feet/Second
	

	/**
 	* Outputs the angle and the distance a football is thrown using the Trajectory of a Projectile formula
 	* @param args command line arguments (not used)
	*/
	 
	 public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter initial velocity (mi/hr): ");
		int velocity = console.nextInt() ;
		System.out.print("Enter initial height (ft): ");
		int height = console.nextInt();
		System.out.print("Enter an angle (degrees): ");
		int anglE = console.nextInt();

		double distancE = calculateDistance(anglE, velocity, height);
		System.out.printf("Distance: %.2f ft. \n", distancE);
		
		
	}
	/**
 	* Calculates the distance a projectile travels
 	* @param angle angle at which projectile is thrown in degrees
	* @param velocity initial velocity of projectile in miles/hour
	* @param height initial height of projectile in feet
	* @return distance traveled by projectile in feet
	*/
	
	public static double calculateDistance(int anglE, double velocity, double height) {
		return ((velocity*CONVERT_MPH*Math.cos(Math.toRadians(anglE)))/GRAVITATIONAL_ACCELERATION)
		*((velocity*CONVERT_MPH*Math.sin(Math.toRadians(anglE)))
		+(Math.sqrt((velocity*CONVERT_MPH*Math.sin(Math.toRadians(anglE)))
		*(velocity*CONVERT_MPH*Math.sin(Math.toRadians(anglE)))
		+2.0*GRAVITATIONAL_ACCELERATION*height)));
	}
}
