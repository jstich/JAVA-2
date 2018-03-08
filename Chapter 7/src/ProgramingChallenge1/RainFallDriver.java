package ProgramingChallenge1;

import java.text.DecimalFormat;

import java.util.Scanner;

public class RainFallDriver {
    public static void main(String[] args) {
        int total = 0;
        @SuppressWarnings("resource")
        Scanner  keyboard = new Scanner(System.in);
        RainFall p1       = new RainFall();
        double[] rainfall = new double[12];

        for (int i = 0; i < rainfall.length; i++) {
            System.out.print("Enter the rainfall for month " + (i + 1) + ": ");
            rainfall[i] = keyboard.nextDouble();

            while (rainfall[i] < 0) {
                System.out.println("Incorect data entered please Re-Enter");
                System.out.print("Enter the rainfall for month " + (i + 1) + ": ");
                rainfall[i] = keyboard.nextDouble();
            }
           
            p1.setAvg(rainfall[i]);
        }

        double low = rainfall[0];

        p1.setLowest(0 + 1);

        double high = rainfall[0];

        p1.setLowest(0 + 1);

        for (int i = 0; i < rainfall.length; i++) {
            if (rainfall[i] < low) {
                low = rainfall[i];
                p1.setLowest(i + 1);
            }
        }

        for (int i = 0; i < rainfall.length; i++) {
            if (rainfall[i] > high) {
                high = rainfall[i];
                p1.setHighest(i + 1);
            }
        }

        for (int i = 0; i < rainfall.length; i++) {
            System.out.println("For month " + (i + 1) + " the Rainfall is: " + rainfall[i]);
            total = total + (int)rainfall[i];
        }
        p1.setTotal(total);

        DecimalFormat multiple = new DecimalFormat("#,##0.00");
        System.out.println("The total rainfall for this year is " + p1. getTotal());
        System.out.println("The average is: " + multiple.format(p1.getAvg()));
        System.out.println("The month with the lowest rainfall is month " + p1.getLowest());
        System.out.println("The month with the highest rainfall is month " + p1.getHighest());
    }
}

