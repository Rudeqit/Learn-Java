package phoneBook;

public class UrUser extends User {
	private int inn;
	static private int size = 1;

	public UrUser() {
		super("", ""); 	// It's for readUrFromFile()
	}

	public UrUser(String name, String phoneNumber, int inn) {
		super(name, phoneNumber);
		this.inn = inn;
		this.setIndex(size++);
	}

	public int getINN() {
		return inn;
	}

	public void setINN(int inn) {
		this.inn = inn;
	}

	public String toString() {
		return super.toString() + " \t" + inn;
	}

	public String toCSV() {
		return String.valueOf(super.getIndex()) + ";" + super.getName() + ";" + super.getPhoneNumber() + ";" + String.valueOf(this.getINN()) +'\n';
	}

	public void fromCSV(String str) {
		super.fromCSV(str);
		String[] pieces = str.split(";");
		this.inn = Integer.valueOf(pieces[3]);
	}

}