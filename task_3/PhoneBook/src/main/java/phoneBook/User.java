package phoneBook;

public abstract class User implements CSV {
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

	public String toString() {
		return " " + String.valueOf(this.index) + ": " + this.name + " \t" + this.phoneNumber;
	}

	public String toCSV() {
		return String.valueOf(this.index) + ";" + this.name + ";" + this.phoneNumber + '\n';
	}

	public void fromCSV(String str) {
		String[] pieces = str.split(";");

		this.index = Integer.valueOf(pieces[0]);
		this.name = pieces[1];
		this.phoneNumber = pieces[2];
	}
}