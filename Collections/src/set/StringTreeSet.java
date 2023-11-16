package set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();

		set.add("abc");
		set.add("xyz");
		set.add("def");
		set.add("mno");

		for (String string : set) {
			System.out.println(string);
		}
	}

}
