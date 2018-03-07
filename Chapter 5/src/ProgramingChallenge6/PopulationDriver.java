package ProgramingChallenge6;

import java.text.DecimalFormat;

import java.util.Scanner;

public class PopulationDriver {
    public static void main(String[] args) {

        // initiates the Scanner
        Scanner keyboard = new Scanner(System.in);

        // initiates the constructor
        Population   population      = new Population();
        int    startPop        = 0;    // starting population
        double percentIncrease = 0;    // percent increase
        int    days            = 0;    // number of days

        // gets startPop
        System.out.print("Enter the starting Population: ");
        startPop = keyboard.nextInt();    

        while (startPop < 2) {    
            System.out.print("Invalid Data Re-Enter the starting Population: ");
            startPop = keyboard.nextInt();
        }

        population.setStartPop(startPop);   
        population.setDailyPop(startPop);    

        // gets Percent Increase
        System.out.print("Enter the percentage Increase for the Population ");
        percentIncrease = keyboard.nextDouble();   

        while (percentIncrease <= 0) {    
            System.out.print("Invalid Data RE-Enter the percentage Increase for the Population ");
            percentIncrease = keyboard.nextDouble();
        }

        percentIncrease = percentIncrease / 100;    
        population.setPercentIncrease(percentIncrease);   

        // gets num of days
        System.out.print("Enter the number of days the Population will multipy by ");
        days = keyboard.nextInt();    

        while (days < 1) {   
            System.out.print("Invalid Data Re-Enter the number of days the Population will multipy by ");
            days = keyboard.nextInt();
        }

        population.setDay(days);    

        DecimalFormat single = new DecimalFormat("#,##0");    

        for (int i = 1; i <= population.getDay(); ++i) {

            // prints out the output
            System.out.println("Day " + i + ", the population is " + single.format(population.getDailyPop()));
            
            keyboard.close();
        }
    }
}

