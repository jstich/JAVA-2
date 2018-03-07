package ProgramingChallenge7;

public class fatGram {
    private double caloFat;
    private double fatGram;
    private double calories;
    private String fat;
    private double percent;

    public fatGram() {}

    public String getfat() {
        if (percent < 0.30) {
            fat = "The food is Low in fat";
        } else {
            fat = "";
        }

        return fat;
    }

    public double getpercent() {
        this.caloFat = fatGram * 9;
        this.percent = caloFat / calories;

        return percent;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFatGram() {
        return fatGram;
    }

    public void setFatGram(double fatGram) {
        this.fatGram = fatGram;
    }
}



