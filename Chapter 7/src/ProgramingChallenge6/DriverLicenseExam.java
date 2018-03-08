package ProgramingChallenge6;

import java.util.Arrays;

public class DriverLicenseExam {
	private String[] correctANS = {"B","D","A","A","C",
			"A","B","A","C","D",
			"B","C","D","A","D",
			"C","C","B","D","A",};
	private int totalCorrect;
	private int totalIncorrect;
	private String questionsMissed;
	

	public DriverLicenseExam(String[] student) { 
		for(int i = 0; i < correctANS.length; i++){
			if(student[i].equals(correctANS[i])){
				setTotalCorrect();
			}
			else {
				setTotalIncorrect();
				setQuestionsMissed(i, 1);
			}
		}
	}
	public boolean passed(){
		if(totalCorrect >= 15){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int getTotalCorrect() {
		return totalCorrect;
	}
	
	public void setTotalCorrect() {
		this.totalCorrect++;
	}
	
	public int getTotalIncorrect() {
		return totalIncorrect;
	}
	
	public void setTotalIncorrect() {
		this.totalIncorrect++;
	}
	
	public String getQuestionsMissed() {
		return questionsMissed;
	}
	
	public void setQuestionsMissed(int questions, int count) {
		if (count != 1){
		questionsMissed += " " + (questions + 1);
		}
		else {
			questionsMissed = " " + (questions + 1);
		}
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DriverLicenseExam other = (DriverLicenseExam) obj;
		if (!Arrays.equals(correctANS, other.correctANS))
			return false;
		return true;
	}
	

}