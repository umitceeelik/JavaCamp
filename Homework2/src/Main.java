
public class Main {
	public static void main(String[] args) {
		
		Course course1 = new Course("Java", "Engin Demirog", 1, 0);
		Course course2 = new Course("Python", "Engin Demirog", 2, 0);
		Course course3 = new Course("C#", "Engin Demirog", 3, 14);
		Course course4 = new Course("Sql", "Engin Demirog", 4, 27);
		
		Course [] courses1 = {course1,course2,course3};
		Course [] courses2 = {course1,course3};
		
		
		Instructor instructor1 = new Instructor(101, "Engin", "Demirog", "engindemirog@gmail.com", "Java1234", courses1);
		
		Student student1 = new Student(201, "Mustafa Umit", "Celik", "umitclk2001@gmail.com", "142536", courses2);
		
		UserManager userManager = new UserManager();		
		userManager.register(student1);				
		userManager.logIn(instructor1);		
		userManager.logOut(instructor1);		
		userManager.delete(student1);		
		userManager.changePassword(student1, "yenisifre");

		InstructorManager instructorManager = new InstructorManager();		
		instructorManager.creatingCourse(instructor1, course4);
		instructorManager.deletingCourse(instructor1, course1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registeringCourse(student1, course4);
		studentManager.leaveCourse(student1, course2);

	}
}
