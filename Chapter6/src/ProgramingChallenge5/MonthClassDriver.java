package ProgramingChallenge5;


import java.util.Scanner;

public class MonthClassDriver
{
    
	public static void main(String[] args)
	   {
	      // Use the no-arg constructor.
	      MonthClass object1 = new MonthClass();
	      System.out.println("Month " + object1.getMonthNumber() +
	                         " = " + object1);
		  MonthClass object2 = new MonthClass(2);
		  for (int i = 1; i <= 12; i++)
	      {
	         object2.setMonthNumber(i);
	         System.out.println("Month " + object2.getMonthNumber() +
	                         " name is " + object2);
	      }
			
			String mName;
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			MonthClass object5 = new MonthClass();
			
			System.out.println("Enter a month name: ");
			mName = keyboard.nextLine();
			System.out.println(object5.getMonthName());
	   }
	}
    
  

