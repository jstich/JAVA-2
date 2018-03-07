package ProgramingChallenge6;

public class Population {
	private double startPop; //starting Population
	private double percentIncrease; // percent of increase
	private double day; // number of days
	private double dailyPop; //daily population
	
	public Population() {
		// TODO Auto-generated constructor stub
	}
	
	public double getDailyPop() {
		dailyPop = dailyPop + (percentIncrease * dailyPop ) ;
		return dailyPop;
	}
	
	public void setDailyPop(double dailyPop) {
		this.dailyPop = dailyPop;
	}
	
	public double getStartPop() {
		return startPop;
	}

	
	public void setStartPop(double startPop) {
		this.startPop = startPop;

	}

	
	public double getPercentIncrease() {
		return percentIncrease;
	}

	
	public void setPercentIncrease(double percentIncrease) {
		this.percentIncrease = percentIncrease;
	}

	
	public double getDay() {
		return day;
	}

	
	public void setDay(double day) {
		this.day = day;
	}
	
}