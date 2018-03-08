package ProgramingChallenge2;


public class PayRoll {
	int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	int[] hours = new int[7];
	double[] payRate = new double[7];
	double[] wages = new double[7];
	private int count = 0;
	public PayRoll() {
		}
	public void addCount(){
		count++;
	}
	
	public int[] getEmployeeId() {
		return employeeId;
	}
	
	public int[] getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours[count] = hours;
	}
	
	public double[] getPayRate() {
		return payRate;
	}
	
	public void setPayRate(double payRate) {
		this.payRate[count] = payRate;
	}
	
	public double[] getWages() {
		return wages;
	}
	
	public void setWages() {
		this.wages[count] = payRate[count] * hours[count];
	}
	
}