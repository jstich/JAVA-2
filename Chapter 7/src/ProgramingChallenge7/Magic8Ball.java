package ProgramingChallenge7;

import java.util.Random;

public class Magic8Ball
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int choice = 1 + r.nextInt(12);
		String response = "";

		if ( choice == 1 )
			response = "Yes, Of Course";
		else if ( choice == 2 )
			response = "You Can Count On It";
		else if ( choice == 3 )
			response = "For Sure!";
		else if ( choice == 4 )
			response = "Ask Me Later";
		else if ( choice == 5 )
			response = "Im not sure";
		else if ( choice == 6 )
			response = "I cant Tell you right now";
		else if ( choice == 7 )
			response = "Ill tell you after my nap";
		else if ( choice == 8 )
			response = "No Way!";
		else if ( choice == 9 )
			response = "I dont think so";
		else if ( choice == 10 )
			response = "Without a dought no";
		else if ( choice == 11 )
			response = "the answer is clearly no";
		else if ( choice == 12 )
			response = "Ask again later";
		
		else 
			response = "8-BALL ERROR!";

		System.out.println( "MAGIC 8-BALL SAYS: " + response );
	}
}