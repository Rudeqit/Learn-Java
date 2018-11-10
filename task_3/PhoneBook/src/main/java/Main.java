import phoneBook.*;

public class Main {
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();

		phoneBook.addFz("Billy Herrington", "8 800");
		phoneBook.addFz("Van Darkholme", "555");
		phoneBook.addFz("Ricardo Milos", "35 35");

		phoneBook.addUr("Deep dark fantasy", "22", 8);
		phoneBook.addUr("Devil's plaything", "13", 37);
		phoneBook.addUr("Opa Zigotha", "15", 05);

		phoneBook.printAll();
	}
}