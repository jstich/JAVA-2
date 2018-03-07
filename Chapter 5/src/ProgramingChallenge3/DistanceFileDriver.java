package ProgramingChallenge3;

import java.io.*;

import java.util.Scanner;

public class DistanceFileDriver {
    public static void main(String[] args) throws IOException {
        PrintWriter  distanceFile = new PrintWriter("distanceFile.txt");
       
        
		@SuppressWarnings("resource")
		Scanner      keyboard     = new Scanner(System.in);    // Initiates the scanner object to get user input
        DistanceFile num          = new DistanceFile();        // calls the constructor
        int          speed;                                    // variable for speed
        int          time;                                     // variable for time

        do {
            System.out.println("Enter a speed above Zero");
            distanceFile.println("Enter a speed above Zero");
            speed = keyboard.nextInt();    
        } while (speed < 0);               

        do {
            System.out.println("Enter the time in hours you are going ");
            distanceFile.println("Enter the time in hours you are going ");
            time = keyboard.nextInt();    
        } while (time < 0);               

        num.setSpeed(speed);
        System.out.println("Hour\t\t Distance traveled");
        distanceFile.println("Hour\t\t Distance traveled");
        System.out.println("**********************************");
        distanceFile.println("**********************************");

        for (int i = 1; i <= time; i++) {
            num.setTime(i);                                              
            System.out.printf("%d\t\t\t %d\n", i, num.getdistance());    // display the output
            distanceFile.printf("%d\t\t\t %d\n", i, num.getdistance());
            distanceFile.println(" Stich\t\nLyle\t\nLumbar\t\n ayeeee it worked");
            distanceFile.println(" Freeman Wednesday? ");
        }

        // close the writer
        distanceFile.close();
     
    }
}



