package ProgramingChallenge11;

public class PatientDriver {

	public static void main(String[] args) {
       
		PatientClass patient1 = new PatientClass("Jacob", "Thomas", "Stich", "123 Elm St.", "St. Louis", "Missouri", "63129", "(314) 488-3709", "Tammy", "(314) 487-9174");
	    System.out.println("PATIENT INFORMATION");
	    System.out.println("First name: " + patient1.getFirstName());
	    System.out.println("Middle name: " + patient1.getMiddleName());
	    System.out.println("Last name: " + patient1.getLastName());
	    System.out.println("Address: " + patient1.getAddress() + " " + patient1.getCity() + ", " + patient1.getState() + " " + patient1.getZip());
	    System.out.println("Phone number: " + patient1.getPhoneNumber());
	    System.out.println("Emergency contact name: " + patient1.getEmergencyName());
	    System.out.println("Emergency contact phone: " + patient1.getEmergencyContact());
	    System.out.println();
	    
	    //Procedure objects, using information in the instructions
	    Procedure pr1 = new Procedure("Physical Exam", "1/22/2018", "Dr. Irvine", 250.0);
	    System.out.println("PROCEDURE #1 INFORMATION");
	    System.out.println("Name: " + pr1.getNameOfProcedure());
	    System.out.println("Date: " + pr1.getDateOfProcedure());
	    System.out.println("Practitioner: " + pr1.getPractionerName());
	    System.out.println("Charge: $" + pr1.getCost());
	    System.out.println();
	    
	    Procedure pr2 = new Procedure("X-ray", "1/22/2018", "Dr. Jamison", 500.0);
	    System.out.println("PROCEDURE #2 INFORMATION");
	    System.out.println("Name: " + pr2.getNameOfProcedure());
	    System.out.println("Date: " + pr2.getDateOfProcedure());
	    System.out.println("Practitioner: " + pr2.getPractionerName());
	    System.out.println("Charge: $" + pr2.getCost());
	    System.out.println();
	    
	    Procedure pr3 = new Procedure("Blood Test", "1/22/2018", "Dr. Smith", 200.0);
	    System.out.println("PROCEDURE #3 INFORMATION");
	    System.out.println("Name: " + pr3.getNameOfProcedure());
	    System.out.println("Date: " + pr3.getDateOfProcedure());
	    System.out.println("Practitioner: " + pr3.getPractionerName());
	    System.out.println("Charge: $" + pr3.getCost());
	    System.out.println();
	    
	    //sum charges for all procedures and print
	    double total = pr1.getCost() + pr2.getCost() + pr3.getCost(); 
	    System.out.println("Total Charge: $" + total);
	} //end main method
	
} //end class