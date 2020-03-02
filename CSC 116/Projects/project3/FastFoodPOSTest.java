/**
 * Program to test FastFoodPOS
 * 
 * @author Coree Hansen
 */
public class FastFoodPOSTest {

	/**
	* This method calls upon FastFoodPOS.java and tests the getMealCost method using given parameters
	*@param args command line arguments (not used)
	*/	
	public static void main(String[] args) {
		//Example valid test case for getMealCost method
		int mealCost = FastFoodPOS.getMealCost('f', true, true);
		System.out.println("Expected: 525 \t Actual: " +  mealCost);

		//Add 16 more valid test cases here for getMealCost method
		mealCost = FastFoodPOS.getMealCost('c', true, false);
		System.out.println("Expected: 500 \t Actual: " +  mealCost);
		
		mealCost = FastFoodPOS.getMealCost('f', true, false);
		System.out.println("Expected: 475 \t Actual: " +  mealCost);
		
		mealCost = FastFoodPOS.getMealCost('c', false, false);
		System.out.println("Expected: 300 \t Actual: " +  mealCost);
		
		mealCost = FastFoodPOS.getMealCost('h', true, true);
		System.out.println("Expected: 500 \t Actual: " +  mealCost);
		
		mealCost = FastFoodPOS.getMealCost('h', false, false);
		System.out.println("Expected: 250 \t Actual: " +  mealCost);
		
		mealCost = FastFoodPOS.getMealCost('c', true, true);
		System.out.println("Expected: 550 \t Actual: " +  mealCost);
		
		mealCost = FastFoodPOS.getMealCost('h', true, false);
		System.out.println("Expected: 450 \t Actual: " +  mealCost);
		
		mealCost = FastFoodPOS.getMealCost('f', false, false);
		System.out.println("Expected: 275 \t Actual: " +  mealCost);
		

		//Invalid test cases are provided for you below - You do NOT
		//need to add additional invalid tests.  Just make sure these
		//pass!
		try {

			System.out.print("Expected: class java.lang.IllegalArgumentException \tActual: ");
			mealCost = FastFoodPOS.getMealCost('x', true, true);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getClass());
		}

		try {

			System.out.print("Expected: class java.lang.IllegalArgumentException \tActual: ");
			mealCost = FastFoodPOS.getMealCost('h', false, true);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getClass());
		}

	}

}
