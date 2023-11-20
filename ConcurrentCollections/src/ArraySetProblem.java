import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ArraySetProblem extends Thread {

	static ConcurrentHashMap<String, String> coursesFailSafe = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coursesFailSafe.put("Kubernetes", "4.8");
	}

	public static void main(String[] args) throws InterruptedException {

		ArraySetProblem arrayListProblem = new ArraySetProblem();
		arrayListProblem.start();

		coursesFailSafe.put("Java", "5.0");
		coursesFailSafe.put("Python", "4.8");
		coursesFailSafe.put("AWS", "4.7");
		coursesFailSafe.put("Docker", "4.7");

		Iterator<String> iteratorFailSafe = coursesFailSafe.keySet().iterator();

		while (iteratorFailSafe.hasNext()) {
			Thread.sleep(2000);
			String course = iteratorFailSafe.next();
			System.out.println(coursesFailSafe.get(course));
		}

		System.out.println(coursesFailSafe);
	}

}
