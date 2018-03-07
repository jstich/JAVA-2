package ProgramingChallenge6;

public class EmployeeClassModifiedDriver {

public static void main(String[] args) {
    
    // create employee objects
    EmployeeClassModified emp1 = new EmployeeClassModified("Lyle", 47899, "Developer", "Porter");
    EmployeeClassModified emp2 = new EmployeeClassModified("Steven", 39119  , "IT", "Programmer");
    EmployeeClassModified emp3 = new EmployeeClassModified("Stich", 81774, "SoftWare" , "Engineer");

    //  store employees
    System.out.println(emp1.toString());
	System.out.println(emp2.toString());
	System.out.println(emp3.toString());
    // display employee records
        
    } 
}