package ProgramingChallenge11;


public class Procedure {
    //instance variables- the data a Procedure object will hold
	private String nameOfProcedure;
	private String dateOfProcedure;
	private String practionerName;
	private double cost;
	
	//constructor- called when a new object is created
	//its job is to construct the object by initializing its data
	public Procedure(String nameOfProcedure, String dateOfProcedure, String practionerName, double cost) {
	    this.nameOfProcedure = nameOfProcedure;
	    this.dateOfProcedure = dateOfProcedure;
	    this.practionerName = practionerName;
	    this.cost = cost;
	}
	
	//getter (accessor) methods- a way to retrieve the object's data
	//setter (mutator) methods- a way to update the object's data
	
	public String getNameOfProcedure() {
		return nameOfProcedure;
	}
	
	public void setNameOfProcedure(String nameOfProcedure) {
		this.nameOfProcedure = nameOfProcedure;
	}
	
	public String getDateOfProcedure() {
		return dateOfProcedure;
	}
	
	public void setDateOfProcedure(String dateOfProcedure) {
		this.dateOfProcedure = dateOfProcedure;
	}
	
	public String getPractionerName() {
		return practionerName;
	}
	
	public void setPractionerName(String practionerName) {
		this.practionerName = practionerName;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}