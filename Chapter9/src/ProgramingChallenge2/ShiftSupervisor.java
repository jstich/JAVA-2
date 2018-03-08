package ProgramingChallenge2;

import ProgramingChallenge1.Employee;

public class ShiftSupervisor extends Employee {

	private double salary;
	private double production;
	public ShiftSupervisor() {
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getProduction() {
		return production;
	}
	
	public void setProduction(double production) {
		this.production = production;
	}
	

}