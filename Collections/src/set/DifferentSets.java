package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {

		Random obj = new Random();
		HashSet<Integer> hashset = new HashSet<>();

		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			hashset.add(number);

			System.out.println(number);
		}

		System.out.println("Hashset elements " + hashset + "\n\n");

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			linkedHashSet.add(number);

			System.out.println(number);
		}

		System.out.println("Linked HashSet elements " + linkedHashSet + "\n\n");

		TreeSet<Integer> treeSet = new TreeSet<>();

		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			treeSet.add(number);

			System.out.println(number);
		}

		System.out.println("TreeSet elements " + treeSet + "\n\n");

		Iterator<Integer> iterator = treeSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}

		System.out.println(treeSet);
	}

}
