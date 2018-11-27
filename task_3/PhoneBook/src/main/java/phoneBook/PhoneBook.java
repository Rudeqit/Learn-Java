package phoneBook;

import java.util.ArrayList;
import java.io.*;

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
			// System.out.println(fzUser.toString());	\\ It's not work sad() 
			System.out.printf(" %d: %s \t%s\n", fzUser.getIndex(), fzUser.getName(), fzUser.getPhoneNumber());

		System.out.println("\nUrUser: ");
		System.out.println("(#, Name, Phone number, INN)");

		for (UrUser urUser : this.urUser)
			// System.out.println(urUser.toString());
			System.out.printf(" %d: %s \t%s \t%d\n", urUser.getIndex(), urUser.getName(), urUser.getPhoneNumber(), urUser.getINN());
	}

	public void writeFzInFile(String fileName) {
		try(FileWriter fw = new FileWriter(fileName, false)) {
			for (FzUser fz : this.fzUser) {
				String str = fz.toCSV();
				fw.write(str);
			}
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}
	}

	public void readFzFromFile(String fileName) {
		try {
			FileInputStream fr = new FileInputStream(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(fr));
			String str;

			while ((str = br.readLine()) != null) {
				FzUser fz = new FzUser();
				fz.fromCSV(str);
				this.fzUser.add(fz);
			}
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}
	}

	public void writeUrInFile(String fileName) {
		try(FileWriter fw = new FileWriter(fileName, false)) {
			for (UrUser ur : this.urUser) {
				String str = ur.toCSV();
				fw.write(str);
			}
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}
	}

	public void readUrFromFile(String fileName) {
		try {
			FileInputStream fr = new FileInputStream(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(fr));
			String str;

			while ((str = br.readLine()) != null) {
				UrUser ur = new UrUser();
				ur.fromCSV(str);
				this.urUser.add(ur);
			}
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}
	}

}