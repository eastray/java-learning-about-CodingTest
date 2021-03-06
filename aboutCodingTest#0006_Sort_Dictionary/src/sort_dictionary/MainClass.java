package sort_dictionary;

import java.util.HashMap;
import java.util.Iterator;

public class MainClass {

	static MainClass mainClass = new MainClass();

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("홍길동", 21);
		map.put("김치우", 28);
		map.put("임승호", 28);

		mainClass.sort_dictionary(map);

	}

	public void sort_dictionary(HashMap<String, Integer> map) {

		Iterator<String> iteratorKey = map.keySet().iterator();

		while (iteratorKey.hasNext()) {
			String key = iteratorKey.next();
			System.out.println(key + "," + map.get(key));
		}
	}
}
