import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DataSetBookGUI extends Application {
	
	private DataSetBook library1;
	private Book book;
	private TextField author;
	private TextField title;
	private TextField pages;
	private String authorToAdd;
	private String titleToAdd;
	private String pagesToAdd;
	private int pagesConverted;
	private TextArea library;
	
	public void start(Stage primaryStage) {
		library1 = new DataSetBook();
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_LEFT);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setHgap(5);
		pane.setVgap(5);
		
		pane.add(new Label("Title"), 0, 0);
		pane.add(new Label("Author"), 1, 0);
		pane.add(new Label("Pages"), 2, 0);
		author = new TextField();
		title = new TextField();
		pages = new TextField();
		pane.add(title, 0, 1);
		pane.add(author, 1, 1);
		pane.add(pages, 2, 1);
		Button btAdd = new Button("Make New Book");
		pane.add(btAdd, 3, 1);
		MakeNewBook handler1 = new MakeNewBook();
		btAdd.setOnAction(handler1);
		Label collection = new Label("This Library contains:");
		
		pane.add(collection, 0, 3);
		library = new TextArea();
		library.setEditable(false);
		library.setPrefColumnCount(30);
		pane.add(library, 0, 4);
		
		
		
		Scene scene = new Scene(pane, 800, 500);
		primaryStage.setTitle("DataSetLibrary");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	class MakeNewBook implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			
			authorToAdd = author.getText();
			titleToAdd = title.getText();
			pagesToAdd = pages.getText();
			pagesConverted = Integer.parseInt(pagesToAdd);
			book = new Book(authorToAdd, titleToAdd, pagesConverted);
			library1.add(book);
			String libraryText = library1.toString();
			library.setText(libraryText);
			author.setText("");
			title.setText("");
			pages.setText("");
		}
	}
	public static void main(String[] args) {
		DataSetBookGUI.launch(args);
	}
}
