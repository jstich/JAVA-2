package ProgramingChallenge1;

import java.util.Scanner;

public class RomanNumeralDriver {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        // Create a scanner object to read input
        Scanner       keyboard = new Scanner(System.in);
        RomanNumerals num      = new RomanNumerals();

        // Get a number from the user.
        System.out.print("Enter a number in the range of 1 - 10: ");

        // User inputed number
        int numbers1 = keyboard.nextInt();

        num.setNumber(numbers1);
        num.getNumber();

        // close stream
        keyboard.close();
    }
}



