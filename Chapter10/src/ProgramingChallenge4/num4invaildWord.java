package ProgramingChallenge4;


@SuppressWarnings("serial")
public class num4invaildWord extends Exception{

	public num4invaildWord(String word) {
		System.out.println("Error: "+word+ " was incorect");
	}

}