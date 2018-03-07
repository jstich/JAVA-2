package ProgramingChallenge11;

public class GeometryCalculator {
	private double area; // the area of the shape
	
	public GeometryCalculator() {
	// TODO Auto-generated constructor stub
	}
	
	public static double calcArea(double radius){
		return Math.PI * (radius * radius);
	}
	
	public static double calcArea(double length, double width){
		return length * width;
	}
	
	public static double calcArea(double base, double height, double half){
		return base * height * half;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}