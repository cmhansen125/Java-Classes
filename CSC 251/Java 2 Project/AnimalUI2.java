import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class AnimalUI2 extends Application { 	

	 
	private Exhibit<Integer, Animal>  africa = new Exhibit<Integer, Animal>();
	private Exhibit<Integer, Animal>  aviary = new Exhibit<Integer, Animal>();
	private Exhibit<Integer, Animal>  noAmerica = new Exhibit<Integer, Animal>();
	
	
    // protected BorderPane getPane() {
	
	protected Pane getPane() throws IOException, FileNotFoundException {   	 
		
		Animal a;
		String line;
		String restOfLine;
		String character;
		String nameFile;
		String classFile;
		String genusFile;
		String orderFile;
		String groupFile;
		String familyFile;
		int heightFile;
		int weightFile;
		String subExhibitFile;
		String factsFile;
		String statusFile;
		int tagNumberFile;
		int comma;
		File f = new File("Africa.txt");
		if(!f.exists()) {
			africa.writeToFile("Africa");
		}
		FileReader fR =  new FileReader("Africa.txt");
		BufferedReader bR = new BufferedReader(fR);
		
		while ((line = bR.readLine()) != null) {
			restOfLine = line;
			comma = line.indexOf(",");
			character = line.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			nameFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			classFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			genusFile= restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			orderFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			groupFile= restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			familyFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			heightFile = Integer.parseInt(restOfLine.substring(1, comma-1));
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			weightFile = Integer.parseInt(restOfLine.substring(1, comma-1));
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			subExhibitFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			
			comma = restOfLine.indexOf(",");
			factsFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			comma = restOfLine.indexOf(",");
			statusFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
			
			tagNumberFile = Integer.parseInt(restOfLine.substring(1));
			
			 if(classFile.equals("Land")) {
					try {
						a= new LandAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
								weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
						africa.put(a.getTagNumber(), a);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 } else if (classFile.equals("Water")) {
				 try {
						a= new WaterAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
								weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
						africa.put(a.getTagNumber(), a);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 } else {
				 try {
						a= new AirAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
								weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
						africa.put(a.getTagNumber(), a);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 }
			 System.out.println(africa.toString());
			 bR.close();
		}
		
		File fA = new File("Aviary.txt");
		if(!fA.exists()) {
			aviary.writeToFile("Aviary");
		}
		
		FileReader fRA = new FileReader("Aviary.txt");
		BufferedReader bRA = new BufferedReader(fRA);
				
		while ((line = bRA.readLine()) != null) {
			restOfLine = line;
			comma = line.indexOf(",");
			character = line.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			nameFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			classFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
				
			comma = restOfLine.indexOf(",");
			genusFile= restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			orderFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			groupFile= restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			familyFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
				
			comma = restOfLine.indexOf(",");
			heightFile = Integer.parseInt(restOfLine.substring(1, comma-1));
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			weightFile = Integer.parseInt(restOfLine.substring(1, comma-1));
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			subExhibitFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			factsFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			statusFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			tagNumberFile = Integer.parseInt(restOfLine.substring(1));
					
			if(classFile.equals("Land")) {
				try {
					a= new LandAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
								weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
					aviary.put(a.getTagNumber(), a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (classFile.equals("Water")) {
				try {
					a= new WaterAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
								weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
					aviary.put(a.getTagNumber(), a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					a= new AirAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
							weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
					aviary.put(a.getTagNumber(), a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(aviary.toString());
			bRA.close();
		}
		
		File fNA = new File("North America.txt");
		if(!fNA.exists()) {
			noAmerica.writeToFile("North America");
		}
		FileReader fRNA = new FileReader("North America.txt");
		BufferedReader bRNA = new BufferedReader(fRNA);
				
		while ((line = bRNA.readLine()) != null) {
			restOfLine = line;
			comma = line.indexOf(",");
			character = line.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			nameFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			classFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			genusFile= restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			orderFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			groupFile= restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			familyFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
				
			comma = restOfLine.indexOf(",");
			heightFile = Integer.parseInt(restOfLine.substring(1, comma-1));
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			weightFile = Integer.parseInt(restOfLine.substring(1, comma-1));
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			subExhibitFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			factsFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			comma = restOfLine.indexOf(",");
			statusFile = restOfLine.substring(0, comma);
			restOfLine = restOfLine.substring(comma + 1);
					
			tagNumberFile = Integer.parseInt(restOfLine.substring(1));
					
			if(classFile.equals("Land")) {
				try {
					a= new LandAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
								weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
					noAmerica.put(a.getTagNumber(), a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (classFile.equals("Water")) {
				try {
					a= new WaterAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
								weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
					noAmerica.put(a.getTagNumber(), a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					a= new AirAnimals(nameFile,classFile, genusFile, orderFile, groupFile, familyFile,heightFile,
							weightFile,subExhibitFile ,factsFile , statusFile,tagNumberFile);
					noAmerica.put(a.getTagNumber(), a);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(noAmerica.toString());
			bRNA.close();
		}
		
		/**
		 * Boxes for main panel
		 */
    	HBox headerBox = new HBox();
    	headerBox.setPrefWidth(600);  
    	
    	HBox infoBox = new HBox();
    	infoBox.setPrefWidth(600); 
    	
    	HBox buttonBox = new HBox();
    	buttonBox.setPrefWidth(600); 
    	
    	Separator separator1 = new Separator(); 
    	
    	HBox info2Box = new HBox();
    	info2Box.setPrefWidth(600); 
    	 
    	HBox zooBox = new HBox();
    	zooBox.setPrefWidth(600);     	
    	HBox groupBox = new HBox();
    	groupBox.setPrefWidth(500);     	
    	HBox exhibitBox = new HBox();
    	exhibitBox.setPrefWidth(500);  
    	
    	/**
    	 * Boxes for stack panel
    	 */
    	HBox adminButtonsBox = new HBox();
    	adminButtonsBox.setPrefWidth(500); 
    	adminButtonsBox.setPrefHeight(35);
 	         	
    	 
    	Text headerLabel  = new Text(" Welcome to the NC Zoo!  ");
    	headerLabel.setStyle("-fx-font-size: 14pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
         
    	headerLabel.setTextAlignment(TextAlignment.CENTER); 
    	Text infoLabel  =  new Text(" Click an area below to learn more information. ");
    	infoLabel.setTextAlignment(TextAlignment.CENTER); 
    	Region headerregion = new Region(); 
    	headerregion.setMinWidth(200);
    	
    	Region inforegion = new Region(); 
    	inforegion.setMinWidth(200);
      
        ToggleButton zooSubmit = new ToggleButton("Animals Admin");
        zooSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        
        ToggleButton groupSubmit = new ToggleButton("View Animals");
        groupSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        ToggleButton areaSubmit = new ToggleButton("Zoo Exhibits");
        areaSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        //white space between buttons
        Region button = new Region();
        button.setMinWidth(30);
        Region button1 = new Region();
        button1.setMinWidth(75);
        Region button2 = new Region();
        button2.setMinWidth(75);
        Region button3 = new Region();
        button3.setMinWidth(40);         
          
        //white space between buttons
        Region button4 = new Region();
        button4.setMinWidth(30);
        Region button5 = new Region();
        button5.setMinWidth(75);
        Region button6 = new Region();
        button6.setMinWidth(75);
         
        headerBox.getChildren().addAll(headerregion, headerLabel);  
        infoBox.getChildren().addAll(inforegion, infoLabel); 
        buttonBox.getChildren().addAll(button,zooSubmit,button1,groupSubmit,button2,areaSubmit);  
        info2Box.getChildren().addAll(button3);
           
        GridPane pane = new GridPane();
        
        //Setting size for the pane  
        pane.setPadding(new Insets(5,5,5,15));
        pane.setHgap(5);
        pane.setVgap(5);    

        pane.add(headerBox,0,0);
        pane.add(infoBox,0,1); 
        pane.add(buttonBox, 0, 2);       
       
                        
        Image image = new Image("File:NCZoo_ColorLogo.jpg"); 
        //stack.getChildren().addAll(adminButtonsBox);
                 
        StackPane formstack = new StackPane();
        
        //Image image = new Image("File:NCZoo_ColorLogo.jpg"); 
        //stack.getChildren().addAll(adminButtonsBox);
        //stack).add(new ImageView(image),4,4);
        
        pane.add(separator1, 0, 3);
         
        pane.add(info2Box, 0, 4);
        pane.add(formstack, 0, 5);
   
        /** 
         * Animals Admin Buttons
         */
         
        Button addSubmit = new Button("Add Animal");
        zooSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        Button removeSubmit = new Button("Remove Animal");
        groupSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        Button updateSubmit = new Button("Update Animal");
        areaSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        zooBox.getChildren().addAll(button3,addSubmit,button5,updateSubmit,button6,removeSubmit); 
        
        /** 
         * View Animals Button
         */
         
        Region button7 = new Region();
        button7.setPrefWidth(75);
        Button alphaSubmit = new Button("Alphabetically");
        alphaSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        alphaSubmit.setPrefWidth(120);
        
        Button a_classSubmit = new Button("Class");
        a_classSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        a_classSubmit.setPrefWidth(120);
        
        Button a_groupSubmit = new Button("Group");
        a_groupSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        a_groupSubmit.setPrefWidth(120);
        
        Button picturesSubmit = new Button("Pictures");
        picturesSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        picturesSubmit.setPrefWidth(120);
        
        groupBox.getChildren().addAll(button7,alphaSubmit,a_classSubmit,a_groupSubmit,picturesSubmit); 
                
        /** 
         * View Animals Button
         */
         
        Region button8 = new Region();
        button7.setPrefWidth(30);
        Button africaSubmit = new Button("Africa");
        africaSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        africaSubmit.setPrefWidth(50);
        
        Button noamericaSubmit = new Button("North America");
        noamericaSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        noamericaSubmit.setPrefWidth(50);
        
        Button aviarySubmit = new Button("Aviary");
        aviarySubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        aviarySubmit.setPrefWidth(50);
               
        exhibitBox.getChildren().addAll(button7,africaSubmit,noamericaSubmit,aviarySubmit); 
        

        /***
         * ADMIN SUBPANEL USED BY ADD
         */        
      
        VBox labelpane = new VBox(13);
    	labelpane.setPrefWidth(90);
    	VBox fieldpane = new VBox(5);
    	fieldpane.setPrefWidth(90);
    	VBox label1pane = new VBox(13);
    	label1pane.setPrefWidth(70);
    	VBox field1pane = new VBox(5);
    	field1pane.setPrefWidth(90);
    	HBox buttonpane1 = new HBox(1);
    	HBox resultspane = new HBox(5); 
     
    	Label animalLabel  = new Label("Animal Name:  ");
    	Label classLabel  = new Label("Land/Water/Air:"); //list
    	Label familyLabel  = new Label("Family: "); //list
    	Label orderLabel  = new Label("Order: ");
    	Label groupLabel  = new Label("Group: ");
    	Label genusLabel  = new Label("Genus:  ");
    	Label heightLabel = new Label("  Height:  ");
    	Label weightLabel  = new Label("  Weight: ");
    	Label exhibitLabel  = new Label("  Exhibit:  "); // list
    	Label funLabel = new Label("  FunFacts:  ");
    	Label statusLabel = new Label("  Status:  ");
    	Label tagLabel = new Label("  Tag ID:  "); 
    	Label resultsLabel = new Label("Results:  ");  
    	
    	Button addAnimalSubmit = new Button("Add");
        addAnimalSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        TextField animalField = new TextField ("");       
        TextField classField = new TextField ("");
        TextField familyField = new TextField("");  
        TextField orderField = new TextField("");
        TextField groupField = new TextField("");
        TextField genusField = new TextField("");
        TextField heightField = new TextField("0"); 
        TextField weightField = new TextField("0"); 
        TextField exhibitField = new TextField(""); 
        TextField funField = new TextField(""); 
        TextField statusField = new TextField(""); 
        TextField tagField = new TextField("");

        TextField resultsField = new TextField("");  
        resultsField.setMinWidth(500);
        Region region1 = new Region();
        region1.setMinWidth(30);
                        
        labelpane.getChildren().addAll(animalLabel,classLabel,familyLabel,orderLabel,groupLabel,genusLabel); 
        fieldpane.getChildren().addAll(animalField,classField,familyField,orderField,groupField,genusField ); 
        label1pane.getChildren().addAll(heightLabel,weightLabel,exhibitLabel,funLabel,statusLabel,tagLabel); 
        field1pane.getChildren().addAll(heightField,weightField,exhibitField,funField,statusField,tagField); 
    
        buttonpane1.getChildren().addAll(addAnimalSubmit, region1); 
        resultspane.getChildren().addAll(resultsLabel,resultsField);
       
        GridPane centerPane = new GridPane();
        
        centerPane.add(labelpane, 0,0);
        centerPane.add(fieldpane, 1,0);
        centerPane.add(label1pane, 2,0);
        centerPane.add(field1pane, 3,0);
        centerPane.setHgap(4);
        centerPane.setVgap(4);  
        
        BorderPane adminAddPane = new BorderPane();
        adminAddPane.setMinHeight(200);
        adminAddPane.setMinHeight(215);
        adminAddPane.setStyle("-fx-background-color: #A9A9A9;");        
       
        adminAddPane.setPadding(new Insets(5,5,5,5));         
        
        adminAddPane.setCenter(centerPane); 
        adminAddPane.setLeft(buttonpane1);
        adminAddPane.setBottom(resultspane);

    	
      /**
      * ADMIN PANEL - USED BY UPDATE
      */ 

        Label updateTagLabel  = new Label(" Tag ID:  "); 
        TextField updateTagField = new TextField("");
        Button updateSearchSubmit = new Button("Search");
        updateSearchSubmit.setStyle("-fx-font-size: 8pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        Label animalSpacer = new Label("Animal: ");
        Label animalTagNumber = new Label("");
        Label resultsTagLabel  = new Label(" Results:  ");
        Label resultsTagField = new Label("");        
        Region regionUpdate = new Region();
        regionUpdate.setMinWidth(25);        
        
        VBox labelpaneUpdate = new VBox(13);
    	labelpaneUpdate.setPrefWidth(90);
    	VBox fieldpaneUpdate = new VBox(5);
    	fieldpaneUpdate.setPrefWidth(90);
    	VBox label1paneUpdate = new VBox(13);
    	label1paneUpdate.setPrefWidth(70);
    	VBox field1paneUpdate = new VBox(5);
    	field1paneUpdate.setPrefWidth(90);
    	HBox buttonpane1Update = new HBox(1); 
     
    	Label animalLabelUpdate  = new Label("Animal Name:  ");
    	Label classLabelUpdate  = new Label("Land/Water/Air:"); //list
    	Label familyLabelUpdate  = new Label("Family: "); //list
    	Label orderLabelUpdate  = new Label("Order: ");
    	Label groupLabelUpdate  = new Label("Group: ");
    	Label genusLabelUpdate  = new Label("Genus:  ");
    	Label heightLabelUpdate = new Label("  Height:  ");
    	Label weightLabelUpdate  = new Label("  Weight: ");
    	Label exhibitLabelUpdate  = new Label("  Exhibit:  "); // list
    	Label funLabelUpdate = new Label("  FunFacts:  ");
    	Label statusLabelUpdate = new Label("  Status:  ");
    	Label tagLabelUpdate = new Label("  Tag ID:  "); 
    	
    	Button updateAnimalSubmit = new Button("Update");
        updateAnimalSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        Label updateAnimalField = new Label("Ready for Update.");
        
        TextField animalFieldUpdate = new TextField ("");       
        TextField classFieldUpdate = new TextField ("");
        TextField familyFieldUpdate = new TextField("");  
        TextField orderFieldUpdate = new TextField("");
        TextField groupFieldUpdate = new TextField("");
        TextField genusFieldUpdate = new TextField("");
        TextField heightFieldUpdate = new TextField(""); 
        TextField weightFieldUpdate = new TextField(""); 
        TextField exhibitFieldUpdate = new TextField(""); 
        TextField funFieldUpdate = new TextField(""); 
        TextField statusFieldUpdate = new TextField(""); 
        TextField tagFieldUpdate = new TextField("");
                        
        labelpaneUpdate.getChildren().addAll(animalLabelUpdate,classLabelUpdate,familyLabelUpdate,orderLabelUpdate,groupLabelUpdate,genusLabelUpdate); 
        fieldpaneUpdate.getChildren().addAll(animalFieldUpdate,classFieldUpdate,familyFieldUpdate,orderFieldUpdate,groupFieldUpdate,genusFieldUpdate); 
        label1paneUpdate.getChildren().addAll(heightLabelUpdate,weightLabelUpdate,exhibitLabelUpdate,funLabelUpdate,statusLabelUpdate,tagLabelUpdate); 
        field1paneUpdate.getChildren().addAll(heightFieldUpdate,weightFieldUpdate,exhibitFieldUpdate,funFieldUpdate,statusFieldUpdate,tagFieldUpdate); 
    
        buttonpane1Update.getChildren().addAll(updateAnimalSubmit, regionUpdate); 
       
        GridPane centerPaneUpdate = new GridPane();
        
        centerPaneUpdate.add(labelpaneUpdate, 0,0);
        centerPaneUpdate.add(fieldpaneUpdate, 1,0);
        centerPaneUpdate.add(label1paneUpdate, 2,0);
        centerPaneUpdate.add(field1paneUpdate, 3,0);
        centerPaneUpdate.setHgap(4);
        centerPaneUpdate.setVgap(4);  
        
        BorderPane adminUpdatePane = new BorderPane(); 
        adminUpdatePane.setMinHeight(200);
        adminUpdatePane.setMinHeight(300);
        adminUpdatePane.setStyle("-fx-background-color: #A9A9A9;");        
       
        adminUpdatePane.setPadding(new Insets(15,15,15,15));
        FlowPane topPane = new FlowPane();
        topPane.setPadding(new Insets(5,15,15,15));
        topPane.setHgap(5);
        topPane.setVgap(5);
        topPane.getChildren().addAll(updateTagLabel,updateTagField, updateSearchSubmit,animalSpacer,animalTagNumber, resultsTagLabel,resultsTagField);
        
        FlowPane botPane = new FlowPane();
        botPane.setPadding(new Insets(15,15,15,15));
        botPane.setHgap(15);
        botPane.setVgap(5);
        botPane.getChildren().addAll(updateAnimalSubmit,updateAnimalField);

        
        adminUpdatePane.setTop(topPane);
        adminUpdatePane.setCenter(centerPaneUpdate);
        adminUpdatePane.setBottom(botPane);
        /**
         * REMOVE PANEL
         */
        
        
        Label removeTagLabel  = new Label(" Tag ID:  "); 
        TextField removeTagField = new TextField("");
        Button removeSearchSubmit = new Button("Search");
        removeSearchSubmit.setStyle("-fx-font-size: 8pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        Label removeTagLabel1  = new Label(" Results:  "); 
        TextField removeTagField1 = new TextField("");
        Button removeRemoveSubmit = new Button("Remove?");
        removeRemoveSubmit.setStyle("-fx-font-size: 8pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        Label removeRemoveLabel = new Label("  Waiting...");
        
        
        BorderPane adminRemovePane = new BorderPane();
        HBox topPaneRemove = new HBox(15);
        topPaneRemove.getChildren().addAll(removeTagLabel, removeTagField, removeSearchSubmit);
        VBox centerPaneRemove = new VBox(15);
        centerPaneRemove.getChildren().addAll(removeTagLabel1, removeTagField1);
        HBox botPaneRemove = new HBox(15);
        botPaneRemove.getChildren().addAll(removeRemoveSubmit, removeRemoveLabel);
        
        adminRemovePane.setMinHeight(200);
        adminRemovePane.setMinHeight(300);
        adminRemovePane.setStyle("-fx-background-color: #A9A9A9;");        
        adminRemovePane.setPadding(new Insets(15,15,15,15));
        
        adminRemovePane.setTop(topPaneRemove);
        adminRemovePane.setCenter(centerPaneRemove);
        adminRemovePane.setBottom(botPaneRemove);
        
       
        /***
         * VIEW SUBPANEL
         */        
      
    	HBox alphapane = new HBox(200);
    	alphapane.setPrefWidth(90);
    	VBox classpane = new VBox(5);
    	classpane.setPrefWidth(90);
    	VBox by_grouppane = new VBox(12);
    	by_grouppane.setPrefWidth(70);
    	VBox picturepane = new VBox(5);
    	picturepane.setPrefWidth(90);
    	 
        /**
        * ButtonSubmit presents information in the text area for each of the 3 main panels
        *
        */
    
    	class ByClassHandler implements EventHandler<ActionEvent> {

    		@Override
             public void handle(ActionEvent event) {
        	    System.out.println(event.getClass().getName());
                
             }
        } 

     updateSearchSubmit.setOnAction(new EventHandler<ActionEvent>() {
    	 @Override
    	 public void handle(ActionEvent event) {  
    	 
    		 String animaln =  "";
             String classf =  "";
             String family =   "";
             String order =  "";
             String group = "";
             String genus =   "";
             int height = 0;
             int weight = 0;
             String exhibit =  "";
             String fun =  "";
             String status =   "";
             int tag =   0;
             
             tag = Integer.parseInt(updateTagField.getText());
             Animal updatedAnimal;
             if (africa.containsKey(tag)) {
            	 animalTagNumber.setText(Integer.toString(tag));
            	 resultsTagField.setText("Here is the animal.");
            	 updatedAnimal = africa.getAnimalByTag(tag);
            	 animaln = updatedAnimal.getName();
            	 classf = updatedAnimal.getC_lass();
            	 family = updatedAnimal.getFamily();
            	 order = updatedAnimal.getOrder();
            	 group = updatedAnimal.getGroup();
            	 genus = updatedAnimal.getGenus();
            	 height = updatedAnimal.getHeight();
            	 weight = updatedAnimal.getWeight();
            	 exhibit = updatedAnimal.getSubExhibit();
            	 fun = updatedAnimal.getFunFacts();
            	 status = updatedAnimal.getStatus();
            	 
            	 animalFieldUpdate.setText(animaln);
            	 classFieldUpdate.setText(classf);
            	 familyFieldUpdate.setText(family);
            	 orderFieldUpdate.setText(order);
            	 groupFieldUpdate.setText(group);
            	 genusFieldUpdate.setText(genus);
            	 heightFieldUpdate.setText(Integer.toString(height));
            	 weightFieldUpdate.setText(Integer.toString(weight));
            	 exhibitFieldUpdate.setText(exhibit);
            	 funFieldUpdate.setText(fun);
            	 statusFieldUpdate.setText(status);
            	 tagFieldUpdate.setText(Integer.toString(tag));
            	 
             } else if (aviary.containsKey(tag)) {
            	 animalTagNumber.setText(Integer.toString(tag));
            	 resultsTagField.setText("Here is the animal.");
            	 updatedAnimal = aviary.getAnimalByTag(tag);
            	 animaln = updatedAnimal.getName();
            	 classf = updatedAnimal.getC_lass();
            	 family = updatedAnimal.getFamily();
            	 order = updatedAnimal.getOrder();
            	 group = updatedAnimal.getGroup();
            	 genus = updatedAnimal.getGenus();
            	 height = updatedAnimal.getHeight();
            	 weight = updatedAnimal.getWeight();
            	 exhibit = updatedAnimal.getSubExhibit();
            	 fun = updatedAnimal.getFunFacts();
            	 status = updatedAnimal.getStatus();
            	 
            	 animalFieldUpdate.setText(animaln);
            	 classFieldUpdate.setText(classf);
            	 familyFieldUpdate.setText(family);
            	 orderFieldUpdate.setText(order);
            	 groupFieldUpdate.setText(group);
            	 genusFieldUpdate.setText(genus);
            	 heightFieldUpdate.setText(Integer.toString(height));
            	 weightFieldUpdate.setText(Integer.toString(weight));
            	 exhibitFieldUpdate.setText(exhibit);
            	 funFieldUpdate.setText(fun);
            	 statusFieldUpdate.setText(status);
            	 tagFieldUpdate.setText(Integer.toString(tag));
               		
             } else if (noAmerica.containsKey(tag)) {
            	 animalTagNumber.setText(Integer.toString(tag));
            	 resultsTagField.setText("Here is the animal.");
            	 updatedAnimal = noAmerica.getAnimalByTag(tag);
            	 animaln = updatedAnimal.getName();
            	 classf = updatedAnimal.getC_lass();
            	 family = updatedAnimal.getFamily();
            	 order = updatedAnimal.getOrder();
            	 group = updatedAnimal.getGroup();
            	 genus = updatedAnimal.getGenus();
            	 height = updatedAnimal.getHeight();
            	 weight = updatedAnimal.getWeight();
            	 exhibit = updatedAnimal.getSubExhibit();
            	 fun = updatedAnimal.getFunFacts();
            	 status = updatedAnimal.getStatus();
            	 
            	 animalFieldUpdate.setText(animaln);
            	 classFieldUpdate.setText(classf);
            	 familyFieldUpdate.setText(family);
            	 orderFieldUpdate.setText(order);
            	 groupFieldUpdate.setText(group);
            	 genusFieldUpdate.setText(genus);
            	 heightFieldUpdate.setText(Integer.toString(height));
            	 weightFieldUpdate.setText(Integer.toString(weight));
            	 exhibitFieldUpdate.setText(exhibit);
            	 funFieldUpdate.setText(fun);
            	 statusFieldUpdate.setText(status);
            	 tagFieldUpdate.setText(Integer.toString(tag));
               		
             } else {
            	 resultsTagField.setText("Animal not in catalog.");
            	 animalTagNumber.setText("");
            	 animalFieldUpdate.setText("");
            	 classFieldUpdate.setText("");
            	 familyFieldUpdate.setText("");
            	 orderFieldUpdate.setText("");
            	 groupFieldUpdate.setText("");
            	 genusFieldUpdate.setText("");
            	 heightFieldUpdate.setText("");
            	 weightFieldUpdate.setText("");
            	 exhibitFieldUpdate.setText("");
            	 funFieldUpdate.setText("");
            	 statusFieldUpdate.setText("");
            	 tagFieldUpdate.setText("");
             }
             
             updateTagField.setText("");;
               
             
        }
    });
      	
   removeSearchSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
       @Override
       public void handle(ActionEvent event) {  
       
    	   int tag =   Integer.parseInt(removeTagField.getText());
 
    	   if (africa.containsKey(tag)) {
    		   removeTagField1.setText(africa.getAnimalByTag(tag).toString());
    		   removeRemoveLabel.setText("Animal Ready to Remove");
    	   } else if (aviary.containsKey(tag)) {
    		   removeTagField1.setText(aviary.getAnimalByTag(tag).toString());
    		   removeRemoveLabel.setText("Animal Ready to Remove");
    	   } else if (noAmerica.containsKey(tag)) {
    		   removeTagField1.setText(noAmerica.getAnimalByTag(tag).toString());
    		   removeRemoveLabel.setText("Animal Ready to Remove");
    	   } else {
				removeRemoveLabel.setText("Tag is not found");
			}				
        }
    }); 
   
   removeRemoveSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
       @Override
       public void handle(ActionEvent event) {  
       
    	   int tag =   Integer.parseInt(removeTagField.getText());
 
    	   if (africa.containsKey(tag)) {
    		   africa.remove(tag);
    		   removeRemoveLabel.setText("Animal Removed From Africa");
    	   } else if (aviary.containsKey(tag)) {
    		  aviary.remove(tag);
    		   removeRemoveLabel.setText("Animal Removed From Aviary");
    	   } else if (noAmerica.containsKey(tag)) {
    		   noAmerica.remove(tag);
    		   removeRemoveLabel.setText("Animal Removed North America");
    	   } else {
    		   removeRemoveLabel.setText("Error; Tag not found.  Make sure Tag Number is the Same as Search Results");
    	   }				
        }
    }); 
            
                   	
    addAnimalSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
    	@Override
        public void handle(ActionEvent event) {  
        	
        	String animaln =  "";
            String classf =  "";
            String family =   "";
            String order =  "";
            String group = "";
            String genus =   "";
            int height = 0;
            int weight = 0;
            String exhibit =  "";
            String fun =  "";
            String status =   "";
            int tag =   0;
            String result = "";
        	
            animaln =  animalField.getText();
            classf =  classField.getText();
            family =  familyField.getText();
            order =  orderField.getText();
            group =  groupField.getText(); 
            genus =  genusField.getText();              
            height =  Integer.parseInt(heightField.getText()); 
            
            weight =  Integer.parseInt(weightField.getText()); 
            exhibit =  exhibitField.getText(); 
            fun =  funField.getText(); 
            status =  statusField.getText(); 
            tag =  Integer.parseInt(tagField.getText());  
              
            Animal animal1;
            if(classf.equals("Land")){
				try {
					animal1 = new LandAnimals(animaln,classf,genus, order, group, family,height,weight,exhibit, fun, status,tag);
					result = animal1.toString();
					if	((animal1.getSubExhibit().equals("Watani GrassLands")) ||
						(animal1.getSubExhibit().equals("Red River Hogs")) ||
						(animal1.getSubExhibit().equals("Forest Edge")) ||
						(animal1.getSubExhibit().equals("African Lion")) ||
						(animal1.getSubExhibit().equals("Kitera Forest")) ||
						(animal1.getSubExhibit().equals("Lemur Island")) ||
						(animal1.getSubExhibit().equals("Forest Glade")) ||
						(animal1.getSubExhibit().equals("Baboons"))) {
							africa.put(animal1.getTagNumber(), animal1);
					} else if (animal1.getSubExhibit().equals("Bird") ||
						(animal1.getSubExhibit().equals("Land Animal"))) {
							aviary.put(animal1.getTagNumber(), animal1);
					} else if (animal1.getSubExhibit().equals("Rocky Coast") ||
						(animal1.getSubExhibit().equals("Marsh")) ||
						(animal1.getSubExhibit().equals("Red River Hogs")) ||
						(animal1.getSubExhibit().equals("Cypress Swamp")) ||
						(animal1.getSubExhibit().equals("Streamside")) ||
						(animal1.getSubExhibit().equals("Black Bear")) ||
						(animal1.getSubExhibit().equals("Grizzly Bear")) ||
						(animal1.getSubExhibit().equals("Honey Bee Garden")) ||
						(animal1.getSubExhibit().equals("Prairie")) ||
						(animal1.getSubExhibit().equals("Red Wolf")) ||
						(animal1.getSubExhibit().equals("Desert"))) {
							noAmerica.put(animal1.getTagNumber(), animal1);
					} else {
						result = "Error, Wrong SubExhibit";
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            } else if(classf.equals("Water")) {
            	try {
            		animal1 =  new WaterAnimals(animaln,classf,genus, order, group, family,height,weight,exhibit, status,fun,tag);
            		result = animal1.toString();
            		if	((animal1.getSubExhibit().equals("Watani GrassLands")) ||
    						(animal1.getSubExhibit().equals("Red River Hogs")) ||
    						(animal1.getSubExhibit().equals("Forest Edge")) ||
    						(animal1.getSubExhibit().equals("African Lion")) ||
    						(animal1.getSubExhibit().equals("Kitera Forest")) ||
    						(animal1.getSubExhibit().equals("Lemur Island")) ||
    						(animal1.getSubExhibit().equals("Forest Glade")) ||
    						(animal1.getSubExhibit().equals("Baboons"))) {
    							africa.put(animal1.getTagNumber(), animal1);
    					} else if (animal1.getSubExhibit().equals("Bird") ||
    						(animal1.getSubExhibit().equals("Land Animal"))) {
    							aviary.put(animal1.getTagNumber(), animal1);
    					} else if (animal1.getSubExhibit().equals("Rocky Coast") ||
    						(animal1.getSubExhibit().equals("Marsh")) ||
    						(animal1.getSubExhibit().equals("Red River Hogs")) ||
    						(animal1.getSubExhibit().equals("Cypress Swamp")) ||
    						(animal1.getSubExhibit().equals("Streamside")) ||
    						(animal1.getSubExhibit().equals("Black Bear")) ||
    						(animal1.getSubExhibit().equals("Grizzly Bear")) ||
    						(animal1.getSubExhibit().equals("Honey Bee Garden")) ||
    						(animal1.getSubExhibit().equals("Prairie")) ||
    						(animal1.getSubExhibit().equals("Red Wolf")) ||
    						(animal1.getSubExhibit().equals("Desert"))) {
    							noAmerica.put(animal1.getTagNumber(), animal1);
    					} else {
							result = "Error, Wrong SubExhibit";
						}
            	} catch (IOException e) {
            		e.printStackTrace();
            	}
            } else if(classf.equals("Air")) {
            	try {
					animal1 =  new AirAnimals(animaln,classf,genus, order, group, family,height,weight,exhibit, status,fun,tag);
					result = animal1.toString();
					if	((animal1.getSubExhibit().equals("Watani GrassLands")) ||
							(animal1.getSubExhibit().equals("Red River Hogs")) ||
							(animal1.getSubExhibit().equals("Forest Edge")) ||
							(animal1.getSubExhibit().equals("African Lion")) ||
							(animal1.getSubExhibit().equals("Kitera Forest")) ||
							(animal1.getSubExhibit().equals("Lemur Island")) ||
							(animal1.getSubExhibit().equals("Forest Glade")) ||
							(animal1.getSubExhibit().equals("Baboons"))) {
								africa.put(animal1.getTagNumber(), animal1);
						} else if (animal1.getSubExhibit().equals("Bird") ||
							(animal1.getSubExhibit().equals("Land Animal"))) {
								aviary.put(animal1.getTagNumber(), animal1);
						} else if (animal1.getSubExhibit().equals("Rocky Coast") ||
							(animal1.getSubExhibit().equals("Marsh")) ||
							(animal1.getSubExhibit().equals("Red River Hogs")) ||
							(animal1.getSubExhibit().equals("Cypress Swamp")) ||
							(animal1.getSubExhibit().equals("Streamside")) ||
							(animal1.getSubExhibit().equals("Black Bear")) ||
							(animal1.getSubExhibit().equals("Grizzly Bear")) ||
							(animal1.getSubExhibit().equals("Honey Bee Garden")) ||
							(animal1.getSubExhibit().equals("Prairie")) ||
							(animal1.getSubExhibit().equals("Red Wolf")) ||
							(animal1.getSubExhibit().equals("Desert"))) {
								noAmerica.put(animal1.getTagNumber(), animal1);
						} else {
							result = "Error, Wrong SubExhibit";
						}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            } else {
            	result = "Error, Wrong Classification";
            }
            resultsField.setText(result);	    
        }
    });
        
    updateAnimalSubmit.setOnAction(new EventHandler<ActionEvent>() {

    	@Override
    	public void handle(ActionEvent event) {
        		
    		String animaln;
            String classf;
            String family;
            String order;
            String group;
            String genus;
            int height;
            int weight;
            String exhibit;
            String fun;
            String status;
            int tagIdentifier;
            int tag;
            Animal animalToUpdate;
            
            if (animalTagNumber.getText().equals("")) {
            	updateAnimalField.setText("No Animal Selected.");
            } else {
            	tagIdentifier = Integer.parseInt(animalTagNumber.getText());
            	animaln = animalFieldUpdate.getText();
               	classf = classFieldUpdate.getText();
               	family = familyFieldUpdate.getText();
               	order = orderFieldUpdate.getText();
               	group = groupFieldUpdate.getText();
               	genus = genusFieldUpdate.getText();
               	height = Integer.parseInt(heightFieldUpdate.getText());
               	weight = Integer.parseInt(weightFieldUpdate.getText());
               	exhibit = exhibitFieldUpdate.getText();
               	fun = funFieldUpdate.getText();
               	status = statusFieldUpdate.getText();
               	tag = Integer.parseInt(tagFieldUpdate.getText());
            		
            	if (africa.containsKey(tagIdentifier)) {
            		
            		animalToUpdate = africa.getAnimalByTag(tagIdentifier);
            		animalToUpdate.setName(animaln);
            		animalToUpdate.setC_lass(classf);
            		animalToUpdate.setFamily(family);
            		animalToUpdate.setOrder(order);
            		animalToUpdate.setGroup(group);
            		animalToUpdate.setGenus(genus);
            		animalToUpdate.setHeight(height);
            		animalToUpdate.setWeight(weight);
            		animalToUpdate.setSubExhibit(exhibit);
            		animalToUpdate.setFunFacts(fun);
            		animalToUpdate.setStatus(status);
            		animalToUpdate.setTagNumber(tag);
            		
            		try {
    					animalToUpdate.update();
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
            		
            		africa.put(animalToUpdate.getTagNumber(), animalToUpdate);
            		updateAnimalField.setText(animalToUpdate.getName() + " has been updated!");
            		
            		
            	} else if (aviary.containsKey(tagIdentifier)) {
            		animalToUpdate = aviary.getAnimalByTag(tagIdentifier);
            		animalToUpdate.setName(animaln);
            		animalToUpdate.setC_lass(classf);
            		animalToUpdate.setFamily(family);
            		animalToUpdate.setOrder(order);
            		animalToUpdate.setGroup(group);
            		animalToUpdate.setGenus(genus);
            		animalToUpdate.setHeight(height);
            		animalToUpdate.setWeight(weight);
            		animalToUpdate.setSubExhibit(exhibit);
            		animalToUpdate.setFunFacts(fun);
            		animalToUpdate.setStatus(status);
            		animalToUpdate.setTagNumber(tag);
            		
            		try {
    					animalToUpdate.update();
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
            		
            		aviary.put(animalToUpdate.getTagNumber(), animalToUpdate);
            		updateAnimalField.setText(animalToUpdate.getName() + " has been updated!");
            		
            	} else  {
            		animalToUpdate = noAmerica.getAnimalByTag(tagIdentifier);
            		animalToUpdate.setName(animaln);
            		animalToUpdate.setC_lass(classf);
            		animalToUpdate.setFamily(family);
            		animalToUpdate.setOrder(order);
            		animalToUpdate.setGroup(group);
            		animalToUpdate.setGenus(genus);
            		animalToUpdate.setHeight(height);
            		animalToUpdate.setWeight(weight);
            		animalToUpdate.setSubExhibit(exhibit);
            		animalToUpdate.setFunFacts(fun);
            		animalToUpdate.setStatus(status);
            		animalToUpdate.setTagNumber(tag);
            		
            		try {
    					animalToUpdate.update();
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
            		
            		noAmerica.put(animalToUpdate.getTagNumber(), animalToUpdate);
            		updateAnimalField.setText(animalToUpdate.getName() + " has been updated!");
            		
            	}
        	}
                
    	}
    });      
    
    class AlphaHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
        	//String selection = event.getText();
        	//System.out.println(((Node) event.getSource()).getId());
        	System.out.println(event.toString().split("\\'"));    
        }
    }
    
    	/**
    	 * Main Buttons
         */
        zooSubmit.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
            	  
                  //Retrieving the observable list of the Stack Pane 
                    //ObservableList list = stack.getChildren();                     
                    //Adding all the nodes to the pane 
                   // list.addAll(adminButtonsBox); 
                   if (info2Box.getChildren().contains(zooBox)) {
                	    if(zooBox.getChildren().contains(adminAddPane))
                	    	info2Box.getChildren().remove(adminAddPane);
                	    else if(zooBox.getChildren().contains(adminUpdatePane))
                	    	info2Box.getChildren().remove(adminUpdatePane);
                	    else if(zooBox.getChildren().contains(adminRemovePane))
                	    	info2Box.getChildren().remove(adminRemovePane);
        				info2Box.getChildren().remove(zooBox);
        				
        	       }  else {
        				 
        	    	   ObservableList<Node> list = info2Box.getChildren();                     
                        //Adding all the nodes to the pane 
                       list.addAll(zooBox);
                   }
        	  }
        });
        
        groupSubmit.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
            	  
                  //Retrieving the observable list of the Stack Pane 
                    //ObservableList list = stack.getChildren();                     
                    //Adding all the nodes to the pane 
                   // list.addAll(adminButtonsBox); 
                    if (info2Box.getChildren().contains(groupBox)) {
        				info2Box.getChildren().remove(groupBox);
                    } else {
        				 
        				ObservableList<Node> list = info2Box.getChildren();                     
                        //Adding all the nodes to the pane 
                        list.addAll(groupBox);
                    }
        	  }
        });
                
        /* When add button is pressed animal add screen is visible
        */
        addSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
                @Override
                public void handle(ActionEvent event) {                  	 
                	//Retrieving the observable list of the Stack Pane 
                    //ObservableList list = stack.getChildren();                     
                    //Adding all the nodes to the pane 
                   // list.addAll(adminButtonsBox); 
                    if (formstack.getChildren().contains(adminAddPane)) {
        				formstack.getChildren().remove(adminAddPane);
                    }else {
        				 
        				ObservableList<Node> list = formstack.getChildren();                     
                        //Adding all the nodes to the pane 
                        list.addAll(adminAddPane);
                    }        	   
                      
                }}
        );
        removeSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
            @Override
            public void handle(ActionEvent event) {  
            	//Retrieving the observable list of the Stack Pane 
                //ObservableList list = stack.getChildren();                     
                //Adding all the nodes to the pane 
               // list.addAll(adminButtonsBox); 
                if (formstack.getChildren().contains(adminRemovePane)) {
    				formstack.getChildren().remove(adminRemovePane);
                }else {
    				 
    				ObservableList<Node> list = formstack.getChildren();                     
                    //Adding all the nodes to the pane 
                    list.addAll(adminRemovePane);
                }
            }}
        );
        
        updateSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
            @Override
            public void handle(ActionEvent event) {  
             
                if (formstack.getChildren().contains(adminUpdatePane)) {
    				formstack.getChildren().remove(adminUpdatePane);
                }else {
    				 
    				ObservableList<Node> list = formstack.getChildren();                     
                    //Adding all the nodes to the pane 
                    list.addAll(adminUpdatePane);
                }
            }
        });
        
       
        /**
         * View Animal Buttons Alphabetically
         */ 
        alphaSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
            @Override
            public void handle(ActionEvent event) {  
            	//Retrieving the observable list of the Stack Pane 
                //ObservableList list = stack.getChildren();                     
                //Adding all the nodes to the pane 
               // list.addAll(adminButtonsBox); 
                if (info2Box.getChildren().contains(groupBox)) {
    				info2Box.getChildren().remove(groupBox);
                }else {
    				 
    				ObservableList<Node> list = formstack.getChildren();                     
                    //Adding all the nodes to the pane 
                    list.addAll(info2Box);
                }
            }
        });
        
        /**
         * View Animal Buttons by Class
         */ 
        a_classSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
            @Override
            public void handle(ActionEvent event) {  
            	 
            	    pane.add(classpane,0,5);
            	    
            }
    });
        //a_groupSubmit.setOnAction(new ViewButton());
        //picturesSubmit.setOnAction(new ViewButton());

        /**
         * Hyperlinks for view animals alphabetically
         */
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Hyperlink[] alphalink = new Hyperlink[26];
        for(int i = 0; i < 26; i++) {
            Hyperlink link = new Hyperlink(); 
            char text = alphabet[i];
            link.setText(" " + text + " ");
            link.setOnAction(new AlphaHandler());  
            alphalink[i] = link;
            alphapane.getChildren().addAll(alphalink[i]);
        }
        
        /**
         * Hyperlinks for view animals by class
         */
         
         
         Hyperlink airLink = new Hyperlink(); 
         airLink.setText("Air");
         airLink.setOnAction(new ByClassHandler());
            
         Region classregion = new Region();
         classregion.setMinWidth(25);
            
         Hyperlink waterLink = new Hyperlink(); 
         waterLink.setText("Water");
         waterLink.setOnAction(new ByClassHandler()); 
         
            
         Region classregion2 = new Region();
         classregion2.setMinWidth(25);
         
         Hyperlink landLink = new Hyperlink(); 
         landLink.setText("Land");
         landLink.setOnAction(new ByClassHandler());   
         
         
        
         
        return pane;
	}
   
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws Exception {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 650, 500);          
        primaryStage.setTitle("NC Zoo"); // Set the stage title
        scene.getStylesheets().add(getClass().getResource("AnimalTest.css").toExternalForm());
       
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     * @throws IOException 
     */
    public static void main(String[] args) {
    	
    	
        launch(args);
    }
}