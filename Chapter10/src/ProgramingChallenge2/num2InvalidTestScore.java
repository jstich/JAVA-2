package ProgramingChallenge2;


@SuppressWarnings("serial")
public class num2InvalidTestScore extends Exception{
	public num2InvalidTestScore(){
		super("Error: Bad input"); // displays the error message
	}

	public num2InvalidTestScore(double scores) {
		System.out.println("Error: Bad input for " + scores); // displays the error message
	}

}