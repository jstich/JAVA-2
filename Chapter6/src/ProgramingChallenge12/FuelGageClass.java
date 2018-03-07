package ProgramingChallenge12;

public class FuelGageClass {
    private double fuel = 0;

    public FuelGageClass() {

        // TODO Auto-generated constructor stub
    }

    public double getFillUp() {
        if (fuel < 15.00) {
            fuel++;
        }

        return fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuelLose() {
        if (fuel > 1) {
            fuel--;
        }

        return fuel;
    }
}



