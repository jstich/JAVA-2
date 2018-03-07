package ProgramingChallenge8;
import java.util.Scanner;

public class runningTheRaceDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		runningTheRace p1 = new runningTheRace();
		
		System.out.print("Enter a Name for runner 1: ");
		p1.setRunner1(keyboard.next());
		System.out.printf("Enter the time for %s: ", p1.getRunner1());
		p1.setTime1(keyboard.nextDouble());
		
		System.out.print("Enter a Name for runner 2: ");
		p1.setRunner2(keyboard.next());
		System.out.printf("Enter the time for %s: ", p1.getRunner2());
		p1.setTime2(keyboard.nextDouble());
		
		System.out.print("Enter a Name for runner 3: ");
		p1.setRunner3(keyboard.next());
		System.out.printf("Enter the time for %s: ", p1.getRunner3());
		p1.setTime3(keyboard.nextDouble());
		
		
		System.out.println(p1.getOrder());
		keyboard.close();

	}

}
