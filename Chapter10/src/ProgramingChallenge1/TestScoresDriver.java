package ProgramingChallenge1;

import java.util.Scanner;

import ProgramingChallenge2.num2InvalidTestScore;


public class TestScoresDriver {

	public static void main(String[] args) {

		double[] scores = {56.0, -75.0, 199.0, 78.0}; // array of scores
		num2InvalidTestScore p1 = new num2InvalidTestScore(scores); // passes the array int test scores
		
		System.out.println("Average: " + p1.calcAvg()); // prints out the avg
	}

}