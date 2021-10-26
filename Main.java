package week3;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(10);
		student.setFirstName("burak");
		student.setLastName("yüksel");
		student.setGivenCourse("java");
		System.out.println(student.givenCourse);

		Instructor instructor = new Instructor();
		instructor.setFirstName("engin");
		instructor.setId(20);
		instructor.setLastName("demiroğ");
		instructor.setGivenCourse("c#");
		System.out.println(instructor.getGivenCourse());

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.disPlay(instructor);

		StudentManager studentManager = new StudentManager();
		studentManager.disPlay(student);

		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		userManager.delete(student);
		userManager.delete(instructor);
		userManager.update(student);
		userManager.update(instructor);

	}

}
