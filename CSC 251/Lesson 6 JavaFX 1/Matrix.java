import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;    
import java.util.Random;

public class Matrix extends Application {
	
	public void start(Stage primaryStage) {

		int SIZE = 10;
        int length = SIZE;
        int width = SIZE;
        GridPane pane = new GridPane();    
        
        for(int y = 0; y < length; y++){
        	for(int x = 0; x < width; x++){
        		Random rand = new Random();
                int rand1 = rand.nextInt(2);

                TextField tf = new TextField();
                tf.setAlignment(Pos.CENTER);
                tf.setEditable(false);
                tf.setText(Integer.toString(rand1)); 

                pane.setRowIndex(tf,y);
                pane.setColumnIndex(tf,x);    
                pane.getChildren().add(tf);
        	}
        }

        Scene scene = new Scene(pane, 250, 250);    
        primaryStage.setTitle("Matrix of 0's and 1's)");
        primaryStage.setScene(scene);
        primaryStage.show();
	}

	public static void main(String[] args) {    
		Matrix.launch(args);
	}    
}