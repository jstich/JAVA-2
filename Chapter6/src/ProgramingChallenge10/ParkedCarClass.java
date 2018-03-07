package ProgramingChallenge10;

public class ParkedCarClass {
    private String make,                // make of the vechile
                   model,               // make of the model
                   LicenseNum;
    private double numMinutesParked;    // number of minutes the car has been parked

    public ParkedCarClass() {
        this.make             = "";
        this.model            = "";
        this.LicenseNum       = "";
        this.numMinutesParked = 0.0;
    }

    public ParkedCarClass(ParkedCarClass object2) {
        this.make             = object2.make;
        this.model            = object2.model;
        this.LicenseNum       = object2.LicenseNum;
        this.numMinutesParked = object2.numMinutesParked;
    }

    public ParkedCarClass(String make, String model, String LicenseNum, double numMinutesParked) {
        super();
        this.make             = make;
        this.model            = model;
        this.LicenseNum       = LicenseNum;
        this.numMinutesParked = numMinutesParked;
    }

    @Override
    public String toString() {
        String str;

        str = "Make: " + this.make + "\n" + "Model: " + this.model + "\n" + "License Nummber: " + this.LicenseNum
              + "\n" + "Number Minutes Parked: " + this.numMinutesParked + "\n";

        return str;
    }

    public String getLicenseNum() {
        return LicenseNum;
    }

    public void setLicenseNum(String LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getNumMinutesParked() {
        return numMinutesParked;
    }

    public void setNumMinutesParked(double numMinutesParked) {
        this.numMinutesParked = numMinutesParked;
    }
}



