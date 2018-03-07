package ProgramingChallenge9;

import java.util.Scanner;

public class CircleDriver {


public static void main(String[] args) {
	
	
	//Circle c1 = new Circle();

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Ask user to input circle radius
    System.out.print("Enter the radius of a circle: ");
    double radius = keyboard.nextDouble();

  

    // Create a Circle object passing in user input
    Circle circle = new Circle(radius);
   // Circle circle = circleClass.new Circle(radius);

    // Display circle information
    System.out.println("Area is " + circle.getArea());
    System.out.println("Diameter is " + circle.getDiameter());
    System.out.println("Circumference is " + circle.getCircumference());

    
    // close keyboard
    keyboard.close();
}
}