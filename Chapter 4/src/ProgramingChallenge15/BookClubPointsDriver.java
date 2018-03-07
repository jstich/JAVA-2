package ProgramingChallenge15;

import java.util.Scanner;

public class BookClubPointsDriver {

	public static void main(String[] args) {

		  // Define variables
	    int numberOfBooksPurchased;
	    int pointsAwarded;
	 
	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);
	 
	    // Get the number of books purchased this month.
	    System.out.print("How many books have you purchased? ");
	    numberOfBooksPurchased = keyboard.nextInt();
	 
	    keyboard.close();
	 
	    // Determine the number of points to award.
	    pointsAwarded = getPointsEarned(numberOfBooksPurchased);
	 
	    // Display the points earned.
	    System.out.println("You've earned " + pointsAwarded + " points.");
	}
	 

	public static int getPointsEarned(int numberOfBooksPurchased) {
	 
	    if (numberOfBooksPurchased < 1) {
	        return 0;
	    } else if (numberOfBooksPurchased == 1) {
	        return 5;
	    } else if (numberOfBooksPurchased == 2) {
	        return 15;
	    } else if (numberOfBooksPurchased == 3) {
	        return 30;
	    } else {
	        return 60;
	    }
	}
}
