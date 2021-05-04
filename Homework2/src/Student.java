
public class Student extends User {
	
	private Course[] registeredCourses;

	public Student(int id, String firstName, String lastName, String emailAddress, String password, Course[] registeredCourses) {		
		super(id, firstName, lastName, emailAddress, password);
		this.registeredCourses = registeredCourses;
	}

	public Course[] getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(Course[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}	
}
