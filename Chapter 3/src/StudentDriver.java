
public class StudentDriver {

	public static void main(String[] args) {
		
		//Instantiate a student object
		Student s1 = new Student();
		
		//call the mutator
		s1.setId(5);
		
		//call the accessor
		s1.setId(404);
		s1.setName("Justin");
		s1.setGpa(4.2);
		
		//call the mutator
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getGpa());

	}

	

}
