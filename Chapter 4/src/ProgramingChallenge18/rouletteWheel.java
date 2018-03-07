package ProgramingChallenge18;

public class rouletteWheel
{
	// instance variable
	private int pocketNumber;
	
	// constructor accepts a pocket number and assigns it to the instance variable
	public rouletteWheel(int number)
	{
		pocketNumber = number;
	}
	
	// getPocketColor method finds and returns the pocket's color as a string
	public String getPocketColor()
	{
		String pocketColor = "";
		
		if(pocketNumber == 0)
		{
			pocketColor = "green";	
		}
		else if((pocketNumber >= 1 && pocketNumber <= 10) || (pocketNumber >= 19 && pocketNumber <= 28))
		{
			if(pocketNumber % 2 == 0)
				pocketColor = "black";
			else
				pocketColor = "red";
		}
		else if((pocketNumber >= 11 && pocketNumber <= 18) || (pocketNumber >= 29 && pocketNumber <= 36))
		{
			if(pocketNumber % 2 == 0)
				pocketColor = "red";
			else
				pocketColor = "black";
		}
		else
		{
			pocketColor = "Error - Invalid pocket's color!";
		}
		
		return pocketColor;
	}
} 