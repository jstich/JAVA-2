package ProgramingChallenge10;

import java.text.DecimalFormat;

public class ParkingTicketClass {
    private ParkingMeterClass  parkingMeter;
    private ParkedCarClass     parkedCar;
    private PoliceOfficerClass policeOfficer;

    public ParkingTicketClass() {}

    public ParkingTicketClass(ParkingTicketClass parkingTicket) {
        this.parkingMeter  = new ParkingMeterClass(parkingTicket.parkingMeter);
        this.parkedCar     = new ParkedCarClass(parkingTicket.parkedCar);
        this.policeOfficer = new PoliceOfficerClass(parkingTicket.policeOfficer);
    }

    public ParkingTicketClass(ParkingMeterClass parkingMeter, ParkedCarClass parkedCar,
                              PoliceOfficerClass policeOfficer) {
        super();
        this.parkingMeter  = new ParkingMeterClass(parkingMeter);
        this.parkedCar     = new ParkedCarClass(parkedCar);
        this.policeOfficer = new PoliceOfficerClass(policeOfficer);
    }

    public String getParkedCarReport(ParkedCarClass parkedCar) {
        return new ParkedCarClass(parkedCar).toString();
    }

    public String getParkingFine(ParkedCarClass parkedCar, ParkingMeterClass parkingMeter) {
        DecimalFormat formatter   = new DecimalFormat("$###,##0.00");
        int       fine        = 25;
        String        str         = "the car is not parked illegally, there is no fine";
        double        minutesOver = parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased();

        // determine if the car is illegally parked
        if (parkedCar.getNumMinutesParked() > parkingMeter.getNumMinutesPurchased()) {
            fine += 25.0;    //  fine for the first hour
        }

        if (minutesOver > 60.0) {

            //math for number of hours the car is illegally parked and multiply the result
            fine += ((minutesOver - 60.0) / 60.0) * 10.0;
        }

        if (fine > 0.0) {
            str = "Fine: " + formatter.format(fine);
        }

        return str;
    }

    public String getPoliceOfficerReport() {
        return new PoliceOfficerClass(policeOfficer).toString();
    }
}


