package week3;

public class StudentManager extends UserManager {
	public void disPlay(Student student) {

		String disPlayFirstName = student.getFirstName();
		String disPlayLastName = student.getLastName();
		String disPlayGivenCourse = student.givenCourse;
		System.out.println("öðrenci ismi : " + disPlayFirstName);
		System.out.println("öðrenci Soyismi : " + disPlayLastName);
		System.out.println("öðrencinin aldýðý kurs : " + disPlayGivenCourse);

	}
}
