package ProgramingChallenge5;

import ProgramingChallenge4.GradedActivity;

public class LabActivity extends GradedActivity {

	private double lab;

    public LabActivity(double lab)
    {
        this.setLab(lab);
        setScore(lab);
    }

	public double getLab() {
		return lab;
	}

	public void setLab(double lab) {
		this.lab = lab;
	}

}