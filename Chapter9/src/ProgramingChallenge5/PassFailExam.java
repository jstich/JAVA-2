package ProgramingChallenge5;

import ProgramingChallenge4.GradedActivity;

public class PassFailExam extends GradedActivity {

	 private double pass;

	    public PassFailExam(double pass)
	    {
	        this.setPass(pass);
	        setScore(pass);
	    }

		public double getPass() {
			return pass;
		}

		public void setPass(double pass) {
			this.pass = pass;
		}

}