package phoneBook;

public abstract class User {
	private int index;
	private String name;
	private String phoneNumber;

	public User(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
/*
	public String toString() {
		return name + " (index = " + index + ")" + ": " + phoneNumber;
	}
*/
}