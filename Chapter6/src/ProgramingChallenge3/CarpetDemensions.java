package ProgramingChallenge3;

public class CarpetDemensions {
	    private RoomDimensions roomDimensions;
	    private double cost;

	    public CarpetDemensions(RoomDimensions roomDimensions,  double cost) {
	       
	        this.roomDimensions = roomDimensions;
	        this.cost = cost;
	    }

	    public double getTotalCost() {
	        return cost * roomDimensions.getArea();
	    }

	    
	    public String toString() {
	        return   roomDimensions.toString() +  "\nThe cost of carpet = " + cost + ", "  + "\n total cost = " + getTotalCost() ;
	    }

	}

