package ProgramingChallenge5;

import ProgramingChallenge4.Essay;
import ProgramingChallenge4.GradedActivity;

public class CourseGrades extends GradedActivity implements Analyzable {
    GradedActivity[] grades = new GradedActivity[4];

    CourseGrades() {}

    public CourseGrades(LabActivity labActivity, PassFailExam passFailExam, Essay essay, FinalExam finalExam) {
        this.setLab(labActivity);
        this.setPassFailExam(passFailExam);
        this.setEssay(essay);
        this.setFinalExam(finalExam);
    }

    @Override
    public String toString() {
        return "Lab Activity: " + grades[0].getGrade() + " (" + grades[0].getScore() + ")" + "\nPass Fail Exam: "
               + grades[1].getGrade() + " (" + grades[1].getScore() + ")" + "\nEssay: " + grades[2].getGrade() + " ("
               + grades[2].getScore() + ")" + "\nFinal Exam: " + grades[3].getGrade() + " (" + grades[3].getScore()
               + ")" + "\nAverage: " + String.format("%,.2f%%",
                                                     getAverage()) + "\nHighest Value: " + getHighest().getScore()
                                                                   + "\nLowest Value: " + getLowest().getScore();
    }

    public double getAverage() {
        double avg = 0;

        for (int i = 0; i < grades.length; i++) {
            avg += grades[i].getScore();
        }

        avg = avg / grades.length;

        return avg;
    }

    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public GradedActivity getHighest() {
        double high   = grades[0].getScore();
        int    holder = -1;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getScore() > high) {
                high   = grades[i].getScore();
                holder = i;
            }
        }

        return grades[holder];
    }

    public void setLab(LabActivity labActivity) {
        grades[0] = labActivity;
    }

    @Override
    public GradedActivity getLowest() {
        double low    = grades[0].getScore();
        int    holder = -1;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getScore() < low) {
                low    = grades[i].getScore();
                holder = i;
            }
        }

        return grades[holder];
    }

    public void setPassFailExam(PassFailExam passFailExam) {
        grades[1] = passFailExam;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
