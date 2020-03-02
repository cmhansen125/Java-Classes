import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class AnimalUI extends Application { 	 
	 
	
	private static final  String[] noamerica_sub = new String []{"safari","RockyCoast"	,"Marsh","CypressSwamp","Streamside","BlackBear"
			,"GrizzlyBear"	,"HoneyBee "	,"Garden"	,"Prairie"	,"TheDesert"};
	private static final  String[] africa_sub = new String []{"WataniGrasslands","RedRiverHogs","ForestEdge"	,"KiteraForest"	,"AfricanLion"	,"LemurIsland"
			,"ForestGlade"	,"Baboons"};
	private static final  String[] aviary_sub = new String []{"top", "middle", "ground","water"};
	 
	private Exhibit  africa = new Exhibit(africa_sub, "Africa");
	private Exhibit  aviary = new Exhibit(aviary_sub, "Aviary");
	private Exhibit  noamerica = new Exhibit(noamerica_sub, "NoAmerica");
	ZooCoree zooCoree = new ZooCoree();
		
	protected Pane getAddPane( ) {
         /***
         * ADMIN SUBPANEL USED BY ADD AND SECONDARY FOR UPDATE
         */        
      
    	VBox labelpane = new VBox(12);
    	labelpane.setPrefWidth(90);
    	VBox fieldpane = new VBox(5);
    	fieldpane.setPrefWidth(150);
    	VBox label1pane = new VBox(12);
    	label1pane.setPrefWidth(70);
    	VBox field1pane = new VBox(5);
    	field1pane.setPrefWidth(150);
    	HBox buttonpane1 = new HBox(10);
    	HBox resultspane = new HBox(5); 
     
    	Label animalLabel  = new Label(" Animal Name:  ");
    	Label classLabel  = new Label(" Class:  "); //list
    	Label familyLabel  = new Label(" Family: "); //list
    	Label orderLabel  =    new Label(" Order: ");
    	Label groupLabel  =    new Label(" Group: ");
    	Label genusLabel  =   new Label(" Genus:  ");
    	Label heightLabel = new Label(" Height:  ");
    	Label weightLabel  = new Label(" Weight: ");
    	Label exhibitLabel  = new Label("Exhibit:  "); // list
    	Label funLabel  = new Label("FunFacts:  ");
    	Label statusLabel  = new Label(" Status:  ");
    	Label tagLabel  = new Label(" Tag ID:  "); 
    	Label resultsLabel  = new Label("Results:  ");      
    	
    	Button addAnimalSubmit = new Button("Add");
        addAnimalSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        Button bulkUpload = new Button("Bulk Upload");
        bulkUpload.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        TextField animalField = new TextField ("");       
        TextField classField = new TextField ("");
        TextField familyField = new TextField("");  
        TextField orderField = new TextField("");
        TextField groupField = new TextField("");
        TextField genusField = new TextField("");
        TextField heightField = new TextField("0"); 
        TextField weightField = new TextField("0"); 
        TextField exhibitField = new TextField(""); 
        TextArea funField = new TextArea(""); 
        TextField statusField = new TextField(""); 
        TextField tagField = new TextField("");

        TextField resultsField = new TextField("");  
        resultsField.setMinWidth(50);
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
        centerPane.setHgap(5);
        centerPane.setVgap(5);  
        
        
        BorderPane adminAddPane = new BorderPane();
        adminAddPane.setMinHeight(200);
        adminAddPane.setMinWidth(500);
        adminAddPane.setStyle("-fx-background-color: #A9A9A9;");        
       
        adminAddPane.setPadding(new Insets(25,5,5,5));   
        adminAddPane.setCenter(centerPane); 
        adminAddPane.setLeft(buttonpane1);
        adminAddPane.setBottom(resultspane);  
           
    class addSubmit implements EventHandler<ActionEvent> {   	 
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
             Animal animal1 = null;
                        	
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
                  
                if(classf.equals("Land")){
                	  animal1 =  new LandAnimals(animaln,classf,genus, order, group, family,height,weight,exhibit, status,fun,tag);
                	  result = animal1.toString();  
                }
                else if(classf.equals("Water")) {
                	  animal1 =  new WaterAnimals(animaln,classf,genus, order, group, family,height,weight,exhibit, status,fun,tag);
                	 result = animal1.toString();
                }
                else if(classf.equals("Air")) {
                	  animal1 =  new AirAnimals(animaln,classf,genus, order, group, family,height,weight,exhibit, status,fun,tag);
                	 result = animal1.toString();
                }
                else  {
                	 result = "Error"; 
                }
                if(!result.equals("Error")) {  
                	System.out.println(result);
                	System.out.println(animal1.getSubExhibit());
                	if(aviary.equals(animal1.getSubExhibit())) {
                		aviary.add(animal1.getTagNumber());                	    
                	} else if(africa.equals(animal1.getSubExhibit())) {                		 
                    }	else if(noamerica.equals(animal1.getSubExhibit())) {
            		    noamerica.add(animal1.getTagNumber());                         
        	        }
                 }        	        
                
    			resultsField.setText(result);
        } }
     return adminAddPane;    
	}
 
                
    public Pane getUpdateSearchPane( ){

      /**
      * ADMIN PANEL - USED BY UPDATE
      */ 
 
        VBox updateLabelBox = new VBox(15);
        VBox updateFieldBox = new VBox(5);
        
        Label updateTagLabel  = new Label(" Tag ID:  "); 
        updateTagLabel.setMinWidth(65);
        TextField updateTagField = new TextField("");
        
        Button updateSearchSubmit = new Button("Search");
        updateSearchSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        
        Label resultsTagLabel  = new Label(" Results:  "); 
        TextField resultsTagField = new TextField("");
        Region regionUpdate = new Region();
        regionUpdate.setMinHeight(35);        
        
        GridPane searchUpdatePane = new GridPane(); 
        searchUpdatePane.setMinHeight(200);
        searchUpdatePane.setMinWidth(400);
        searchUpdatePane.setStyle("-fx-background-color: #A9A9A9;");    
         
		updateLabelBox.getChildren().addAll(updateTagLabel,updateSearchSubmit,resultsTagLabel); 
        updateFieldBox.getChildren().addAll(updateTagField,regionUpdate,resultsTagField);         
        
        searchUpdatePane.add(updateLabelBox,0,0);
        searchUpdatePane.add(updateFieldBox,1,0); 
    
        //** duplicate of add panel  **/
        
        VBox labelpane = new VBox(12);
    	labelpane.setPrefWidth(90);
    	VBox fieldpane = new VBox(5);
    	fieldpane.setPrefWidth(150);
    	VBox label1pane = new VBox(12);
    	label1pane.setPrefWidth(70);
    	VBox field1pane = new VBox(5);
    	field1pane.setPrefWidth(150);
    	HBox buttonpane1 = new HBox(10);
    	HBox resultspane = new HBox(5); 
     
        
        Label animalLabel  = new Label(" Animal Name:  ");
    	Label classLabel  = new Label(" Class:  "); //list
    	Label familyLabel  = new Label(" Family: "); //list
    	Label orderLabel  =    new Label(" Order: ");
    	Label groupLabel  =    new Label(" Group: ");
    	Label genusLabel  =   new Label(" Genus:  ");
    	Label heightLabel = new Label(" Height:  ");
    	Label weightLabel  = new Label(" Weight: ");
    	Label exhibitLabel  = new Label("Exhibit:  "); // list
    	Label funLabel  = new Label("FunFacts:  ");
    	Label statusLabel  = new Label(" Status:  ");
    	Label tagLabel  = new Label(" Tag ID:  "); 
    	Label resultsLabel  = new Label("Results:  ");  
    	
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
        resultsField.setMinWidth(50);
        Region region1 = new Region();
        region1.setMinWidth(30);
        Region region2 = new Region();
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
        centerPane.setHgap(5);
        centerPane.setVgap(5);  
        
        BorderPane adminUpdatePane = new BorderPane();
        adminUpdatePane.setMinHeight(200);
        adminUpdatePane.setMinWidth(500);
        adminUpdatePane.setStyle("-fx-background-color: #A9A9A9;");        
       
        adminUpdatePane.setPadding(new Insets(25,5,5,5));   
        adminUpdatePane.setCenter(centerPane); 
        adminUpdatePane.setLeft(buttonpane1);
        adminUpdatePane.setBottom(resultspane);  
        
        
        updateSearchSubmit.setOnAction(new EventHandler<ActionEvent>(){  	 
      	   @Override
      	   public void handle(ActionEvent event) {  
      	     	
      		   Animal z_animal;
      		   int tag =  Integer.parseInt(updateTagField.getText());
      		   //find Animal by tag    	
          	 		
      		   if((z_animal = zooCoree.getAnimalByTag(tag)) != null) { 
          		 	 
      			   animalField.setText(z_animal.getName());
      		       classField.setText(z_animal.getC_lass());
      		       familyField.setText(z_animal.getFamily());
      		       orderField.setText(z_animal.getOrder()); 
      		       genusField.setText(z_animal.getGenus());              
      		       heightField.setText(String.valueOf(z_animal.getHeight())); 
      		      
      		       weightField.setText(String.valueOf(z_animal.getWeight())); 
      		       exhibitField.setText(z_animal.getSubExhibit()); 
      		       funField.setText(z_animal.getFunfacts()); 
      		       statusField.setText(z_animal.getStatus()); 
      		       tagField.setText(String.valueOf(z_animal.getTagNumber())); 
      		   } else {
      			   resultsTagField.setText("Tag is not found");
      		   }
      	   }
      		 
      	   });
      
        return searchUpdatePane;
      	}
   
        
    public Pane getRemoveSearchPane( ) {
        /**
         * REMOVE PANEL
         */
        
        VBox removeLabelBox = new VBox(25);
        VBox removeFieldBox = new VBox(5);
        
        Label removeTagLabel  = new Label(" Tag ID:  "); 
        TextField removeTagField = new TextField("");
        Button removeSearchSubmit = new Button("Search");
        removeSearchSubmit.setStyle("-fx-font-size: 10pt; -fx-background-color: lightblue; -fx-effect: dropshadow(one-pass-box, black, 8, 0.0, 2, 0 );");
        Label resultsTagLabel1  = new Label(" Results:  "); 
        TextField resultsTagField1 = new TextField("");
        Region regionremove = new Region();
        regionremove.setMinWidth(25);
        
        /**
         * Remove panel
         */
        Pane adminRemovePane = new Pane();  
        adminRemovePane.setMinHeight(200);
        adminRemovePane.setMinHeight(400);
        adminRemovePane.setStyle("-fx-background-color: #A9A9A9;");        
       
        adminRemovePane.setPadding(new Insets(5,5,5,5));        
        
        adminRemovePane.getChildren().addAll(removeTagLabel,removeSearchSubmit,resultsTagLabel1); 
        adminRemovePane.getChildren().addAll(removeTagField,regionremove,resultsTagField1); 
        

        class removeSubmit implements EventHandler<ActionEvent> { 	 
            @Override
            public void handle(ActionEvent event) {  
            
             	Animal animaltoremove;
                int tag =   Integer.parseInt(removeTagField.getText());
                
                if((animaltoremove = zooCoree.getAnimalByTag(tag)) != null)                	 
             		animaltoremove.setStatus("removed");               		
     				 
     			else 
     				resultsTagField1.setText("Tag is not found");
     							
             }
         } 
        
        /*removeButton.setOnAction(new removeSearchSubmit()); */   
        return adminRemovePane;
        }
  
    /**
     * Main Pane created and returned to stage
     * @throws IOException 
     *  
     */
    
	protected Pane getPane() throws IOException {   	 
		
		/**
		 * Boxes for main panel
		 */
		
		zooCoree.createZooInUI();
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
        
        // Create main pane 
        GridPane pane = new GridPane();   
        
        pane.setPadding(new Insets(5,5,5,15));
        pane.setHgap(5);
        pane.setVgap(5);    

        pane.add(headerBox,0,0);
        pane.add(infoBox,0,1); 
        pane.add(buttonBox, 0, 2);   
  
        GridPane formstack = new GridPane();
        GridPane viewpane = new GridPane(); 
           
        pane.add(separator1, 0, 3);         
        pane.add(info2Box, 0, 4);
        
        Image image = new Image("File:NCZoo_ColorLogo.png");  
        formstack.add(new ImageView(image),0,1);
        pane.add(formstack, 0, 5);
         
        
        /** 
         * Animals Admin Buttons
         */
        Region button3 = new Region();
        button3.setMinWidth(40);  
        
        Button bulkUploadSubmit = new Button("Bulk Upload");
        bulkUploadSubmit.setPrefWidth(120);    
        
        Button addSubmit = new Button("Add Animal");
        addSubmit.setPrefWidth(120);    
        
        Button removeSubmit = new Button("Remove Animal");
        removeSubmit.setPrefWidth(120);
        
        Button updateSubmit = new Button("Update Animal");
        updateSubmit.setPrefWidth(120);        
        zooBox.getChildren().addAll(button3,bulkUploadSubmit,addSubmit,updateSubmit,removeSubmit); 
        
       /**
        * Create subpanels 
        */
         
              
       /* Bulk upload sub panel */
        HBox viewbox1 = new HBox(5); 
        viewbox1.setMaxWidth(400);
    	TextArea bulkTextArea = new TextArea();
    	bulkTextArea.setPrefColumnCount(150);
        bulkTextArea.setEditable(false);
        bulkTextArea.setWrapText(true);
        bulkTextArea.setPrefColumnCount(200);  
        
        GridPane bulkPane = new GridPane();         
         
        bulkPane.add(bulkTextArea, 0,6);  

        Pane adminAddPane = getAddPane();
        Pane adminUpdateSearchPane = getUpdateSearchPane();
        Pane adminRemoveSearchPane = getRemoveSearchPane();         
        
         /* Create  View and Exhibits SubPanel   */         
      
         
        HBox viewbox = new HBox(5);     
        viewbox.setMinWidth(400);
    	TextArea  viewTextArea = new TextArea();
    	viewTextArea.setEditable(false);
    	viewTextArea.setWrapText(true);
    	viewTextArea.setPrefColumnCount(100);
        
        GridPane viewPane = new GridPane();                 
        viewPane.add( viewTextArea, 0,6);       
        
        HBox viewbox11 = new HBox(5);     
        viewbox11.setMinWidth(400);
    	TextArea  exhibitTextArea = new TextArea();
        exhibitTextArea.setEditable(false);
        exhibitTextArea.setWrapText(true);
        exhibitTextArea.setPrefColumnCount(200); 
        
        ScrollPane exhibitPane = new ScrollPane(); 
        exhibitPane.setContent( exhibitTextArea);       
        
        bulkUploadSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
            @Override
            public void handle(ActionEvent event) {
            	
            	File f = new File("Animals.Txt");
            	if(f.exists()) { 
                Scanner scan;
                ArrayList<String> content = new ArrayList<>();
				try {
					scan = new Scanner(f);            
            		 
					while (scan.hasNextLine()) {
            			String l = scan.nextLine();
            			zooCoree.addBulk(l); 
            			Scanner lineBust = new Scanner(l);
            			while (lineBust.hasNext()) {
            				content.add(lineBust.next());
            			}
            		    lineBust.close();
            		    content.add("\n");
            		
					}
            		scan.close();  
            		/* Add content to screen */ 
     	        
            		 
            	    
                 } catch (FileNotFoundException e) {
				 
				         e.printStackTrace();
                     
            	}
            	formstack.getChildren().clear();       				 
                formstack.getChildren().addAll(bulkPane);
                bulkTextArea.setText(zooCoree.toString()); 
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
                    // if (formstack.getChildren().contains(adminAddPane)) {
         				//formstack.getChildren().clear();
                    // }else {
         				 
         				formstack.getChildren().clear();       				 
                         formstack.getChildren().addAll(adminAddPane);
                      
                    // }        	   
                       
                 }}
         );
         removeSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
             @Override
             public void handle(ActionEvent event) {  
             	//Retrieving the observable list of the Stack Pane 
                 //ObservableList list = stack.getChildren();                     
                 //Adding all the nodes to the pane 
                // list.addAll(adminButtonsBox); 
                 //if (formstack.getChildren().contains(adminRemovePane)) {
     			//	formstack.getChildren().remove(adminRemovePane);
                 //}else {
             	formstack.getChildren().clear();
     				 
                    formstack.getChildren().addAll(adminRemoveSearchPane);
                 
             }}
         );
         
         updateSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
             @Override
             public void handle(ActionEvent event) {  
              
                
     			 
             	formstack.getChildren().clear();
 				 
                 formstack.getChildren().addAll(adminUpdateSearchPane);
                  
             }
         });
         
        /** 
         * View Animals Button
         */
         
        Region button7 = new Region();
        button7.setPrefWidth(40);
        
        Button v_alphaSubmit = new Button("Alphabetically");         
        v_alphaSubmit.setPrefWidth(350);
        
        Button v_classSubmit = new Button("Class");         
        v_classSubmit.setPrefWidth(350);
        
        Button v_groupSubmit = new Button("Group");
        v_groupSubmit.setPrefWidth(350); 
        
        groupBox.getChildren().addAll(button7,v_alphaSubmit,v_classSubmit,v_groupSubmit);
         
        /** 
         * View Exhibits Button
         */
         
        Region button8 = new Region();
        button8.setPrefWidth(40);
        Button africaSubmit = new Button("Africa");
         africaSubmit.setPrefWidth(150);
        
        Button noamericaSubmit = new Button("North America");
        noamericaSubmit.setPrefWidth(150);
        
        Button aviarySubmit = new Button("Aviary");
        aviarySubmit.setPrefWidth(150);
               
        exhibitBox.getChildren().addAll(button8,africaSubmit,noamericaSubmit,aviarySubmit);         
       
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
        	   //   ObservableList<Node> list = info2Box.getChildren();                     
                        //Adding all the nodes to the pane 
        	    	   info2Box.getChildren().clear();

                   	   formstack.getChildren().clear();
        	    	   info2Box.getChildren().addAll(zooBox);  
        	  }
        });
        
        groupSubmit.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
            	  
                  //Retrieving the observable list of the Stack Pane 
                    //ObservableList list = stack.getChildren();                     
                    //Adding all the nodes to the pane 
                   // list.addAll(adminButtonsBox); 
            	info2Box.getChildren().clear();

            	formstack.getChildren().clear();
 	    	    info2Box.getChildren().addAll(groupBox);
 	    	    pane.add(viewPane, 0, 6);
        	  }
        });
        
        areaSubmit.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
            	  
                  //Retrieving the observable list of the Stack Pane 
                    //ObservableList list = stack.getChildren();                     
                    //Adding all the nodes to the pane 
                   // list.addAll(adminButtonsBox); 
            	info2Box.getChildren().clear();
            	formstack.getChildren().clear();
 	    	    info2Box.getChildren().addAll(exhibitBox);
 	    	    pane.add(exhibitPane, 0, 6);
        	  }
        }); 
        
        class ByAlphaHandler implements EventHandler<ActionEvent> {

      		@Override
               public void handle(ActionEvent event) {
      			
                ArrayList<Animal> animals = new ArrayList<>();
          	    System.out.println(event.getSource().toString());
          	    String text =  event.getSource().toString();
          	    String[] text1 = ((String) text).split("'"); 
          	    System.out.println(text1[1]);
          	    animals = zooCoree.getAnimalsByAlpha(text1[1]);
          	    Animal animalS;
				String textS = new String();
				for(int i = 0; i < animals.size(); i++) {
          	    	animalS = animals.get(i);          	 
      		         textS += animalS.toDisplay();
				}
          	    viewTextArea.setText(textS);   
          	    System.out.println(textS);
               }
          } 
        
        class ByClassHandler implements EventHandler<ActionEvent> {

      		@Override
               public void handle(ActionEvent event) {
      			
                ArrayList<Animal> animals;
                String textS = new String();
                
          	    System.out.println(event.getSource().toString());
          	    String text =  event.getSource().toString();
          	    String[] text1 = ((String) text).split("'"); 
          	    System.out.println(text1[1]);
          	    animals = zooCoree.getAnimalsByClass(text1[1]);
          	    Animal animalS; 
				for(int i = 0; i < animals.size(); i++) {
          	    	animalS = animals.get(i);          	 
      		         textS += animalS.toDisplay();
				}
          	    viewTextArea.setText(textS);  

          	    System.out.println(textS);
               }
          } 
        
        class ByGroupHandler implements EventHandler<ActionEvent> {

      		@Override
               public void handle(ActionEvent event) {
      			
                ArrayList<Animal> animals;
                String textS = new String();
                
          	    System.out.println(event.getSource().toString());
          	    String text =  event.getSource().toString();
          	    String[] text1 = ((String) text).split("'"); 
          	    System.out.println(text1[1]);
          	    animals = zooCoree.getAnimalsByGroup(text1[1]);
          	    Animal animalS; 
				for(int i = 0; i < animals.size(); i++) {
          	    	animalS = animals.get(i);          	 
      		         textS += animalS.toDisplay();
				}
          	    viewTextArea.setText(textS);  

          	    System.out.println(textS);
               }
          } 
        
        class ByExhibitHandler implements EventHandler<ActionEvent> {

      		@Override
               public void handle(ActionEvent event) {
      			
                ArrayList<Animal> animals;
                String textS = new String();
                
          	    System.out.println(event.getSource().toString());
          	    String text =  event.getSource().toString();
          	    String[] text1 = ((String) text).split("'"); 
          	    System.out.println(text1[1]);
          	    animals = zooCoree.getAnimalsByClass(text1[1]);
          	    Animal animalS; 
				for(int i = 0; i < animals.size(); i++) {
          	    	animalS = animals.get(i);          	 
      		         textS += animalS.toDisplay();
				}
          	    viewTextArea.setText(textS);  
          	    System.out.println(textS);
               }
          } 
                
        
        /**
         * Hyperlinks for view animals alphabetically
         */
        HBox alphabox = new HBox();
        alphabox.setMinWidth(500);
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Hyperlink[] alphalink = new Hyperlink[26];
        for(int i = 0; i < 26; i++) {
            Hyperlink link = new Hyperlink(); 
            char text = alphabet[i];
            link.setText(String.valueOf(text));
            link.setPrefWidth(15); 
            link.setOnAction(new ByAlphaHandler());  
            
            link.setStyle("-fx-font-size: 12pt");
            alphalink[i] = link;
            alphabox.getChildren().add(alphalink[i]);
             
        } 
        
        /**
         * Hyperlinks for view animals by class
         */
         HBox classbox = new HBox();
         classbox.setMinWidth(500);
         Region classregion = new Region();
         classregion.setMinWidth(60);
                  
         Hyperlink airLink = new Hyperlink(); 
         airLink.setText("Air");
         airLink.setStyle("-fx-font-size: 12pt");
         airLink.setOnAction(new ByClassHandler());
            
         Region classregion1 = new Region();
         classregion1.setMinWidth(45);
            
         Hyperlink waterLink = new Hyperlink(); 
         waterLink.setText("Water");
         waterLink.setStyle("-fx-font-size: 12pt");
         waterLink.setOnAction(new ByClassHandler());          
            
         Region classregion2 = new Region();
         classregion2.setMinWidth(45);
         
         Hyperlink landLink = new Hyperlink(); 
         landLink.setText("Land");
         landLink.setStyle("-fx-font-size: 12pt");
         landLink.setOnAction(new ByClassHandler()); 
         
         classbox.getChildren().addAll(classregion,airLink,classregion1,waterLink,classregion2,landLink);
         
         /**
          * Hyperlinks for view animals by group
          */
         
         HBox groupbox = new HBox();
         groupbox.setMinWidth(500);
         Region classregion3 = new Region();
         classregion3.setMinWidth(45);
          
          Hyperlink mammalLink = new Hyperlink(); 
          mammalLink.setText("Mammals"); 
          mammalLink.setStyle("-fx-font-size: 12pt");          
           mammalLink.setOnAction(new ByGroupHandler());
           
             
          Region classregion4 = new Region();
          classregion4.setMinWidth(45);
             
          Hyperlink amphibianLink = new Hyperlink();         
          amphibianLink.setText("Amphibians");
          amphibianLink.setStyle("-fx-font-size: 12pt");
         amphibianLink.setOnAction(new ByGroupHandler());           
             
          Region classregion5 = new Region();
          classregion5.setMinWidth(45);
          
          Hyperlink birdLink = new Hyperlink();         
          birdLink.setText("Birds");
          birdLink.setStyle("-fx-font-size: 12pt");
          birdLink.setOnAction(new ByGroupHandler());           
             
          Region classregion6 = new Region();
          classregion6.setMinWidth(45);
          
          Hyperlink reptileLink = new Hyperlink(); 
          reptileLink.setText("Reptiles"); 
          reptileLink.setStyle("-fx-font-size: 12pt");
          
           reptileLink.setOnAction(new ByGroupHandler()); 
          
          groupbox.getChildren().addAll(classregion3,mammalLink,classregion4,amphibianLink,classregion5,birdLink, classregion6, reptileLink);
        
          /**
           * View Animal Buttons by Alpha
           */ 
          v_alphaSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
              @Override
              public void handle(ActionEvent event) {  
              	 
              	formstack.getChildren().clear();
              	formstack.getChildren().addAll(alphabox);      
              }
      });
           
          /**
           * View Animal Buttons by Class
           */ 
          v_classSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
              @Override
              public void handle(ActionEvent event) {  
              	 
              	formstack.getChildren().clear();
              	formstack.getChildren().addAll(classbox);                	    
              }
      });
          
          /**
           * View Animal Buttons by Group
           */ 
          v_groupSubmit.setOnAction(new EventHandler<ActionEvent>() {     	 
              @Override
              public void handle(ActionEvent event) {  
              	 
              	formstack.getChildren().clear();
              	formstack.getChildren().addAll(groupbox);               	    
              }
      });
           
      return pane;    
    }          
   
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws IOException {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 650, 400);          
        primaryStage.setTitle("NC Zoo"); // Set the stage title
        scene.getStylesheets().add(getClass().getResource("AnimalTest.css").toExternalForm());
       
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
    	 
        launch(args);
    }
}
 