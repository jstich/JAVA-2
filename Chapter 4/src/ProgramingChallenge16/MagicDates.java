package ProgramingChallenge16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class MagicDates {

    /**
     * Method will check if a date is magic define by month * date = last two
     * days of year
     *
     * @param date
     * @return true if the date is magic
     */
    public static boolean magicDate(LocalDate date) {
        int    month         = date.getMonth().getValue();
        int    day           = date.getDayOfMonth();
        int    year          = date.getYear();
        String yearAsString  = String.valueOf(year);
        String lastTwoDigits = "0";

        if (yearAsString.length() == 4) {
            lastTwoDigits = yearAsString.substring(2);
        }

        return (month * day) == Integer.parseInt(lastTwoDigits);
    }

    public static void main(String[] args) {

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter date in mm/dd/yyyy format:");

        String dateAsString = keyboard.next();

        // close stream
        keyboard.close();

        // Parse string to date
        LocalDate date = LocalDate.parse(dateAsString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        // check date and display output
        if (magicDate(date)) {
            System.out.println("That date is magic!");
        } else {
            System.out.println("nothing magic about that date...");
        }
    }
}



