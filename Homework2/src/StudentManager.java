
public class StudentManager extends UserManager{
	
	public void registeringCourse(Student student , Course course) {
		System.out.println(student.getId() + " id numaral� ��renci " + course.getCourseName() + " kursuna kay�t oldu.");
				
	}
	
	public void leaveCourse(Student student , Course course) {
		System.out.println( student.getFirstName() + " isimli ��renci  " + course.getCourseName() + " isimli kurstan ayr�ld�." );		
	}
	
	
}
