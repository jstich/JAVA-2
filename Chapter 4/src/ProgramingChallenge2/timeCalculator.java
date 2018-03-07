package ProgramingChallenge2;

public class timeCalculator {
    private int seconds;

    public void getSeconds() {
        int minutes, hours, days;
        int remainingSeconds = 0 ;
        minutes = seconds / 60;
        hours   = seconds / 3600;
        days    = seconds / 86400;
        remainingSeconds = seconds % 60;
        if (seconds < 60) {
            System.out.println("The time entered is:" + remainingSeconds + " seconds");
            
        } else if ((seconds >= 60) && (seconds < 3600)) {
            System.out.println("The time entered is:" + remainingSeconds + " seconds");
            System.out.println("The time entered is: " + minutes + " minutes");
        } else if ((seconds >= 3600) && (seconds < 86400)) {
            System.out.println("The time entered is:" + remainingSeconds + " seconds");
            System.out.println("The time entered is: " + minutes + " minutes");
            System.out.println("The time entered is " + hours + " hours");
        } else if (seconds >= 86400) {
            System.out.println("The time entered is:" + remainingSeconds + " seconds");
            System.out.println("The time entered is: " + minutes + " minutes");
            System.out.println("The time entered is " + hours + " hours");
            System.out.println("The time entered is: " + days + " days");
        }
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}



