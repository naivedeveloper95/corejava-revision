package synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		
		MyThread mt = new MyThread(dm, "Steve");
		MyThread mt1 = new MyThread(dm, "Mark");
		
		mt.start();
		mt1.start();
	}
}
