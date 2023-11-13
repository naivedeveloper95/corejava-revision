package anonymousinner;

public class AnonymouseRunnable {

	public static void main(String[] args) {
		final Thread t = new Thread(() -> System.out.println("Anonymous runnable impl."));

		t.start();
	}

}
