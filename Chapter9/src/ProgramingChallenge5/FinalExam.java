package ProgramingChallenge5;

import ProgramingChallenge4.GradedActivity;

public class FinalExam extends GradedActivity {

	private double examF;

    public FinalExam(double examF)
    {
        this.setExamF(examF);
        setScore(examF);
    }

	public double getExamF() {
		return examF;
	}

	public void setExamF(double examF) {
		this.examF = examF;
	}

}