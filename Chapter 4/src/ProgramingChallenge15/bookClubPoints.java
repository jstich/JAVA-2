package ProgramingChallenge15;

public class bookClubPoints {

    /**
     * Method should return the number of points earned based on the number of
     * books purchased
     *
     * @param numberOfBooksPurchased
     * @return points earied
     */
    public static int getPointsEarned(int numberOfBooksPurchased) {
        if (numberOfBooksPurchased < 1) {
            return 0;
        } else if (numberOfBooksPurchased == 1) {
            return 5;
        } else if (numberOfBooksPurchased == 2) {
            return 15;
        } else if (numberOfBooksPurchased == 3) {
            return 30;
        } else {
            return 60;
        }
    }
}


