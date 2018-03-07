package ProgramingChallenge4;

import java.util.Scanner;

public class PenniesForPayDriver {

	public static void main(String[] args) {
		PenniesForPay num = new PenniesForPay();
		Scanner keyboard = new Scanner(System.in);
		int day;
		System.out.print("Enter the number of days: ");
		day = keyboard.nextInt();
		while(day < 1){
			System.out.print("Incorect data Re-Enter the number of days: ");
			day = keyboard.nextInt();
		}
		num.setDays(day);
		num.getSum();
		keyboard.close();
	}

}