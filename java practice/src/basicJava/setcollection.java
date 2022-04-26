package basicJava;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class setcollection {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(34);
		ll.add(22);
		ll.add(98);
		ll.add(88);
		ll.add(99);
		ll.add(78);
		System.out.println(ll);
		List<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(98);
		ll1.add(78);
		ll1.add(22);
		ll1.add(11);
		ll1.add(90);
		System.out.println(ll1);
		// ll.addAll(ll1);
		// System.out.println(ll);
		// ll.retainAll(ll1);
		ll.removeAll(ll1);
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		

	}

}
