package programPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo14 {

	public static void main(String[] args) {
		Set a = new LinkedHashSet();
		a.add(1);
		a.add(1);
		System.out.println(a);

		HashMap m = new HashMap();
		m.put(1, "String");
		m.put(2, "boolean");
		m.put(3, "char");
		m.put(4, 30);
		m.put('a', 20);
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.keySet());
		Collection s2 = m.values();
		Set s1 = m.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry s = (Entry) itr.next();
			if (s.getKey().equals(4)) {
				s.setValue(50);
			}
		}
		System.out.println(m);
	}
}
