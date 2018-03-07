package ProgramingChallenge7;

import java.util.Scanner;

public class AverageRainFall {
	private double Avg; //average
	private double years; // years
	private final double months = 12; //months
	
	public AverageRainFall() {
	// TODO Auto-generated constructor stub
	}


	public double getAvg() {
	return Avg;
	}

	
	public void setAvg(double avg) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		double rainAmount;
		double totalRain = 0;
		for(int i = 1; i <= years; i++){
			for(int x = 1; x <= 12; x++){
				System.out.print("For year "+i+", month "+x+" How much rain fell in inches: ");
				rainAmount = keyboard.nextDouble();
				while(rainAmount < 0){
					System.out.print("Invalid Data Re-Enter rain fall for year "+i+", month "+x+": ");
					rainAmount = keyboard.nextDouble();
				}
			totalRain += rainAmount;
			}
		}
		avg = totalRain / (years * months);
		Avg = avg;
	}
	
	
	/**
	* @return the years
	*/
	public double getYears() {
		return years;
	}

	/**
	* @param years the years to set
	*/
	public void setYears(double years) {
		this.years = years;
	}
	}