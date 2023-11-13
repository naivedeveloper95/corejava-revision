import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		final String s = "You are the creator of your destiny";

		final StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
