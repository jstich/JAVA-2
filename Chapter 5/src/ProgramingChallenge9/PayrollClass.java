package ProgramingChallenge9;

/**
 *
 */

/**
 * @author jts5b_000
 *
 */
import java.text.DecimalFormat;

public class PayrollClass {
    private int    employeeNum;    // employee number
    private double grossPay;       // gross pay
    private double stateTax;       // state tax
    private double federalTax;     // federal tax
    private double fica;           // FICA withholdings

    public PayrollClass() {}

    public void printEmployeeReport() {
        DecimalFormat formatter = new DecimalFormat("$###, ##0.00");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" + "Employee Number: " + this.getEmployeeNum() + "\n"
                           + "Gross pay" + formatter.format(this.getGrossPay()) + "\n" + "state tax"
                           + formatter.format(this.getStateTax()) + "\n" + "federal tax"
                           + formatter.format(this.getFederalTax()) + "\n" + "FICA Withholding:"
                           + formatter.format(this.getFica()) + "\n" + "net pay" + formatter.format(this.getNetPay()));
    }

    public void printTotals(double grossPay, double stateTax, double federalTax, double fica, double netPay) {
        DecimalFormat formatter = new DecimalFormat("$###,##0.00");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" + "All employee totals" + "\n" + "Gross pay"
                           + formatter.format(grossPay) + "\n" + "state tax" + formatter.format(stateTax) + "\n"
                           + "federal tax" + formatter.format(federalTax) + "\n" + "FICA Withholding:"
                           + formatter.format(fica) + "\n" + "net pay" + formatter.format(netPay));
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    public double getFica() {
        return fica;
    }

    public void setFica(double fica) {
        this.fica = fica;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getNetPay() {
        return (grossPay - stateTax - federalTax - fica);
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }
}



