package synchronization.classlock;

public class DisplayMessage {

	public void sayHello(String name) {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("How are you " + name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}
