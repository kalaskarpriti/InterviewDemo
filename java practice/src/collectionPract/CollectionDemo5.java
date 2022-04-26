package collectionPract;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionDemo5 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("Priti");
		str.add("Pooja");
		str.add("Abhi");
		;
		str.add("Anuraj");

		ListIterator itr = str.listIterator();
		while (itr.hasNext()) {
			String s = (String)itr.next();
			if (s.equals("Priti")) {
				itr.set("Kalaskar");
			} else if (s.equals("Abhi")) {
				itr.add("Abhishek");
			} else {
				itr.add("Test Add");
			}
		}
		System.out.println(str);
	}

}
