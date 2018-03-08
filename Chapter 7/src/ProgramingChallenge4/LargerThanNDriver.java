package ProgramingChallenge4;

import java.util.Scanner;

public class LargerThanNDriver {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard= new Scanner(System.in);
		LargerThanN p1 = new LargerThanN();
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println("Enter a number between 1 - 20: ");
		int number = keyboard.nextInt();
		p1.greaterThan(array, number);
	}

}