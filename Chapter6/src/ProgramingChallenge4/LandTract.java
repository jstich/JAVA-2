package ProgramingChallenge4;

public class LandTract {
    private double width;
    private double length;
    private double Area;

    public LandTract() {

        // TODO Auto-generated constructor stub
    }

    public LandTract(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public boolean equals(LandTract object2) {
        boolean status;

        if (this.getArea() == object2.getArea()) {
            status = true;
        } else {
            status = false;
        }

        return status;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        LandTract other = (LandTract) obj;

        if (Double.doubleToLongBits(Area) != Double.doubleToLongBits(other.Area)) {
            return false;
        }

        return true;
    }

    public String toString() {
        String str = "The Length is " + getLength() + "\nThe Width is " + getWidth() + "\nThe Area is " + getArea()
                     + "\n";

        return str;
    }

    public double getArea() {
        double Area;

        Area = length * width;

        return Area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}



