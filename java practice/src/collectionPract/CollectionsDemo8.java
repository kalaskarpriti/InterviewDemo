package collectionPract;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hs = new HashMap();
		hs.put(442, "Priti");
		hs.put(102, "Pooja");
		hs.put(103, "Abhishek");
		hs.put(107, "Anuraj");
		hs.put(1002, "Anjali");
		hs.put(108, "Ajinkya");
		hs.put(null, "ABC");
		hs.put(null, "XYZ");

		hs.replace(108, "AK");
		System.out.println(hs);
		System.out.println(hs.get(102));
		System.out.println(hs.containsKey(107));
		System.out.println(hs.containsValue("Pooja"));
		System.out.println(hs.get(442));
		System.out.println(hs.keySet());
		System.out.println(hs.values());

		Set m = hs.entrySet();
		System.out.println(m);
		Iterator itr2 = m.iterator();
		while (itr2.hasNext()) {
			Entry s = (Entry) itr2.next();
			System.out.println(s.getKey() + "..." + s.getValue());
			if (s.getValue().equals("Priti")) {
				s.setValue("Pk");
			}
		}
		System.out.println(m);
		System.out.println(hs);
		
	}

}
