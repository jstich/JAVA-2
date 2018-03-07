package ProgramingChallenge12;

public class OdomoterClass {
    private double        mileage = 0;
    private FuelGageClass useage;

    public OdomoterClass(FuelGageClass useage) {
        this.useage = useage;
    }

    public double getAddMile() {
        if (mileage > 999999) {
            mileage = 0;
        } else {
            mileage++;
        }

        return mileage;
    }

    public void getBurn() {
        if ((mileage % 24) == 0) {
            double total;

            total = useage.getFuel() - 1;
            useage.setFuel(total);
        }
    }

    public double getMileage() {
        return mileage;
    }
}



