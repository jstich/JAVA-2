package ProgramingChallenge4;


public class LargerThanN {
	public LargerThanN() {
		// TODO Auto-generated constructor stub
	}
	
	public void greaterThan(int[] array, int number){
		for(int i = 0; i < array.length; i++){
			if(array[i] > number){
				System.out.println(array[i] + " is grater than " + number );
			}
		}
	}

}