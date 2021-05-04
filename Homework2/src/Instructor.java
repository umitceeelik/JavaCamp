
public class Instructor extends User {
	
	private Course[] ownCourses;

	public Instructor(int id, String firstName, String lastName, String emailAddress, String password, Course[] ownCourses) {		
		super(id, firstName, lastName, emailAddress, password);
		this.ownCourses = ownCourses;
	}

	public Course[] getOwnCourses() {
		return ownCourses;
	}

	public void setOwnCourses(Course[] ownCourses) {
		this.ownCourses = ownCourses;
	}		
}
