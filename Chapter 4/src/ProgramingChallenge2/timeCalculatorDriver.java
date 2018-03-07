package ProgramingChallenge2;

import java.util.Scanner;

public class timeCalculatorDriver {
    public static void main(String[] args) {
        Scanner        input = new Scanner(System.in);
        int            seconds;
        
        timeCalculator num = new timeCalculator();

        System.out.println("Enter a number of seconds:");
        seconds = input.nextInt();
        num.setSeconds(seconds);
        num.getSeconds();
        input.close();
    }
}



