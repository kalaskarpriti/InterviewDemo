package collectionPract;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DuplicateList {

	public static void main(String[] args) {

		// Remove duplicate from array list
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Hi");
		aList.add("Bye");
		aList.add("Hi");
		aList.add("Bye");
		aList.add("Test");

		System.out.println(aList);

		LinkedHashSet lList = new LinkedHashSet(aList);
		TreeSet lList1 = new TreeSet(aList);
		System.out.println(lList);
		System.out.println(lList1);

		// Remove duplicate from string
		ArrayList aList2 = new ArrayList();
		String s = "pritiismyname";
		for (char c : s.toCharArray()) {
			aList2.add(c);
		}
		LinkedHashSet lList3 = new LinkedHashSet(aList2);
		System.out.println(lList3.toString().replaceAll("[,\\[\\]]", ""));
	}

}
