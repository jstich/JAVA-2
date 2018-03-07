package ProgramingChallenge7;

import java.text.DecimalFormat;

import java.util.Scanner;

public class AverageRainFallDriver {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner         keyboard = new Scanner(System.in);
        AverageRainFall rain     = new AverageRainFall();
        int             years;    // years

        System.out.print("How many years are you calculating: ");
        years = keyboard.nextInt();    // sets years

        while (years < 1) {
            System.out.print("Invalid data; RE-Enter the amount of years are you calculating: ");
            years = keyboard.nextInt();
        }

        rain.setYears(years);
        rain.setAvg(0);

        DecimalFormat multiple = new DecimalFormat("#,##0.00");

        System.out.println("For " + years + " year the average rainfall is " + multiple.format(rain.getAvg()));
    }
}



