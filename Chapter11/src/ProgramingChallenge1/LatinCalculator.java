package ProgramingChallenge1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public  class LatinCalculator extends Application {
	Label  	label = new Label("");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Latin Translator");
		
		
		
	  	label = new Label("");
	  	
	Button sinisterButton = new Button("Sinister");
	Button dexterButton = new Button("dexter");
	Button mediumButton = new Button("medium");

	
	VBox Vbox1 = new VBox(sinisterButton, dexterButton,mediumButton,label);
	
	Scene scene = new Scene(Vbox1);
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	sinisterButton.setOnAction(new sinisterClickHandler());
	dexterButton.setOnAction(new dexterClickHandler());
	mediumButton.setOnAction(new mediumClickHandler());
	
	}
	
	public class sinisterClickHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			label.setText("Left");

		}

	}
	public class dexterClickHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			label.setText("Right");
		}
	
	
		
}
	
	public class mediumClickHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			label.setText("Center");

		}

	}




}