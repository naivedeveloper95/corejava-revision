package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("john", 70);
		map.put("tom", 60);
		map.put("lee", 99);
		map.put("brad", 80);

		Set<String> keySet = map.keySet();
		System.out.println("keys : " + keySet);

		System.out.println("\n");

		Collection<Integer> values = map.values();
		System.out.println("values : " + values);

		System.out.println("\n");

		for (String key : keySet) {
			System.out.println("key : " + key + " value : " + map.get(key));
		}
	}

}
