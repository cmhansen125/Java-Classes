/**
* Outputs the distance a football is thrown using the Trajectory of a Projectile Formula
*@author Coree Hansen
* Formula is used from wikipedia site: http://en.wikipedia.org/wiki/Trajectory_of_a_projectile
*/

public class FootballDistanceCalculator {

	public static final double GRAVITATIONAL_ACCELERATION = 32.174;  //feet per sec^2
	public static final int MIN_ANGLE = 10; //degrees
	public static final int MAX_ANGLE = 90; //degrees
	public static final int ANGLE_INCREMENT = 10;
	public static final double VELOCITY = 30; //miles/hour
	public static final double HEIGHT = 5; //feet
	public static final double CONVERT_MPH = 1.46666667; //Miles/Hour to Feet/Second
	
	/**
 	* Outputs the angle and the distance a football is thrown using the Trajectory of a Projectile formula
 	* @param args command line arguments (not used)
	*/
	 
	 public static void main(String[] args) {
		System.out.println("Angle(degrees)       Distance(feet)");
		for (int anglE = MIN_ANGLE; anglE <= MAX_ANGLE; anglE += ANGLE_INCREMENT) {
		System.out.print("      " + anglE + "             "); 
		double distancE = calculateDistance(anglE, VELOCITY, HEIGHT);
		System.out.println(distancE);
		}
	}
	/**
 	* Calculates the distance a projectile travels
 	* @param angle angle at which projectile is thrown in degrees
	* @param velocity initial velocity of projectile in miles/hour
	* @param height initial height of projectile in feet
	* @return distance traveled by projectile in feet
	*/
	
	public static double calculateDistance(int anglE, double VELOCITY, double HEIGHT) {
		return ((VELOCITY*CONVERT_MPH*Math.cos(Math.toRadians(anglE)))/GRAVITATIONAL_ACCELERATION)
		*((VELOCITY*CONVERT_MPH*Math.sin(Math.toRadians(anglE)))
		+(Math.sqrt((VELOCITY*CONVERT_MPH*Math.sin(Math.toRadians(anglE)))
		*(VELOCITY*CONVERT_MPH*Math.sin(Math.toRadians(anglE)))
		+2.0*GRAVITATIONAL_ACCELERATION*HEIGHT)));
	}
}
