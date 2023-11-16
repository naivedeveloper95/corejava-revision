package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LIDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("abc");
		list.add("def");
		list.add("xyz");

		ListIterator<String> iterator = list.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println();
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());

		}
	}

}
