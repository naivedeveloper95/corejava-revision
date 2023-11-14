import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		System.out.println("Enter numbers to calculate sum");
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			sum += number;
		}
		System.out.println("\nSum is : " + sum);
	}

}
