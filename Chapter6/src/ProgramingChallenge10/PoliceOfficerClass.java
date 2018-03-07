package ProgramingChallenge10;

public class PoliceOfficerClass {
    private String             name;             // Officers Name
    private int                badgeNum;         // Officer's badge number
    private ParkedCarClass     parkedCar;        // Parked car object
    private ParkingMeterClass  parkingMeter;     // parking meter object
    private ParkingTicketClass parkingTicket;    // parking ticket object

 
    public PoliceOfficerClass() {
        this.name     = "Mike";
        this.badgeNum = 6969;
    }

    public PoliceOfficerClass(PoliceOfficerClass policeOfficer) {
        this.name     = policeOfficer.name;
        this.badgeNum = policeOfficer.badgeNum;
    }

    public PoliceOfficerClass(String string, int i) {

       
    }

    public PoliceOfficerClass(PoliceOfficerClass policeOfficer, ParkedCarClass parkedCar,
                              ParkingMeterClass parkingMeter, ParkingTicketClass parkingTicket) {
        this.parkedCar     = new ParkedCarClass(parkedCar);
        this.parkingMeter  = new ParkingMeterClass(parkingMeter);
        this.parkingTicket = new ParkingTicketClass(parkingTicket);
        this.name          = policeOfficer.name;
        this.badgeNum      = policeOfficer.badgeNum;
    }

    public PoliceOfficerClass(String name, int badgeNum, ParkedCarClass parkedCar, ParkingMeterClass parkingMeter) {
        this.name         = name;
        this.badgeNum     = badgeNum;
        this.parkedCar    = new ParkedCarClass(parkedCar);
        this.parkingMeter = new ParkingMeterClass(parkingMeter);
    }

    public void PoliceOfficerClass1(String name, int badgeNum) {
        this.name     = name;
        this.badgeNum = badgeNum;
    }

    public void examineCar() {
        if ((parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased()) > 0) {
            issueParkingTicket();
        }
    }

    public void issueParkingTicket() {
        System.out.println("Parking Ticket" + "\n******************\n" + "Car info: " + "\n"
                           + parkingTicket.getParkedCarReport(parkedCar) + "Police Officer Info:" + "\n"
                           + parkingTicket.getPoliceOfficerReport() + "Fine" + parkingTicket.getParkingFine(parkedCar,
                                                                                                            parkingMeter));
    }

    @Override
    public String toString() {
        String str;

        str = "Officer Name: Lyle " + this.name + "\n" + "Badge Number:1234 " + this.badgeNum +  "\n";

        return str;
    }

    public int getBadgeNum() {
        return badgeNum;
    }

    public void setBadgeNum(int badgeNum) {
        this.badgeNum = badgeNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkedCarClass getParkedCar() {
        return new ParkedCarClass(parkedCar);
    }

    public void setParkedCar(ParkedCarClass parkedCar) {
        this.parkedCar = new ParkedCarClass(parkedCar);
    }

    public ParkingMeterClass getParkingMeter() {
        return new ParkingMeterClass(parkingMeter);
    }

    public void setParkingMeter(ParkingMeterClass parkingMeter) {
        this.parkingMeter = new ParkingMeterClass(parkingMeter);
    }

    public ParkingTicketClass getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicketClass parkingTicket) {
        this.parkingTicket = parkingTicket;
    }
}



