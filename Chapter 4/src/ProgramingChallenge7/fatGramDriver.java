package ProgramingChallenge7;

import java.util.Scanner;

public class fatGramDriver {
    public static void main(String[] args) {
    	 // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Ask user for number of calories.
        System.out.print("How many calories does the food have? ");
        double calories = keyboard.nextDouble();

        // Get the number of fat grams.
        System.out.print("How many fat grams does the food have? ");
        double fatGrams = keyboard.nextDouble();

        // close scanner
        keyboard.close();

        // Calculate calories from fat.
        double fatCalories = calculateFatCalories(fatGrams);

        // validation check
        if (validateData (fatCalories, calories) ) {
            System.out.println("Invalid data.");
        } else {

            // Calculate percentage of calories from fat.
            double fatPercentage = calculateFatPercentatge(fatCalories, calories);

            // Display the results.
            System.out.println("The percentage of calories from fat is "
                    + (fatPercentage * 100) + "%.");

            if (fatPercentage < 0.3) {
                System.out.println("The food is low in fat.");
            } else {
                System.out.println("The food is NOT low in fat.");
            }
        }
    }

    
    static double calculateFatCalories (double fatGrams) {
        return fatGrams * 9;
    }

   
     
    static double calculateFatPercentatge(double fatCalories, double calories) {
        return fatCalories / calories;
    }

   
    static boolean validateData (double fatCalories, double calories) {
        return fatCalories > calories;
    }
    }



