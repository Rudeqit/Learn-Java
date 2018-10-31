import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input first arg: ");
		double fArg = in.nextFloat();

		System.out.print("\nInput second arg: ");
		double sArg = in.nextFloat();

		System.out.print("\nInput operand: ");
		String operand = in.next();
		System.out.println();

		double result;

		switch (operand) {
			case "+":
				result = fArg + sArg;
				System.out.println(result);
				break;
			case "-":
				result = fArg - sArg;
				System.out.println(result);
				break;
			case "*":
				result = fArg * sArg;
				System.out.println(result);
				break;
			case "/":
				if (sArg == 0) {
					System.out.println("Can't devide by zero");
					break;
				}
				result = fArg / sArg;
				System.out.println(result);
				break;
			default:
				System.out.println("Hmm, something wrong, i can't calculate it");
				break;
		}
	}
}