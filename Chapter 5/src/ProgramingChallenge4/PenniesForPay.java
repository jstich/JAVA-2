package ProgramingChallenge4;

import java.text.DecimalFormat;

public class PenniesForPay {

	private int number = 1;
	private double sum;
	private int days;
	
	public PenniesForPay() {
		// TODO Auto-generated constructor stub
	}
	DecimalFormat money = new DecimalFormat("$#,##0.00");
	public void getSum(){
		double cash = 0;
		int i = 1;
		while (i <= days){
			if(number == 1){
				sum = number;
				number++;
				cash = sum / 100;
				System.out.println("Salary for day "+i+ " is "+money.format(cash));
			}else {
				sum = sum * 2;
				cash = sum / 100;
				System.out.println("Salary for day "+i+ " is "+money.format(cash));
			}
			i++;
		}
	}


	public int getDays() {
		return days;
	}

	
	public void setDays(int days) {
		this.days = days;
	}

}