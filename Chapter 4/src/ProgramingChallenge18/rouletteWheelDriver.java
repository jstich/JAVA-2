package ProgramingChallenge18;
import java.util.Scanner;
public class rouletteWheelDriver
{
	// start main method
	public static void main(String[] args)
	{
		// create an object for Scanner class
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// ask the user to enter a pocket number
		System.out.print("Enter a pocket number: ");
		int number = input.nextInt();
		
		// create an object for the RoulettePocket class
		rouletteWheel rp = new rouletteWheel(number);
		
		// call the getPocketColor method and print the pocket's color
		System.out.println("Pocket color is: " + rp.getPocketColor());
	}
} 