package ProgramingChallenge3;
import java.util.Scanner;
public class CarpetCalculatorDriver {
	
	public static void main(String[] args) {

	    final double carpetPerSquareFeet = 8.0;

	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    
	    System.out.println("This program will display the "  + "carpet cost of a room." + "\nPlease enter the room's " + "dimension in feet.");

	    // Get the length of the room.
	    System.out.print("Enter the length of room: ");
	    double length = keyboard.nextDouble();

	    // Get the width of the room.
	    System.out.print("Enter the width of room: ");
	    double width = keyboard.nextDouble();
	    
	    System.out.print("Enter Cost Per Square Foot:");
	  
	    
	    //close keyboard
	    keyboard.close();

	    // Create RoomDimension and RoomCarpet objects.
	    //CarpetCalculatorDriver calculatorProgram = new CarpetCalculatorDriver();
	    RoomDimensions demensions = new RoomDimensions (length,  width);
	    CarpetDemensions roomCarpet = new CarpetDemensions(demensions,carpetPerSquareFeet);

	    // Print the object calling the toString
	    
	    System.out.println(roomCarpet);
	    
	}

}
