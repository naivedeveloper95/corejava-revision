package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(20));
		list.add(10); // Auto-boxing
		list.add(30);

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}

		System.out.println(list);
	}

}
