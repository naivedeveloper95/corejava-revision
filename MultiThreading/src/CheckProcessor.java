public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Prcoessed the checks");
	}

	public static void main(String[] args) {
		CheckProcessor checkProcessor = new CheckProcessor();

		Thread thread = new Thread(checkProcessor);
		thread.start();
	}

}
