package week3;

public class StudentManager extends UserManager {
	public void disPlay(Student student) {

		String disPlayFirstName = student.getFirstName();
		String disPlayLastName = student.getLastName();
		String disPlayGivenCourse = student.givenCourse;
		System.out.println("��renci ismi : " + disPlayFirstName);
		System.out.println("��renci Soyismi : " + disPlayLastName);
		System.out.println("��rencinin ald��� kurs : " + disPlayGivenCourse);

	}
}
