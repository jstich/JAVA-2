package ProgramingChallenge3;

@SuppressWarnings("serial")
public class negativeUnit extends Exception{
	public negativeUnit(int units) {
		System.out.println("Error: Bad number of " + units); // message if the units is wrong
	}
}
 