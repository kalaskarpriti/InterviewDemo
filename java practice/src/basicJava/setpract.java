package basicJava;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setpract {

	public static void main(String[] args) {

		Set<Integer> ss = new LinkedHashSet<Integer>();
		ss.add(98);
		ss.add(98);
		ss.add(99);
		ss.add(87);
		ss.add(65);
		ss.add(null);
		ss.add(null);

		System.out.println(ss);

	}

}
