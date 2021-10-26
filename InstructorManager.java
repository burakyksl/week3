package week3;

public class InstructorManager extends UserManager {
	
	public void disPlay(Instructor instructor) {
		
		String disPlayFirstName = instructor.getFirstName();
		String disPlayLastName = instructor.getLastName();
		String disPlayGivenCourse = instructor.givenCourse;
		System.out.println("eðitmen ismi : " + disPlayFirstName);
		System.out.println("eðitmen Soyismi : " + disPlayLastName);
		System.out.println("eðitmenin verdiði kurs : " + disPlayGivenCourse);
		
	}

}
