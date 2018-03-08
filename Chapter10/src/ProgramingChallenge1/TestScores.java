package ProgramingChallenge1;

import ProgramingChallenge2.num2InvalidTestScore;


public class TestScores    {
	private double average;
	private int total;
	private int[] scores;
	
	public TestScores (int[] scores, int Number) throws  num2InvalidTestScore{ // runns through the array 
		
		this.scores = new int[Number];
		
		
		
		for(int i = 0; i < scores.length; i++){
			if(scores[i] < 0 || scores[i] > 100){ // checks to see if any are out of range
				//throw new IllegalArgumentException("The value is out of range");
				try {
					throw new num2InvalidTestScore();
				} catch (num2InvalidTestScore e) {
					System.out.println("Invalid"); // displays the message
				}
			}
			else {
				this.scores[i] = scores[i];
			}
		}
	}
	

	
	public double calcAvg(){
		double total = 0;
		double average = 0;
		
		for(int i=0; i< scores.length; i++){
			total += scores[i];
		}
		
		
		
		
		average = total / scores.length;// gets the average
		return average;
	}
}