
public class Student {
	
	
	//Instance Field with a Private access modifier
	private int studentId;
	private String studentName;
	private double studentGpa;
	
	//Mutator Method or aka"setter"
	public void setId(int id)
	{
		studentId = id;
	}
	
	//Accessor method aka "getter"
	public int getId(){
		return studentId;
	}
	
	//Mutator
	public void setName(String name)
	{
		studentName = name;
	}
	
	
	public String getName(){
		 return studentName;
	}
	
	public void setGpa(double gpa)
	{
		if (gpa > 4.0)
		{
			studentGpa = 0.0;
		}
	}
	
	public double getGpa()
	{
		return studentGpa;
	}
	
	

}
