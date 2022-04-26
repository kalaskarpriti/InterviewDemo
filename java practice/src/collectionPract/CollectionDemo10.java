package collectionPract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l = new ArrayList();
		l.add(10);
		l.add(60);
		l.add(50);

		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 5));
		Collections.sort(l, new MyCom());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 10,new MyCom()));
		

	}
}

class MyCom implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Integer i1 = (Integer) arg0;
		Integer i2 = (Integer) arg1;
		return i2.compareTo(i1);
	}

}