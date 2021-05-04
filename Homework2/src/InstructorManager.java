
public class InstructorManager extends UserManager {
	
	public void creatingCourse(Instructor instructor, Course course) {
		Course[] newCourses = new Course[instructor.getOwnCourses().length+1];
		int counter =0;
		for(int i = 0 ; i<instructor.getOwnCourses().length; i++) {
			newCourses[i] = instructor.getOwnCourses()[i];
			counter++;
		}
		newCourses[counter]=course;
		instructor.setOwnCourses(newCourses);
		System.out.println(course.getCourseName() + " isimli kurs " + instructor.getFirstName() + " taraf�ndan olu�turuldu . ");
		System.out.println(instructor.getFirstName() + " isimli e�itmenin yeni kurslar� :  \n" + newCourses);
	}
	
	public void deletingCourse(Instructor instructor, Course course) {
		System.out.println(course.getCourseName() + " isimli kurs " + instructor.getFirstName() + " taraf�ndan silindi . ");		
	}	
}
