import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentHashMapDemo extends Thread {

//	static HashSet<String> coursesFailSafe = new HashSet<String>();
	static CopyOnWriteArraySet<String> coursesFailSafe = new CopyOnWriteArraySet<String>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coursesFailSafe.add("Kubernetes");
	}

	public static void main(String[] args) throws InterruptedException {

		ConcurrentHashMapDemo arrayListProblem = new ConcurrentHashMapDemo();
		arrayListProblem.start();

		coursesFailSafe.add("Java");
		coursesFailSafe.add("Python");
		coursesFailSafe.add("AWS");
		coursesFailSafe.add("Docker");

		Iterator<String> iteratorFailSafe = coursesFailSafe.iterator();

		while (iteratorFailSafe.hasNext()) {
			Thread.sleep(2000);
			String course = iteratorFailSafe.next();
			System.out.println(course);
		}

		System.out.println(coursesFailSafe);
	}

}
