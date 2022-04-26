package collectionPract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class PalendromeDemo {

	public static void main(String[] args) {
		String str = "madam";
		char[] charstr = str.toCharArray();
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Character> list = new ArrayList<Character>();
		for (char ele : charstr) {
			list.add(ele);
			list1.add(ele);
		}

		System.out.println(list);
		Collections.reverse(list);
		if (list1.equals(list)) {
			System.out.println("String is pallendrome");
		} else
			System.out.println("String is not pallendrome");

		LinkedList list2 = new LinkedList();
		list2.add("Hi");
		list2.add("5");
		list2.add("Bye");

		ListIterator itr2 = list2.listIterator();
		while (itr2.hasNext()) {
			String s = (String) itr2.next();
			if (s.equals("5")) {
				itr2.set("Bye");
			}
		}
		System.out.println(list2);
	}

}
