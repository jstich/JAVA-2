package ProgramingChallenge10;

import java.text.DecimalFormat;
import java.util.Scanner;

import ProgramingChallenge10.SavingAccount.SavingsAccount;

public class SavingAccoutDriver {

	public static void main(String args[]) {

	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    // Ask user to enter starting balance
	    System.out.print("How much money is in the account?: ");
	    double startingBalance = keyboard.nextDouble();

	    // Ask user for annual interest rate
	    System.out.print("Enter the annual interest rate:");
	    double annualInterestRate = keyboard.nextDouble();

	    // Create class
	    SavingsAccount savingAccountClass = new SavingsAccount(annualInterestRate, annualInterestRate);
	SavingAccount savingAccount = savingAccountClass.new SavingAccount(
	            startingBalance, annualInterestRate);

	    // Ask how long account was opened
	    System.out.print("How long has the account been opened? ");
	    double months = keyboard.nextInt();

	    double montlyDeposit;
	    double monthlyWithdrawl;
	    double interestEarned = 0.0;
	    double totalDeposits = 0;
	    double totalWithdrawn = 0;

	    // For each month as user to enter information
	    for (int i = 1; i <= months; i++) {

	        // Get deposits for month
	        System.out.print("Enter amount deposited for month: " + i + ": ");
	        montlyDeposit = keyboard.nextDouble();
	        totalDeposits += montlyDeposit;

	        // Add deposits savings account
	        savingAccount.deposit(montlyDeposit);

	      
	        System.out.print("Enter amount withdrawn for " + i + ": ");
	        monthlyWithdrawl = keyboard.nextDouble();
	        totalWithdrawn += monthlyWithdrawl;

	        // Subtract the withdrawals
	        savingAccount.withdraw(monthlyWithdrawl);

	        // Add the monthly interest
	        savingAccount.addInterest();

	        interestEarned += savingAccount.getLastAmountOfInterestEarned();
	    }

	    // close keyboard
	    keyboard.close();

	    // Create a DecimalFormat object for formatting output.
	    DecimalFormat dollar = new DecimalFormat("#,##0.00");

	    // Display the totals and the balance.
	    System.out.println("Total deposited: $" + dollar.format(totalDeposits));
	    System.out.println("Total withdrawn: $" + dollar.format(totalWithdrawn));
	    System.out.println("Interest earned: $" + dollar.format(interestEarned));
	    System.out.println("Ending balance: $"
	            + dollar.format(savingAccount.getAccountBalance()));
	}
}
