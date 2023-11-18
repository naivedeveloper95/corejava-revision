package navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(50);

		System.out.println(treeSet.ceiling(20));
		System.out.println(treeSet.higher(40));
		System.out.println(treeSet.floor(10));
		System.out.println(treeSet.lower(30));
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		System.out.println(treeSet.descendingSet());
	}

}
