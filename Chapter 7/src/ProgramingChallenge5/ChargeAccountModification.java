package ProgramingChallenge5;


public class ChargeAccountModification {
	public ChargeAccountModification() {
		// TODO Auto-generated constructor stub
	}
	public int squaetialSearch(int[] array, int value){
		int index, element;
		boolean found;
		
		index = 0;
		
		element = -1;
		found = false;
		
		while (!found && index < array.length){
			if (array[index] == value){
				found= true;
				element = index;
			}
			index++;
		}
		return element;
	}
}