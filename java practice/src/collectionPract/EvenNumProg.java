package collectionPract;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumProg {

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<Integer> alist1 = new ArrayList<Integer>();
		for (int i = 0; i <= 20; i++) {
			alist.add(i);
		}
		System.out.println(alist);

		Iterator<Integer> itr = alist.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();
			if (num % 2 != 0) {
				alist1.add(num);
			} else {
				itr.remove();
			}
		}
		System.out.println(alist1);
	}

}
