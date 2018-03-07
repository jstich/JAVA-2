
public class Employee {
	 private String nameField;
	 private int idNumber;
	 private String department;
	 private String position;
	 
	 public String getNameField() {
		return nameField;
	}

	public void setNameField(String nameField) {
		this.nameField = nameField;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int string) {
		this.idNumber = string;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public static char[] getPosition1() {
		return Position;
	}

	private static final char[] Position = null;

	public Employee(String string, int i, String string2, String string3) {
	}
		// TODO Auto-generated constructor stub
	
		public static void main(String[] args) {
	        
	        // create employee objects
	        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
	        Employee emp2 = new Employee("Mark Jones", 39119  , "IT", "Programmer");
	        Employee emp3 = new Employee("Joy Rodgers", 81774, "Manufacturing", "Engineer");
	
	        //  store employees
	        //Employee[] Emp = new Employee[3];
	        emp1.setNameField("Susan Meyers\t");
	        emp1.setIdNumber(47899);
	        emp1.setDepartment("\tAccounting");
	        emp1.setPosition("\tVice Prsident");
	        
	        emp2.setNameField("Mark Jones\t");
	        emp2.setIdNumber(39119);
	        emp2.setDepartment("\tIT");
	        emp2.setPosition("\t\tProgrammer");
	        
	        emp3.setNameField("Joy Rodgers\t");
	        emp3.setIdNumber(81774);
	        emp3.setDepartment("\tManufacturing");
	        emp3.setPosition("\tEngineer");
	        
	        System.out.printf("Name");
	        System.out.printf("\tIdNumber");
	        System.out.printf("\tDepartment");
	        System.out.printf("\tPosition");
	        System.out.printf( "\n-------------------------------------------------");
            System.out.println("");
            
	        // display employee records
	            System.out.printf(emp1.getNameField());
	            System.out.print(emp1.getIdNumber());
	            System.out.printf(emp1.getDepartment());
	            System.out.printf(emp1.getPosition());
	            System.out.println("");
	            
	            System.out.printf(emp2.getNameField());
	            System.out.print(emp2.getIdNumber());
	            System.out.printf(emp2.getDepartment());
	            System.out.printf(emp2.getPosition());
	            System.out.println("");
	            
	            System.out.printf(emp3.getNameField());
	            System.out.print(emp3.getIdNumber());
	            System.out.printf(emp3.getDepartment());
	            System.out.printf(emp3.getPosition());
	            System.out.println("");
	        }  
	        
		}


	

	
	


