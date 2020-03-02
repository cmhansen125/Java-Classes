/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: SpreadSheetWriter
*	File: SSRow.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

public class SSRow {
	
	private String category;
	private int scoreInputted;
	private int weightOfScore;
	private String calculation;	
	
	public SSRow() {
		
	}
	
	public SSRow(String name, int score, int weight, String calc) {
		category = name;
		scoreInputted = score;
		weightOfScore = weight;
		calculation = calc;
	}
	
	public void setCategory(String name) {
		category = name;
	}
	
	public void setScore(int score) {
		scoreInputted = score;
	}
	
	public void setWeightForCategory(int weight) {
		weightOfScore = weight;
	}
	
	public void setCalculation(String calc) {
		calculation = calc;
	}
	
	public String toString() {
		return category + ',' + scoreInputted + ',' + weightOfScore + ',' + calculation;
	}

}