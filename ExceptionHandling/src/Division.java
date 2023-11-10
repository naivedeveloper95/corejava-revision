import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a, b, c;

		try {
			System.out.println("Enter 2 numbers: ");
			Scanner obj = new Scanner(System.in);

			a = obj.nextInt();
			b = obj.nextInt();

			c = a / b;

			System.out.println("Result is : " + c);
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0 exception has occurred." + e);
		} finally {
			System.out.println("Finally");
		}

		System.out.println("Some more code!");
	}
}
