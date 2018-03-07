package ProgramingChallenge10;

public class ParkingMeterClass {
	private double numMinutesPurchased;

	public ParkingMeterClass() {
		numMinutesPurchased = 0.0;
	}

	
	public ParkingMeterClass(double numMinutesPurchased) {
		this.numMinutesPurchased = numMinutesPurchased;
	}

	public ParkingMeterClass(ParkingMeterClass object2){
		this.numMinutesPurchased = object2.numMinutesPurchased;	
	}

	
	public double getNumMinutesPurchased() {
		return numMinutesPurchased;
	}

	
	
	public void setNumMinutesPurchased(double numMinutesPurchased) {
		this.numMinutesPurchased = numMinutesPurchased;
	}

	
	@Override
	public String toString() {
		String str;
		str = "Number of minutes purchased: " + this.numMinutesPurchased;
		return str;
	}

	
}
