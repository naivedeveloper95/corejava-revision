import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem {

	public static void main(String[] args) {

		System.out.println("Fail Fast Approach \n");

		ArrayList<String> courses = new ArrayList<String>();

		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");

		Iterator<String> iterator = courses.iterator();

		try {
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				courses.add("Node");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("\nFail Safe Approach \n");

		CopyOnWriteArrayList<String> coursesFailSafe = new CopyOnWriteArrayList<String>();

		coursesFailSafe.add("Java");
		coursesFailSafe.add("Python");
		coursesFailSafe.add("AWS");
		coursesFailSafe.add("Docker");

		Iterator<String> iteratorFailSafe = coursesFailSafe.iterator();

		while (iteratorFailSafe.hasNext()) {
			String course = iteratorFailSafe.next();
			System.out.println(course);

			if (course.equals("Docker")) {
				coursesFailSafe.remove("Docker");
			}
		}

		System.out.println(coursesFailSafe);
	}

}
