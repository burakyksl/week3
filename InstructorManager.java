package week3;

public class InstructorManager extends UserManager {
	
	public void disPlay(Instructor instructor) {
		
		String disPlayFirstName = instructor.getFirstName();
		String disPlayLastName = instructor.getLastName();
		String disPlayGivenCourse = instructor.givenCourse;
		System.out.println("e�itmen ismi : " + disPlayFirstName);
		System.out.println("e�itmen Soyismi : " + disPlayLastName);
		System.out.println("e�itmenin verdi�i kurs : " + disPlayGivenCourse);
		
	}

}
