package ProgramingChallenge10;

public class ParkingTicketSimulatorDriver {

	public static void main(String[] args) {
		ParkedCarClass car = new ParkedCarClass("Chevy", "Monte Carlo", "JSTICH", 25);
		ParkingMeterClass meter = new ParkingMeterClass(30);
		PoliceOfficerClass officer1 = new PoliceOfficerClass("Lyle", 1234);
		ParkingTicketClass ticket = new ParkingTicketClass(meter, car, officer1);
		PoliceOfficerClass officer2 = new PoliceOfficerClass(officer1, car, meter, ticket);
		officer2.examineCar();
		

	}
}
