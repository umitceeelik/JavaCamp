
public class Course {
	private String courseName;
	private String instructorName;
	private int courseId;
	private double price;
	private double rating;
	
	public Course(String courseName, String instructorName, int courseId, double price) {
		super();
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.courseId = courseId;
		this.price = price;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
		
}
