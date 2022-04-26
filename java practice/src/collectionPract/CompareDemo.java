package collectionPract;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class CompareDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(100);
		list.add(34);
		list.add(54);
		System.out.println(list);

		TreeSet sett = new TreeSet(list);
		System.out.println(sett);
		
		TreeSet<Integer> sett1 = new TreeSet<Integer>(new Test());
		sett1.add(1);
		sett1.add(100);
		sett1.add(34);
		sett1.add(54);
		System.out.println(sett1);

	}

}

class Test implements Comparator<Object> {

	@Override
	public int compare(Object num1, Object num2) {
		Integer value1 = (Integer) num1;
		Integer value2 = (Integer) num2;
		return -value1.compareTo(value2);
	}

}
