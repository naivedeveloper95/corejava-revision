public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {

		MultiThreaded multiThreaded = new MultiThreaded();
		multiThreaded.setPriority(MAX_PRIORITY);
		multiThreaded.setName("multiThreaded");
		multiThreaded.start();

		MultiThreaded multiThreaded1 = new MultiThreaded();
		multiThreaded1.setPriority(MIN_PRIORITY);
		multiThreaded.setName("multiThreaded1");
		multiThreaded1.start();

//		for (int i = 1; i <= 200; i++) {
//			System.out.print("j : " + i + "\t");
//			Thread.sleep(1000);
//		}
	}

	public void run() {
		System.out.println("Thread name " + Thread.currentThread().getName());
//		Thread currentThread = Thread.currentThread();
//		
//		currentThread.setName("print_200_numbers");
//		System.out.println("Thread name is " + currentThread.getName());
//		for (int i = 1; i <= 200; i++) {
//			System.out.print("i : " + i + "\t");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("Child thread exiting!");
//			}
//		}
	}
}
