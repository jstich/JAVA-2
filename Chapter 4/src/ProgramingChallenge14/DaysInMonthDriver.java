package ProgramingChallenge14;

import java.util.Scanner;

public class DaysInMonthDriver {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month, 1-12: ");

        int month = input.nextInt();
         int year = input.nextInt();
        if (month > 12) {
            System.out.print("Invalid month " + month);
        } else {
            
			System.out.print("Enter a year: " + year);
        }
    }
}



