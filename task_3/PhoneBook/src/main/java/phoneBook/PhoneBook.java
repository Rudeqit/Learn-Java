package phoneBook;

import java.util.ArrayList;

public class PhoneBook {
	private ArrayList<FzUser> fzUser;
	private ArrayList<UrUser> urUser;

	public PhoneBook() {
		this.fzUser = new ArrayList<FzUser>();
		this.urUser = new ArrayList<UrUser>();
	}

	public void addUr(String name, String phoneNumber, int inn) {
		UrUser urUser = new UrUser(name, phoneNumber, inn);
		this.urUser.add(urUser);
	}

	public void addFz(String name, String phoneNumber) {
		FzUser fzUser = new FzUser(name, phoneNumber);
		this.fzUser.add(fzUser);
	}

	public void printAll() {
		System.out.println("FzUser: ");
		System.out.println("(#, Name, Phone number)");

		for (FzUser fzUser : this.fzUser)
			// System.out.println(fzUser.toString());
			System.out.printf(" %d: %s \t%s\n", fzUser.getIndex(), fzUser.getName(), fzUser.getPhoneNumber());

		System.out.println("\nUrUser: ");
		System.out.println("(#, Name, Phone number, INN)");

		for (UrUser urUser : this.urUser)
			// System.out.println(urUser.toString());
			System.out.printf(" %d: %s \t%s \t%d\n", urUser.getIndex(), urUser.getName(), urUser.getPhoneNumber(), urUser.getINN());
	}
}