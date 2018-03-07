package ProgramingChallenge17;

import java.util.Scanner;
public class HotDogCookOutCalculator
{
	public static void main(String[] args)
	{
		// create the constant values
		final int HOT_DOGS_PER_PACKAGE = 10;
		final int HOT_DOG_BUNS_PER_PACKAGE = 8;
		
		// create an object for Scanner class
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// ask the user to enter the number of people attending the cookout
		System.out.print("Enter the number of people attending the cookout: ");
		int cookoutPeople = input.nextInt();
		
		// ask the user to enter the number of hot dogs each person will be given
		System.out.print("Enter the number of hot dogs each person will be given: ");
		int hotdogsPerPerson = input.nextInt();
		
		// calculate the total hot buns cookout
		int totalCookoutHotBuns = cookoutPeople * hotdogsPerPerson;
		
		// calculate the minimum number of packages of hot dogs required
		int minimumHotDogs = totalCookoutHotBuns / HOT_DOGS_PER_PACKAGE;
		
		// calculate the minimum number of packages of buns required
		int minimumHotDogBuns = totalCookoutHotBuns / HOT_DOG_BUNS_PER_PACKAGE;
		
		// calculate the number of hot dogs that will be loft over
		int leftoverHotDogs = totalCookoutHotBuns % HOT_DOGS_PER_PACKAGE;
		
		// calculate the number of buns that will be loft over
		int leftoverHotDogBuns = totalCookoutHotBuns % HOT_DOG_BUNS_PER_PACKAGE;
				
		if(leftoverHotDogs > 0)
		{
			// finalize the minimum number of packages of hot dogs required
			minimumHotDogs = minimumHotDogs + 1;
			
			// finalize the number of hot dogs that will be loft over
			leftoverHotDogs = HOT_DOGS_PER_PACKAGE - leftoverHotDogs;
		}
		
		if(leftoverHotDogBuns > 0)
		{
			// finalize the minimum number of packages of buns required
			minimumHotDogBuns = minimumHotDogBuns + 1;
			
			// finalize the number of buns that will be loft over
			leftoverHotDogBuns = HOT_DOG_BUNS_PER_PACKAGE - leftoverHotDogBuns;
		}
		
		// display the final results
		System.out.println("\nThe minimum number of packages of hot dogs required: " + minimumHotDogs);
		System.out.println("The minumum number of packages of buns required: " + minimumHotDogBuns);
		System.out.println("The number of hot dogs that will be left over: " + leftoverHotDogs);
		System.out.println("The number of buns that will be left over: " + leftoverHotDogBuns);
	}
}