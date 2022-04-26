package collectionPract;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 0; i < 20; i++) {
			al.add(i);
		}
		Iterator itr = al.iterator();
		System.out.println(itr.getClass().getName());
		System.out.println("Even numbers are: ");
		while (itr.hasNext()) {
			Integer num = (Integer) itr.next();
			if (num % 2 == 0) {
			//	System.out.println(num);
			} else
				itr.remove();
		}
		System.out.println(al);
	}

}
