package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new StringComparator());

		set.add("abcxyz");
		set.add("xyzabcde");
		set.add("defzzzzzzzz");
		set.add("mno");

		for (String string : set) {
			System.out.println(string);
		}
	}

}
