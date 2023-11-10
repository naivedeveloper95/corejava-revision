package threadgroups;

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup tg = new ThreadGroup("MyThreadGroup");

		CustomThread ct1 = new CustomThread(tg, "ct1");
		CustomThread ct2 = new CustomThread(tg, "ct2");
		CustomThread ct3 = new CustomThread(tg, "ct3");

		ct1.start();
		ct2.start();
		ct3.start();

		System.out.println(tg.activeCount());

		tg.list();

		Thread.sleep(5000);
		
		System.out.println(tg.activeCount());
		tg.list();
	}

}
