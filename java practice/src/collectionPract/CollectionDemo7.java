package collectionPract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t2 = new TreeSet();
		t2.add(new StringBuffer("Hey"));
		t2.add(new StringBuffer("Xyz"));
		t2.add(new StringBuffer("priti"));
		t2.add(new StringBuffer("pooja"));
		System.out.println(t2);

		HashSet hs = new HashSet();
		hs.add('A');
		hs.add('K');
		hs.add("D");
		hs.add('y');
		hs.add('F');
		hs.add('F');
		hs.add(null);
		hs.add(null);
		System.out.println(hs); // Do not preserve insertion order

		LinkedHashSet hss = new LinkedHashSet();
		hss.add('A');
		hss.add('K');
		hss.add("D");
		hss.add('y');
		hss.add('F');
		hss.add(null);
		hss.add(null);
		hss.add('F');
		System.out.println(hss); //Preserves insertion order

	}

}
