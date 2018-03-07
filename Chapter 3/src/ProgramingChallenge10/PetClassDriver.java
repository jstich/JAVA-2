package ProgramingChallenge10;
import java.util.Scanner;
public class PetClassDriver {
	
	public static void main(String[] args) {

		//scanner to read input 

		Scanner keyboard= new Scanner(System.in);

		//insatiates fields 
		PetClass information = new PetClass();
		
		System.out.print("Enter pet name: ");
		
		String name = keyboard.nextLine();
		
		information.setName(name);
		
		System.out.print("Enter pet type: ");
		
		String type = keyboard.nextLine();
		
		information.setType(type);
		
		System.out.print("Enter your pet age: ");
		
		int age = keyboard.nextInt();
		
		information.setAge(age);

		//print output 
		System.out.println("Name is: " + information.getName() + "\tis a : " + information.getType() + "\t the age is: " + information.getAge());
      
		keyboard.close();
}
}
