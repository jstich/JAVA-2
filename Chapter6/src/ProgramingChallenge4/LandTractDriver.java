package ProgramingChallenge4;

import java.util.Scanner;

public class LandTractDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double  length;
        double  width;

        System.out.println("Enter the length of the track 1: ");
        length = keyboard.nextDouble();
        System.out.println("Enter the Width of the track 1: ");
        width = keyboard.nextDouble();

        LandTract p1 = new LandTract(length, width);

        System.out.println("Enter the length of the track 2: ");
        length = keyboard.nextDouble();
        System.out.println("Enter the Width of the track 2: ");
        width = keyboard.nextDouble();

        LandTract p2 = new LandTract(length, width);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        if (p1.equals(p2)) {
            System.out.println("Track 1 and Track 2 are equal");
        } else {
            System.out.println("Track 1 and Track 2 are not equal");
        }

        keyboard.close();
    }
}


