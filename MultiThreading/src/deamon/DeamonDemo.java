package deamon;

public class DeamonDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());

		MyThread dt = new MyThread();
		dt.setDaemon(true);

		System.out.println(dt.isDaemon());

		dt.start();
	}
}
