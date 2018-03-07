package ProgramingChallenge7;
import java.util.Scanner;
public class WidgetFactory {
	
	double widgets;
	
	public WidgetFactory(){
		widgets = 0;
	}
	
	public void SetWidgets(double num){
		widgets = num;
	}
	
	public void GetDays(){
		double days;
		days = widgets / 160;
		System.out.println("Number of days to produce is:  " + days + " days");
	}
	
	public static void main (String[] args){
		double number;
		Scanner keyboard = new Scanner(System.in);
		WidgetFactory num = new WidgetFactory();
		System.out.println("Enter the number of widgets:  ");
		number = keyboard.nextDouble();
		num.SetWidgets(number);
		num.GetDays();
		
		keyboard.close();
	}
}

