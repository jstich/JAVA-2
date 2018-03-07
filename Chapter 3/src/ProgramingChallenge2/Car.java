package ProgramingChallenge2;

public class Car {
	//fields
	private int yearModel;
	private String make;
	private int speed;
	
	//get and setters
	public Car(){
		
		}


	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getaccelerate(){
		return speed  += 5;
	}
	
	public int  getbrake(){
		return speed  -= 5;
	}
	
public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.setYearModel(2003);
		car1.setMake("chevy");
		car1.setSpeed(30);
		
		//Print OutPut
		System.out.println( "Current speed of the " + car1.getYearModel() + " " + car1.getMake() +  " is " + car1.getSpeed() );
		System.out.println( "Accelerating...." );
		for( int seconds = 1; seconds <= 5; seconds++ ){
			car1.getaccelerate();
			System.out.println( "Current speed of the " + car1.getYearModel() + " " + car1.getMake() + " is " + car1.getSpeed() );
			
		}
		System.out.println("Brakeing");
		
		for( int seconds = 1; seconds <= 5; seconds++ ){
			car1.getbrake();
			System.out.println( "Current speed of the " + car1.getYearModel() + " " + car1.getMake() + " is " + car1.getSpeed() );
			
		}

		
		
		
}
}
