package ProgramingChallenge9;

import java.util.Scanner;

public class PayrollDriver {
    public static void main(String[] args) {
        int    userInputInt    = -1;      // for user input
        double userInputDouble = -1.0;    // for user input
        double grossPayTotal   = 0;       // total gross pay
        double stateTaxTotal   = 0;       // total state tax
        double federalTaxTotal = 0;       // total federal tax
        double ficaTotal       = 0;       // total Fica
        double netPayTotal     = 0;       // total net pay

        // instantiate a scanner object for reading input
        Scanner keyboard = new Scanner(System.in);

        // instantiate a payroll report object
        PayrollDriver report = new PayrollDriver();

        while (userInputInt != 0) {
            while (userInputInt < 0) {
                userInputInt = -1;
                System.out.println("enter an employee number: ");
                userInputInt = keyboard.nextInt();
                report.setEmployeeNum(userInputInt);

                if (userInputInt < 0) {
                    System.out.println("please enter a greater number than 0\n");
                }
            }

            if (userInputInt == 0) {
                break;
            }

            // reset userInputint
            userInputInt    = -1;
            userInputDouble = -1.0;

            if (userInputInt != 0) {
                while (userInputDouble < 0) {
                    userInputDouble = -1.0;
                    System.out.println("enter the gross pay: ");
                    userInputDouble = keyboard.nextDouble();

                    // set the gross pay
                    report.setGrossPay(userInputDouble);

                    // get the gross pay and increment
                    grossPayTotal += report.getGrossPay();

                    if (userInputDouble < 0) {
                        System.out.println("please enter a greater number than 0\n");
                    }
                }

                userInputDouble = -1.0;

                while ((userInputDouble < 0) || (userInputDouble > report.getGrossPay())) {
                    userInputDouble = -1.0;
                }

                System.out.println("enter the state tax: ");
                userInputDouble = keyboard.nextDouble();

                // set state tax
                report.setStateTax(userInputDouble);

                // get the state tax and increment
                stateTaxTotal += report.getStateTax();

                if (userInputDouble < 0) {
                    System.out.println("please enter a greater number than 0\n");

                    // end if
                    if (userInputDouble > report.getGrossPay()) {
                        System.out.println("your state tax should not be greater than your gross pay");
                    }
                }
            }

            userInputDouble = -1.0;

            while ((userInputDouble < 0) || (userInputDouble > report.getGrossPay())) {
                userInputDouble = -1.0;
            }

            System.out.println("enter the federal tax: ");
            userInputDouble = keyboard.nextDouble();

            // set federal tax
            report.setFederalTax(userInputDouble);

            // get the federal tax amount
            federalTaxTotal += report.getFederalTax();

            if (userInputDouble < 0) {
                System.out.println("Please enter a number greater than 0\n");
            }

            if (userInputDouble > report.getFederalTax()) {
                System.out.println("your federal tax should not be greater than your gross pay");
            }
        }

        userInputDouble = -1.0;

        while ((userInputDouble < 0) || (userInputDouble > report.getGrossPay())) {
            userInputDouble = -1.0;

            // ask user for Fica withholdings
            System.out.println("enter the FICA withholdings: ");
            userInputDouble = keyboard.nextDouble();

            // set Fica
            report.setFica(userInputDouble);

            // get fica
            ficaTotal += report.getFica();

            if (userInputDouble < 0) {
                System.out.println("Please enter a number greater than 0\n");
            }

            if (userInputDouble > report.getFica()) {
                System.out.println("your FICA should not be greater than your gross pay");
            }

            netPayTotal += report.getNetPay();

            if ((report.getStateTax() + report.getFederalTax() + report.getFica()) > report.getGrossPay()) {
                ;
            }

            // Display  message to user
            System.out.println("your taxes should not be greater than the gross pay\n");
            grossPayTotal   -= report.getGrossPay();
            stateTaxTotal   -= report.getStateTax();
            federalTaxTotal -= report.getFederalTax();
            netPayTotal     -= report.getNetPay();

            continue;
        }

        report.printEmployeeReport();

        if (report.getEmployeeNum() == 0) {
            report.printTotals(grossPayTotal, stateTaxTotal, federalTaxTotal, ficaTotal, netPayTotal);
        }

        keyboard.close();
    }

    private void printEmployeeReport() {

        // TODO Auto-generated method stub
    }

    private void printTotals(double grossPayTotal, double stateTaxTotal, double federalTaxTotal, double ficaTotal,
                             double netPayTotal) {

        // TODO Auto-generated method stub
    }

    private int getEmployeeNum() {

        // TODO Auto-generated method stub
        return 0;
    }

    private void setEmployeeNum(int userInputInt) {

        // TODO Auto-generated method stub
    }

    private double getFederalTax() {

        // TODO Auto-generated method stub
        return 0;
    }

    private void setFederalTax(double userInputDouble) {

        // TODO Auto-generated method stub
    }

    private double getFica() {

        // TODO Auto-generated method stub
        return 0;
    }

    private void setFica(double userInputDouble) {

        // TODO Auto-generated method stub
    }

    private double getGrossPay() {

        // TODO Auto-generated method stub
        return 0;
    }

    private void setGrossPay(double userInputDouble) {

        // TODO Auto-generated method stub
    }

    private double getNetPay() {

        // TODO Auto-generated method stub
        return 0;
    }

    private double getStateTax() {

        // TODO Auto-generated method stub
        return 0;
    }

    private void setStateTax(double userInputDouble) {

        // TODO Auto-generated method stub
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
