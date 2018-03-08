package ProgramingChallenge5;

import ProgramingChallenge4.Essay;

public class CourseGradesDriver {

	public static void main(String[] args) {
		LabActivity labActivity = new LabActivity(86.90);
        PassFailExam passFailExam = new PassFailExam(78.50);
        Essay essay = new Essay(30,20,20,30);
        FinalExam finalExam = new FinalExam(95.12);
        CourseGrades courseGrades = new CourseGrades(labActivity,passFailExam,essay,finalExam);

        System.out.print(courseGrades);
	}

}