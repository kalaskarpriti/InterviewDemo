package collectionPract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array list
		/*
		 * Fetaure: arraylist allowed duplicates, it preserve order of insertion, null
		 * values are allowed implements serializable, clonable,random acess interface,
		 * initial capacity is 10 and new capacity is (cc*3/2)+1
		 */

		ArrayList<Comparable> a2 = new ArrayList<Comparable>(100);
		a2.add(0, "hi");
		a2.add("1");
		a2.add(3);
		a2.add("I am software");
		System.out.println(a2.size());

		ArrayList<Comparable> al = new ArrayList<Comparable>();
		al.add(10);
		al.add(15);
		al.add("Hi");
		al.add(10);
		al.add(2, "Hello");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.addAll(1, a2);
		System.out.println(al);
		System.out.println(al.contains("H"));
		System.out.println(al.containsAll(a2));
		al.retainAll(a2);
		System.out.println(al);

		Vector<Comparable> v = new Vector<Comparable>();
		v.addElement("A");
		v.addElement(10);
		ArrayList<Comparable> a3 = new ArrayList<Comparable>(v);
		a3.add("arraylist");
		a3.add(1, "Demo");
		System.out.println(a3);

		int[] arr = { 2, 3, 11, 4, 5, 6, 4, 13 };
		List myset = new LinkedList();
		for (int i = 0; i < arr.length; i++) {
			myset.add(arr[i]);

		}
		Collections.sort(myset);
		System.out.println(myset);
		System.out.println(myset.get(arr.length-2));

	}

}
