package ProgramingChallenge4;
import java.util.Scanner;

public class Tempature {
	
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
			    System.out.print("Enter Fahrenheit temperature: ");
			    System.out.println("");
			    double ftemp = scanner.nextDouble(); 
			 
			    Temperature temp = new Temperature(ftemp);
			    System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
			    System.out.println("");
			    System.out.println("The temperature in Celsius is " + temp.getCelsius());
			    System.out.println("");
			    System.out.println("The temperature in Kelvin is " + temp.getKelvin());

			    scanner.close();
		  }

	}
 
	class Temperature {
		 
		  double ftemp;
		  Temperature(double ftemp) {
		    this.ftemp = ftemp;
		  }
		 
		  double getFahrenheit(){
		    return ftemp;
		  }
		  double getCelsius(){
		    return ((double)5/9*(ftemp-32));
		  }
		  double getKelvin(){
		    return (((double)5/9*(ftemp-32))+273);
		  }
		  
		  
		}

