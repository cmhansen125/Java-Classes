/** Course: CSC 151 Spring 2016
*   Section: 0002
*
*	Project: SpreadSheetWriter
*	File: SSWriter.java
*
*	Name: Coree Hansen
*	Email: cmhansen@my.waketech.edu
*/

import java.io.*;
import java.util.Scanner;
public class SSWriter {
	
	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("MyGrades.csv");
		Scanner input = new Scanner(System.in);
		
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		System.out.println("What grade did you receive for Labs? ");
		int score = input.nextInt();
		SSRow labs = new SSRow();
		labs.setCategory("Labs");
		labs.setWeightForCategory(20);
		labs.setScore(score);
		labs.setCalculation("=B1*C1/100");
		output.println(labs);
		
		System.out.println("What grade did you receive for the Reading Quizzes? ");
		score = input.nextInt();
		SSRow quizzes = new SSRow();
		quizzes.setCategory("Reading Quizzes");
		quizzes.setWeightForCategory(15);
		quizzes.setScore(score);
		quizzes.setCalculation("=B2*C2/100");
		output.println(quizzes);
		
		System.out.println("What grade did you receive for the Midterm? ");
		score = input.nextInt();
		SSRow midterm = new SSRow();
		midterm.setCategory("Midterm");
		midterm.setWeightForCategory(25);
		midterm.setScore(score);
		midterm.setCalculation("=B3*C3/100");
		output.println(midterm);
		
		System.out.println("What grade did you receive for the Project? ");
		score = input.nextInt();
		SSRow project = new SSRow();
		project.setCategory("Project");
		project.setWeightForCategory(15);
		project.setScore(score);
		project.setCalculation("=B4*C4/100");
		output.println(project);
		
		System.out.println("What grade did you receive for the Final? ");
		score = input.nextInt();
		SSRow exam = new SSRow();
		exam.setCategory("Reading Quizzes");
		exam.setWeightForCategory(25);
		exam.setScore(score);
		exam.setCalculation("=B5*C5/100");
		output.println(exam);
		
		output.print("Average" + ',' + "=(D1+D2+D3+D4+D5+D6+D7)");
		
		
		output.close();
		
	}

}