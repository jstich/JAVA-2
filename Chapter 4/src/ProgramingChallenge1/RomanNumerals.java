package ProgramingChallenge1;

public class RomanNumerals {
    public int number;

    public void getNumber() {
        switch (number) {
        case 1 :
            System.out.println("Roman Numeral for 1 is: I");

            break;

        case 2 :
            System.out.println("Roman Numeral for 2 is: II");

            break;

        case 3 :
            System.out.println("Roman Numeral for 3 is: III");

            break;

        case 4 :
            System.out.println("Roman Numeral for 4 is: IV");

            break;

        case 5 :
            System.out.println("Roman Numeral for 5 is: V");

            break;

        case 6 :
            System.out.println("Roman Numeral for 6 is: VI");

            break;

        case 7 :
            System.out.println("Roman Numeral for 7 is: VII");

            break;

        case 8 :
            System.out.println("Roman Numeral for 8 is: VIII");

            break;

        case 9 :
            System.out.println("Roman Numeral for 9 is: IX");

            break;

        case 10 :
            System.out.println("Roman Numeral for 10 is: X");

            break;

        default :
            System.out.println("Please try a Number between 1 - 10!");
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

