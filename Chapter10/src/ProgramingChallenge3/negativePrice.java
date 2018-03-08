package ProgramingChallenge3;


@SuppressWarnings("serial")
public class negativePrice extends Exception{
	public negativePrice(double price) {
		System.out.println("Error: Bad price for " + price); // message for if the price is wrong
	}
}
