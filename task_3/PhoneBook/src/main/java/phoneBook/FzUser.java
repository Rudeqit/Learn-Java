package phoneBook;

public class FzUser extends User {
	static private int size = 1;

	public FzUser() {	
		super("", ""); 	// It's for readFzFromFile()
	}

	public FzUser(String name, String phoneNumber) {
		super(name, phoneNumber);
		this.setIndex(size++);
	}
}