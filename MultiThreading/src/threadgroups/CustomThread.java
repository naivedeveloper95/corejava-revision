package threadgroups;

public class CustomThread extends Thread {

	public CustomThread(ThreadGroup tg, String name) {
		super(tg, name);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
