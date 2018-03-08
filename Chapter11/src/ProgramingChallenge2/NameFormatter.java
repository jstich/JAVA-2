package ProgramingChallenge2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import java.lang.String;
public class NameFormatter extends Application {
	
	TextField fName = new TextField();
	TextField mName = new TextField();
	TextField lName= new TextField();
	TextField title1 = new TextField();
	
	
	
	
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	Button button4 = new Button();
	Button button5 = new Button();
	Button button6 = new Button();
	
	public static void main (String[] args){
		launch(args);
	}
	
	String firstName;
	String middleName;
	String lastName;
	String title;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("NAMEFORMATER");
		
		Label firstLabel = new Label("First:");
		Label middleLabel = new Label("Middle:");
		Label lastLabel = new Label("Last:");
		Label titleLabel = new Label("Title:");
		
		VBox vb1 = new VBox(firstLabel,fName,middleLabel, mName,lastLabel , lName,titleLabel, title1, button1, button2, button3, button4, button5,button6);
		
		Scene scene = new Scene(vb1);
		
		button1.setOnAction(new Button1ClickHandler());
		button2.setOnAction(new Button2ClickHandler());
		button3.setOnAction(new Button3ClickHandler());
		button4.setOnAction(new Button4ClickHandler());
		button5.setOnAction(new Button5ClickHandler());
		button6.setOnAction(new Button6ClickHandler());
		primaryStage.setScene(scene);
		
		
		
		
		primaryStage.show();
		
	}
	class Button1ClickHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			title = title1.getText();
			firstName = fName.getText();
			middleName = mName.getText();
			lastName = lName.getText();
	
			button1.setText(title + firstName + middleName + lastName);
			
		}
	}
		
		class Button2ClickHandler implements EventHandler<ActionEvent>{

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				firstName = fName.getText();
				middleName = mName.getText();
				lastName = lName.getText();
				
				button2.setText(firstName + middleName + lastName);
				
			}
		
	}
		class Button3ClickHandler implements EventHandler<ActionEvent>{

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				firstName = fName.getText();
				lastName = lName.getText();
				
				button3.setText(firstName +  lastName);
				
			}
		
	}
		
		class Button4ClickHandler implements EventHandler<ActionEvent>{

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				title = title1.getText() ;
				firstName = fName.getText();
				middleName = mName.getText();
				lastName = lName.getText();
				
				button4.setText(lastName + firstName + middleName + lastName + title);
				
			}
		
	}
		
		class Button5ClickHandler implements EventHandler<ActionEvent>{

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				lastName = lName.getText();
				firstName = fName.getText();
				middleName = mName.getText();
				
				button5.setText( lastName + firstName + middleName );
				
			}
		
	}
		
		
		class Button6ClickHandler implements EventHandler<ActionEvent>{

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				lastName = lName.getText();
				firstName = fName.getText();
				
				
				button6.setText( lastName + firstName );
				
			}
		
	}
		
		
}

	



	  
