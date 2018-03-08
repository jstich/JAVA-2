package ProgramingChallenge3;

import java.util.Scanner;

public class ChargeAccountValidatorDriver {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		ChargeAccountValidation p1 = new ChargeAccountValidation();
		int userInput = 0;
		do {
			System.out.println("Enter the number or 999 to quit");
			userInput = keyboard.nextInt();
			if (userInput != 999){
				if (p1.squaetialSearch(userInput) == -1){
					System.out.println("The number was not found");
				}
				else {
					System.out.println("The number was found");
				}	
			}
		}while(userInput != 999);
	}
}