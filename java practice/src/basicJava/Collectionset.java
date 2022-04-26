package basicJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collectionset {

	public static void main(String[] args) {

		Set<String> s1 = new HashSet<String>();
		s1.add("Hi");
		s1.add("Hello");
		s1.add("Java world");
		// System.out.println(s1.isEmpty());
		s1.add("bye");
		s1.add("hey");

		Iterator<String> itr = s1.iterator();
		while (itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}

		System.out.println("----------------------------------");

		Set<String> s2 = new LinkedHashSet<String>();
		s2.add("element 1");
		s2.add("element 2");
		s2.add("element 3");
		s2.add("element 4");
		s2.add("element 5");

		Iterator<String> itr2 = s2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}
		System.out.println("----------------------------------");

		Set<String> s3 = new TreeSet<String>();
		s3.add("1");
		s3.add("2");
		s3.add("3");

		System.out.println(s3);

	}

}
