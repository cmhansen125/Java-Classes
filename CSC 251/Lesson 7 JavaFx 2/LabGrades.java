import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LabGrades extends Application {
	
	private TextField labs;
	private TextField projectOne;
	private TextField midterm;
	private TextField projectTwo;
	private TextField finalExam;
	private String labsToAdd;
	private String projectOneToAdd;
	private String midtermToAdd;
	private String projectTwoToAdd;
	private String finalExamToAdd;
	private double labsConverted;
	private double projectOneConverted;
	private double midtermConverted;
	private double projectTwoConverted;
	private double finalConverted;
	private double gradeMath;
	private Label finalgrade;
	
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_LEFT);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setHgap(10);
		pane.setVgap(10);

		pane.add(new Label("GradeBook"), 1, 0);
		
		pane.add(new Label("Labs"), 0, 1);
		pane.add(new Label("Project 1"), 0, 2);
		pane.add(new Label("Midterm"), 0, 3);
		pane.add(new Label("Project 2"), 0, 4);
		pane.add(new Label("Final"), 0, 5);
		
		pane.add(new Label("Weight: 25%"), 1, 1);
		pane.add(new Label("Weight 12.5%"), 1, 2);
		pane.add(new Label("Weight 25%"), 1, 3);
		pane.add(new Label("Weight 12.5%"), 1, 4);
		pane.add(new Label("Weight 25%"), 1, 5);
		
		labs = new TextField();
		labs.setPrefWidth(100);
		projectOne = new TextField();
		projectOne.setPrefWidth(100);
		midterm = new TextField();
		midterm.setPrefWidth(100);
		projectTwo = new TextField();
		projectTwo.setPrefWidth(100);
		finalExam = new TextField();
		finalExam.setPrefWidth(100);
		pane.add(labs, 2, 1);
		pane.add(projectOne, 2, 2);
		pane.add(midterm, 2, 3);
		pane.add(projectTwo, 2, 4);
		pane.add(finalExam, 2, 5);
		
		Button btAdd = new Button("Calculate Grade");
		pane.add(btAdd, 2, 6);
		btAdd.setOnAction((ActionEvent e) -> {
			labsToAdd = labs.getText();
			labsConverted = Double.parseDouble(labsToAdd);
			projectOneToAdd = projectOne.getText();
			projectOneConverted = Double.parseDouble(projectOneToAdd);
			midtermToAdd = midterm.getText();
			midtermConverted = Double.parseDouble(midtermToAdd);
			projectTwoToAdd = projectTwo.getText();
			projectTwoConverted = Double.parseDouble(projectTwoToAdd);
			finalExamToAdd = finalExam.getText();
			finalConverted = Double.parseDouble(finalExamToAdd);
			gradeMath = ((.25) * labsConverted) + ((.125) * projectOneConverted) +
					((.25) * midtermConverted) + ((.125) * projectTwoConverted) +
					((.25) * finalConverted);
			finalgrade.setText(gradeMath + "%");
			labs.setText("");
			projectOne.setText("");
			midterm.setText("");
			projectTwo.setText("");
			finalExam.setText("");
			});		
		
		pane.add(new Label("Final Grade"), 1, 7);
		finalgrade = new Label();
		pane.add(finalgrade, 2, 7);
		
		
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("GradeBook GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		LabGrades.launch(args);
	}
}
