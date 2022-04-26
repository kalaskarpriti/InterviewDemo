package collectionPract;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> t = new TreeSet<String>(new customcomp());
		t.add("Hi");
		t.add("Bye");
		t.add("say");
		t.add("Done");
		t.add("IPs");
		t.add("Date");
	    System.out.println(t);
	    
		TreeSet t1 = new TreeSet(new mycompare());
		t1.add(10);
		t1.add(25);
		t1.add(35);
		t1.add(77);
		t1.add(10);
		t1.add(32);
		System.out.println(t1);
		
   }
}
class customcomp implements Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		String str = (String) arg0;
		String str1 = (String) arg1;
		return -str.compareTo(str1);
	}
}

class mycompare implements Comparator {
	@Override
	public int compare(Object abj1, Object abj2) {
		Integer itr1 = (Integer) abj1;
		Integer itr2 = (Integer) abj2;
		if (itr1 > itr2)
			return -1;
		else if (itr1 < itr2) {
			return +1;
		} else
			return 0;
	}
}
