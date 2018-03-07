package ProgramingChallenge6;

public class shippingCharge {

    // instance variable
    private double weight;
    private int    miles;

    // constructor method
    public shippingCharge(double w, int m) {
        weight = w;
        miles  = m;
    }

    // Return shipping charges
    public double getShippingCharges() {
        double charges;

        if (weight <= 2.0) {
            charges = (1.10 * (miles / 500));
        } else if ((weight > 2.0) && (weight <= 6.0)) {
            charges = (2.20 * (miles / 500));
        } else if ((weight > 6.0) && (weight <= 10.0)) {
            charges = (3.70 * (miles / 500));
        } else {
            charges = (4.80 * (miles / 500));
        }

        return charges;
    }
}


