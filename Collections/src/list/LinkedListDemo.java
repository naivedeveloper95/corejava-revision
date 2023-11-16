package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		Object objects[] = new Object[1000000];

		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}

		List<Object> arrayList = new ArrayList<>();

		long start = System.currentTimeMillis();
		for (Object object : objects) {
			arrayList.add(object);
		}

		long end = System.currentTimeMillis();
		System.out.println("Time Taken for ArrayList: \t" + (end - start));

		List<Object> linkedList = new LinkedList<>();

		start = System.currentTimeMillis();
		for (Object object : objects) {
			linkedList.add(object);
		}

		end = System.currentTimeMillis();
		System.out.println("Time Taken for LinkedList: \t" + (end - start));

	}

}
