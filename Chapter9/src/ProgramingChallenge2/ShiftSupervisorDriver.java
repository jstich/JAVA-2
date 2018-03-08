package ProgramingChallenge2;

import java.util.Scanner;

public class ShiftSupervisorDriver {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		ShiftSupervisor p1 = new ShiftSupervisor();
		
		System.out.print("Enter the Employee Name: ");
		String name = keyboard.nextLine();
		System.out.print("Enter the employee ID: ");
		String id = keyboard.nextLine();
		System.out.print("Enter the Hire Date for "+ name +": ");
		String date = keyboard.nextLine();
		System.out.print("Enter Shift supervisor Salary: ");
		double sall = keyboard.nextDouble();
		System.out.print("Emter the supervisor's bonus: ");
		double bonus = keyboard.nextDouble();
		
		
		p1.setName(name);
		p1.setEmpNum(id);
		p1.setHireDate(date);
		p1.setSalary(sall);
		p1.setProduction(bonus);
	
		
		System.out.println("Name: " + p1.getName());
		System.out.println("Employee Id: " + p1.getEmpNum());
		System.out.println("Hire Date: " + p1.getHireDate());
		System.out.println("Salary: $" + p1.getSalary());
		System.out.println("Production bonus: $" + p1.getProduction());
		

	}

}