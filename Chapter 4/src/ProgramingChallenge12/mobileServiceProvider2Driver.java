package ProgramingChallenge12;

import java.util.Scanner;

import ProgramingChallenge11.mobileServiceProvider;

public class mobileServiceProvider2Driver
{
	public static void main(String args[])
	{
		int mins;
		char Package;
		double total_amount=0;
		String s1;
		// create a Scanner object to get the input from user
		@SuppressWarnings("resource")
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("\t Menu");
		System.out.println("\tA-Package A \tB-Package B \tC-Package C");
		System.out.println("Enter your package: ");
		s1=keyboard.nextLine();
		Package =s1.charAt(0);
		// prompt the user to enter the number of mins.
		System.out.println("Enter the number of mins:");
		mins = keyboard.nextInt();
		
		mobileServiceProvider mspp = new mobileServiceProvider(Package, mins);
		total_amount = mspp.getTotalCharges();
		System.out.println("Monthly bill on Package is: $"+total_amount);
		System.exit(0);
		
	}
}