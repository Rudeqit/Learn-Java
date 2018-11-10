import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestCollection {
	public static void TestArr() {
		long st, et;
		ArrayList<String> arr = new ArrayList<String>();

        st = System.nanoTime();
        arr.add("0");
        et = System.nanoTime();

		System.out.println("Add time to ArrayList: " + (et - st) + " ns");

		st = System.nanoTime();
        arr.remove(0);
        et = System.nanoTime();

		System.out.println("Remove time to ArrayList: " + (et - st) + " ns");
	}

	public static void TestList() {
		long st, et;
		LinkedList<String> list = new LinkedList<String>();

        st = System.nanoTime();
        list.add("0");
        et = System.nanoTime();

		System.out.println("Add time to LinkedList: " + (et - st) + " ns");

		st = System.nanoTime();
        list.remove(0);
        et = System.nanoTime();

		System.out.println("Remove time to LinkedList: " + (et - st) + " ns");
	}

	public static void TestTree() {
		long st, et;
		TreeSet<String> tree = new TreeSet<String>();

        st = System.nanoTime();
        tree.add("0");
        et = System.nanoTime();

		System.out.println("Add time to TreeSet: " + (et - st) + " ns");

		st = System.nanoTime();
        tree.remove("0");
        et = System.nanoTime();

		System.out.println("Remove time to TreeSet: " + (et - st) + " ns");
	}


	public static void main(String[] args) {
		TestArr();
		TestList();
		TestTree();
	}
}