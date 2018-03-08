package ProgramingChallenge3;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.text.Text;


public class TipTaxAndTotal extends Application

{

  @Override

  public void start(Stage primaryStageOf) {

      primaryStageOf.setTitle("Simple Tax Calculator");

      GridPane paneVal= new GridPane();

      

      //assigns fields

      Text sceneTitleVal = new Text("Tax Calculator");

    

      paneVal.add(sceneTitleVal, 0, 0, 2, 1);

      //label for food charge

      Label totalVal= new Label("Food charge:");
      paneVal.add(totalVal, 0, 1);

      //text fields for food charge

      final TextField totalFieldVal = new TextField();
      paneVal.add(totalFieldVal, 1, 1);

      //label for tax

      Label percentVal = new Label("% Tax:");

      paneVal.add(percentVal,0,2);

      //text fields for tax

      final TextField percentFieldVal = new TextField();

      paneVal.add(percentFieldVal, 1, 2);

       //label for tip

      Label TipVal = new Label("% Tip:");

      paneVal.add(TipVal,0,3);

       //text field for tip

      final TextField tipFieldVal = new TextField();

      paneVal.add(TipVal, 1, 3);

      Label Tot = new Label("Total:");

      paneVal.add(Tot,0,4);

      final TextField tot = new TextField();

      paneVal.add(tot, 1, 4);

      //button computation

      Button calculateButtonVal = new Button("Show Calculation");       

    

     
    //  HBox.getChildren().add(calculateButtonVal);

     

      final Text taxMessageM = new Text();

    
      //calculation part

      calculateButtonVal.setOnAction(new EventHandler<ActionEvent>() {
    	  @Override
    	  public void handle(ActionEvent t) {
    		  Double incomeVal = Double.parseDouble(totalFieldVal.getText());

          @SuppressWarnings("unused")
		Double FinalTotal = Double.parseDouble(totalFieldVal.getText());
        Double taxVal = Double.parseDouble(percentFieldVal.getText())/100;
        Double tipVal= Double.parseDouble(tipFieldVal.getText())/100;

          taxMessageM.setText("TaX incurred:"+incomeVal*taxVal*tipVal);
          taxMessageM.setText("Total:"+incomeVal+taxVal+tipVal);

          }

      });

      primaryStageOf.getScene();

      primaryStageOf.show();

  }

  public static void main(String[] args) {

      launch(args);

  }

}