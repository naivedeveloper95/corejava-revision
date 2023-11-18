package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);

		map.put(id1, "Satyam");
		map.put(id2, "Suman");

		System.out.println(map + "\n");

		Map<Integer, String> idMap = new IdentityHashMap<Integer, String>();

		Integer idm1 = new Integer(10);
		Integer idm2 = new Integer(10);

		idMap.put(idm1, "Satyam");
		idMap.put(idm2, "Suman");

		System.out.println(idMap);
	}

}
