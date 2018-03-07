package ProgramingChallenge3;

public class RoomDimensions {
	
	     double length;
	     double width;

	    public RoomDimensions(double length, double width) {
	       
	        this.length = length;
	        this.width = width;
	    }

	    public double getLength() {
	        return length;
	    }

	    public double getWidth() {
	        return width;
	    }

	    public double getArea() {
	        return length * width;
	    }

	    
	    public String toString() {
	        return "RoomDimensions length=" + length + ", width = " + width + " the area is: " + getArea();
	    }
	
	
	
	
	
	
	
	
	
}
