package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import arraysutil.MyComparator;

public class SortedList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Z");
		list.add("A");
		list.add("X");
		list.add("B");

		System.out.println("Before Sorting: " + list);
		Collections.sort(list);
		System.out.println("Sorted List: " + list);
		Collections.sort(list, new MyComparator());
		System.out.println("Sorted List - Using Comparator: " + list);
		int result = Collections.binarySearch(list, "C");
		System.out.println("Index is : " + result);
	}
}
