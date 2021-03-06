package ProgramingChallenge9;

import java.util.Scanner;

public class GradeBookModification {
    private final int    StudentNumber = 5;
    private String[]     name          = new String[StudentNumber];
    private char[]       letter        = new char[StudentNumber];
    private double[]     AVG           = new double[StudentNumber];
    private double[]     student1      = new double[4];
    private double[]     student2      = new double[4];
    private double[]     student3      = new double[4];
    private double[]     student4      = new double[4];
    private double[]     student5      = new double[4];
    private int          count         = 0;
    private final double testNum       = 3.0;
    Scanner              keyboard      = new Scanner(System.in);

    public GradeBookModification() {

        // TODO Auto-generated constructor stub
    }

    public double[] getAVG() {
        return AVG;
    }

    public void setAVG(double aVG) {
        double avg = aVG / testNum;

        AVG[count] = avg;
        setLetter(avg);
    }

    public void getCount() {
        count++;
    }

    public char[] getLetter() {
        return letter;
    }

    public void setLetter(double avg) {
        if (avg <= 59) {
            this.letter[count] = 'F';
        } else if (avg <= 69) {
            this.letter[count] = 'D';
        } else if (avg <= 79) {
            this.letter[count] = 'C';
        } else if (avg <= 89) {
            this.letter[count] = 'C';
        } else {
            this.letter[count] = 'A';
        }
    }

    public String[] getName() {
        return name;
    }

    public void setName(String name) {
        this.name[count] = name;
    }

    public double[] getStudent1() {
        return student1;
    }

    public void setStudent1() {
        double total = 0;
        double low   = 101;

        for (int x = 0; x < 4; x++) {
            System.out.println("Enter test " + (x + 1) + ": ");

            double test = keyboard.nextDouble();

            while ((test <= 0) || (test > 100)) {
                System.out.println("Invalid Data Re-Enter test " + (x + 1) + ": ");
                test = keyboard.nextDouble();
            }

            this.student1[x] = test;
            total            += test;

            if (test < low) {
                low = test;
            }
        }

        total -= low;
        setAVG(total);
    }

    public double[] getStudent2() {
        return student2;
    }

    public void setStudent2() {
        double total = 0;
        double low   = 101;

        for (int x = 0; x < 4; x++) {
            System.out.println("Enter test " + (x + 1) + ": ");

            double test = keyboard.nextDouble();

            while ((test <= 0) || (test > 100)) {
                System.out.println("Invalid Data Re-Enter test " + (x + 1) + ": ");
                test = keyboard.nextDouble();
            }

            this.student2[x] = test;
            total            += test;

            if (test < low) {
                low = test;
            }
        }

        total -= low;
        setAVG(total);
    }

    public double[] getStudent3() {
        return student3;
    }

    public void setStudent3() {
        double total = 0;
        double low   = 101;

        for (int x = 0; x < 4; x++) {
            System.out.println("Enter test " + (x + 1) + ": ");

            double test = keyboard.nextDouble();

            while ((test <= 0) || (test > 100)) {
                System.out.println("Invalid Data Re-Enter test " + (x + 1) + ": ");
                test = keyboard.nextDouble();
            }

            this.student3[x] = test;
            total            += test;

            if (test < low) {
                low = test;
            }
        }

        total -= low;
        setAVG(total);
    }

    public double[] getStudent4() {
        return student4;
    }

    public void setStudent4() {
        double total = 0;
        double low   = 101;

        for (int x = 0; x < 4; x++) {
            System.out.println("Enter test " + (x + 1) + ": ");

            double test = keyboard.nextDouble();

            while ((test <= 0) || (test > 100)) {
                System.out.println("Invalid Data Re-Enter test " + (x + 1) + ": ");
                test = keyboard.nextDouble();
            }

            this.student4[x] = test;
            total            += test;

            if (test < low) {
                low = test;
            }
        }

        total -= low;
        setAVG(total);
    }

    public double[] getStudent5() {
        return student5;
    }

    public void setStudent5() {
        double total = 0;
        double low   = 101;

        for (int x = 0; x < 4; x++) {
            System.out.println("Enter test " + (x + 1) + ": ");

            double test = keyboard.nextDouble();

            while ((test <= 0) || (test > 100)) {
                System.out.println("Invalid Data Re-Enter test " + (x + 1) + ": ");
                test = keyboard.nextDouble();
            }

            this.student5[x] = test;
            total            += test;

            if (test < low) {
                low = test;
            }
        }

        total -= low;
        setAVG(total);
    }

    public int getStudentNumber() {
        return StudentNumber;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
