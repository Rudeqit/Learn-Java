package phoneBook;

public class FzUser extends User {
	static private int size = 1;

	public FzUser() {	
		super("", "");	// WTF?
	}

	public FzUser(String name, String phoneNumber) {
		super(name, phoneNumber);
		this.setIndex(size++);
	}
}