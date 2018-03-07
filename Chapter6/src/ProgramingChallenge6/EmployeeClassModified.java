package ProgramingChallenge6;





public class EmployeeClassModified  {
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

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
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

	public EmployeeClassModified(String nameField, int idNumber, String department, String position) {
	
		this.nameField = nameField;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
		
	
	}
	
	public EmployeeClassModified(String nameField, int idNumber1, int idNumber){
		
		this .nameField = nameField;
		this.idNumber = idNumber;
		department = "";
		position = "";
		
	}
	public EmployeeClassModified(){
		nameField = "";
		idNumber = 0;
		department = " ";
		position = "";
		
	}
	public String toString(){
		return nameField+ "\t"+ "Id num is" + "\t" + idNumber + "\t"+ "Department" + "\t" + department + "\t" +"Position is " + position + "/t"  ;
		
	}
		
	
		 
	        
		}


