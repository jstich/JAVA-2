package ProgramingChallenge3;

import ProgramingChallenge1.ProductWorker;

public class TeamLeader extends ProductWorker {

	private double fixedBonus;
	private double traininghours;
	public TeamLeader() {
		
	}
	
	public double getFixedBonus() {
		return fixedBonus;
	}
	
	public void setFixedBonus(double fixedBonus) {
		this.fixedBonus = fixedBonus;
	}
	
	public double getTraininghours() {
		return traininghours;
	}
	
	public void setTraininghours(double traininghours) {
		this.traininghours = traininghours;
	}
	
}