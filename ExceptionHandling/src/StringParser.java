
public class StringParser {

	public static void main(String[] args) {
		String s = "abcd";
		try {
			Integer i = Integer.parseInt(s);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("Exception occured during parsing " + e);
		}
		System.out.println("Some more code!");
	}

}
