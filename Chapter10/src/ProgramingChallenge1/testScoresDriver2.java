package ProgramingChallenge1;

import java.util.Scanner;

import ProgramingChallenge2.num2InvalidTestScore;

public class testScoresDriver2 {

	public static void main(String[] args) {
		int scoresNum ;
			 
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter amount numer of test scores");
			 scoresNum = keyboard.nextInt();
			 
			 int[] scores = new int[scoresNum];
			 
			 for (int j = 0; j<scoresNum; j++) {
				 
				 System.out.println("enter score");
				 scores[j] = keyboard.nextInt();
				 
			 }
			 
			 try{
				 
				TestScores j1 = new TestScores(scores, scoresNum); 
				System.out.println("the average : " + j1.calcAvg());
				 
				 
			 }
			 catch (num2InvalidTestScore j){
				 
				 System.out.println("Invalid Data");
			 }
			

		}
	}


