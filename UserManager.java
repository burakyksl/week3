package week3;

public class UserManager {

	String personFullName;

	public void add(User user) {

		String personFullName = user.getFirstName() + user.getLastName();
		System.out.println(personFullName + " eklendi ");

	}

	public void delete(User user) {

		personFullName = user.getFirstName() + user.getLastName();
		System.out.println(personFullName + " silindi ");

	}

	public void update(User user) {

		personFullName = user.getFirstName() + user.getLastName();
		System.out.println(personFullName + " güncellendi ");

	}

}
