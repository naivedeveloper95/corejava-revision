package mostwanted;

public class IllegalArgumentDemo {

	public static void main(String[] args) {
		Thread thread = new Thread();

		thread.setPriority(11);
		
	}

	public int sum(int a, int b) {
		if (a == 0 || b == 0) {
			throw new IllegalArgumentException("a and b should not 0");
		}
		return b;
	}

}
