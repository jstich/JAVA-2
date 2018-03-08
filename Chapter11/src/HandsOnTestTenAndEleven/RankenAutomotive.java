package HandsOnTestTenAndEleven;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RankenAutomotive extends Application {

	//launch method
    public static void main(String[] args) {
	launch(args);

    }
    
    //start method
    @Override
    public void start(Stage primaryStage) throws Exception {
	
	VBox pane = new VBox(10);// creates a Vbox
	
	
	
	Label routineLabel = new Label("Routine Services");
	
	//check boxes for routine services
	CheckBox oilChange = new CheckBox("Oil Change ($26.00)");
	CheckBox lubeJob = new CheckBox("Lube Job ($18.00)");
	CheckBox radiatorFlush = new CheckBox("Radiator Flush ($30.00)");
	CheckBox transmissionflush = new CheckBox("Transmission Flush ($80.00)");
	CheckBox inspection = new CheckBox("Inspection ($15.00)");
	CheckBox mufflerRep = new CheckBox("Muffler Replacement ($100.00)");
	CheckBox tireRotation = new CheckBox("Tire Rotation ($20.00)");
	
	
	
	pane.getChildren().add(routineLabel);
	pane.getChildren().add(oilChange);
	pane.getChildren().add(lubeJob);
	pane.getChildren().add(radiatorFlush);
	pane.getChildren().add(transmissionflush);
	pane.getChildren().add(inspection);
	pane.getChildren().add(mufflerRep);
	pane.getChildren().add(tireRotation);
	
	pane.setPadding(new Insets(0, 5, 10, 30)); //Sets padding
	
	
	HBox parts = new HBox(30);
	HBox hours = new HBox(30);
	Label nonRoutineLabel = new Label("Nonroutine Services");//label for nonroutine services
	Label partsCharges = new Label("Parts Charges:   ");//label for parts charged
	Label hoursLabor = new Label("Hours of Labor: ");//label for hours of labor
	
	//creates text fields for Nonrtuine Services
	
	

	TextField partsText;
	partsText = new TextField();
	TextField hoursText;
    hoursText = new TextField();
	
  
	
	parts.getChildren().add(partsCharges);
	parts.getChildren().add(partsText);
	
	hours.getChildren().add(hoursLabor);
	hours.getChildren().add(hoursText);
	
	pane.getChildren().add(nonRoutineLabel);
	pane.getChildren().add(parts);
	pane.getChildren().add(hours);

	//sets the scene height and width
	Scene scene = new Scene(pane, 400, 400);
	
	HBox buttons = new HBox(50);
	
	
	buttons.setAlignment(Pos.CENTER);// align buttons 
	Button calculateButton = new Button("Calculate Charges");
	Button exitButton = new Button("Exit");
	
	exitButton.setOnMouseClicked(event -> System.exit(0)); // exit button event handler
	calculateButton.setOnMouseClicked(event -> { //calculate button event handler
	    double totalAmount = 0.0;
	
	    if(oilChange.isSelected())
			totalAmount += 26.00;
		    if(lubeJob.isSelected())
			totalAmount += 18.00;
		    if(radiatorFlush.isSelected())
			totalAmount += 30.00;
		    if(transmissionflush.isSelected())
			totalAmount += 80.00;
		    if(inspection.isSelected())
			totalAmount += 15.00;
		    if(mufflerRep.isSelected())
			totalAmount += 100.00;
		    if(tireRotation.isSelected())
			totalAmount += 20.00;
		    
		    int partsCharge = Integer.parseInt(partsText.getText());
		    
		    totalAmount += partsCharge;
		    
		    int numHours = Integer.parseInt(hoursText.getText());
		    
		    //adds 20 per hour labor charge
		    totalAmount += numHours * 20;
		    
		    
		    //alert- message box to display total charge
		    Alert result = new Alert(AlertType.INFORMATION);
		    result.setContentText("Total Charges: $" + totalAmount);
		    result.show();
		    
		    
	});
	
	buttons.getChildren().add(calculateButton);
	buttons.getChildren().add(exitButton);
	
	pane.getChildren().add(buttons);
	
	//sets scenes and the title then shows it 
	primaryStage.setScene(scene);
	primaryStage.setTitle("Ranken's Automotive Maintenance");
	primaryStage.show();
			
    
}
}

