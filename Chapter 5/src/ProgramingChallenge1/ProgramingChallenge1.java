package ProgramingChallenge1;

import java.util.Scanner;

public class ProgramingChallenge1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Positive Number");

        // Declare variable to hold user input
        int num = scan.nextInt();

        // Declare variable to hold sum
        int sum = 0;

        // Construct for loop to obtain the sum of integers from 1 up to the users input.
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com88ijm 