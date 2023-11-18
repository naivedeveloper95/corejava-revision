package maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("John", 70);
		map.put("Tom", 60);
		map.put("Lee", 99);
		map.put("Brad", 80);

		Set<String> keySet = map.keySet();
		System.out.println("Keys:" + keySet);

		System.out.println("\n");

		Collection<Integer> values = map.values();
		System.out.println("Values:" + values);

		System.out.println("\n");

		for (String key : keySet) {
			System.out.println("Key:" + key + " Value:" + map.get(key));
		}

	}

}
