import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread {

	static CopyOnWriteArrayList<String> coursesFailSafe = new CopyOnWriteArrayList<String>();

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

		ArrayListProblem arrayListProblem = new ArrayListProblem();
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
