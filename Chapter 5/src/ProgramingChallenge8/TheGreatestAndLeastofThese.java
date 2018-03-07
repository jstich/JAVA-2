package ProgramingChallenge8;

import java.util.Scanner;

public class TheGreatestAndLeastofThese
{
	public static void main(String[] args)
    {
        int num,
            max,
            min;

        @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer to compare. Enter -99 to quit: ");
        num = keyboard.nextInt();
        max = num;
        min = num;
        
        while(num != -99)
        {
            if (num > max)
            {
                max = num;
            }
            
            else if (num < min)
            {
                min = num;
            }
            
            else if (max == -99) 
            {
                max = num;
            }
            
            else if (min == -99)
            {
                min = num;
            }
            else
            {
                System.out.print("Enter an integer to compare. Enter -99 to quit: ");
                num = keyboard.nextInt();
            }
        }
 
        System.out.println("Greatest: " + max);
        System.out.println("Least: " + min);
    }
}