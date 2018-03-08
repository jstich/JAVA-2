package ProgramingChallenge1;


public class RainFall {
	private int lowest;
	private int highest;
	private double avg;
	private double total;

	
	
	

	
	public RainFall() {
		// TODO Auto-generated constructor stub
	}
	
	public int getLowest() {
		return lowest;
	}
	
	public void setLowest(int lowest) {
		this.lowest = lowest;
	}
	
	public int getHighest() {
		return highest;
	}
	
	public void setHighest(int highest) {
		this.highest = highest;
	}
	
	public double getAvg() {
		return avg / 12.0;
	}
	
	public void setAvg(double avg) {
		this.avg += avg;
	}

	public int getTotal() {
		
		return (int) total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}