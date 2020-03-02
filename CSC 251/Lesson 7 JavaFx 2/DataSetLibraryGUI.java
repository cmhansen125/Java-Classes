import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DataSetLibraryGUI extends Application {
	
	private DataSetLibrary library1;
	private Book book;
	private Video video;
	private TextField author;
	private TextField title;
	private TextField pages;
	private String authorToAdd;
	private String titleToAdd;
	private String pagesToAdd;
	private int pagesConverted;
	private TextField director;
	private TextField vTitle;
	private TextField minutes;
	private TextField actor;
	private TextField actress;
	private String directorToAdd;
	private String vTitleToAdd;
	private String minutesToAdd;
	private String actorToAdd;
	private String actressToAdd;
	private int minutesConverted;
	private TextArea library;
	
	public void start(Stage primaryStage) {
		library1 = new DataSetLibrary();
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
		btAdd.setOnAction((ActionEvent e) -> {
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
		});
		
		pane.add(new Label("Title"), 0, 3);
		pane.add(new Label("Director"), 1, 3);
		pane.add(new Label("Minutes"), 2, 3);
		vTitle = new TextField();
		director = new TextField();
		minutes = new TextField();
		pane.add(vTitle, 0, 4);
		pane.add(director, 1, 4);
		pane.add(minutes, 2, 4);
		pane.add(new Label("Actor"), 1, 5);
		pane.add(new Label("Actress"), 2, 5);
		actor = new TextField();
		actress = new TextField();
		pane.add(actor, 1, 6);
		pane.add(actress, 2, 6);
		Button btAdd2 = new Button("Make New Video");
		pane.add(btAdd2, 3, 5);
		
		btAdd2.setOnAction((e) -> {
			vTitleToAdd = vTitle.getText();
			directorToAdd = director.getText();
			minutesToAdd = minutes.getText();
			minutesConverted = Integer.parseInt(minutesToAdd);
			actorToAdd = actor.getText();
			actressToAdd = actress.getText();
			video= new Video(vTitleToAdd, directorToAdd, actorToAdd, actressToAdd, 
					minutesConverted);
			library1.add(video);
			String libraryText = library1.toString();
			library.setText(libraryText);
			vTitle.setText("");
			director.setText("");
			minutes.setText("");
			actor.setText("");
			actress.setText("");
		});
		
		Label collection = new Label("This Library contains:");
		
		pane.add(collection, 0, 8);
		library = new TextArea();
		library.setEditable(false);
		library.setPrefColumnCount(30);
		library.setPrefRowCount(20);
		pane.add(library, 0, 9);
		
		Scene scene = new Scene(pane, 805, 600);
		primaryStage.setTitle("DataSetBook GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}

	public static void main(String[] args) {
		DataSetLibraryGUI.launch(args);
	}
}
