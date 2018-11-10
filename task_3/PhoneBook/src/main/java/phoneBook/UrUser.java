package phoneBook;

public class UrUser extends User {
	private int inn;
	static private int size = 1;

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
/*
	@Override
	public String toString() {
		// return super.toString + inn;
		return this.getName() + " (index = " + this.getIndex() + ")" + ": " + this.getPhoneNumber() + ", " + inn;
	}
*/
}