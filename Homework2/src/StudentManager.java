
public class StudentManager extends UserManager{
	
	public void registeringCourse(Student student , Course course) {
		System.out.println(student.getId() + " id numaralı öğrenci " + course.getCourseName() + " kursuna kayıt oldu.");
				
	}
	
	public void leaveCourse(Student student , Course course) {
		System.out.println( student.getFirstName() + " isimli öğrenci  " + course.getCourseName() + " isimli kurstan ayrıldı." );		
	}
	
	
}
