package interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HCL {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 4, 4, 7, -1, 5 ,1};
		// output should be pair of 2 members whoes sum is 6 and should not be duplicate
		Set myset = new LinkedHashSet();

		for (int i = 0; i < arr.length; i++) {
			myset.add(arr[i]);
		}
		System.out.println(myset);

		List mylist = new ArrayList(myset);

		for (int j = 0; j < mylist.size(); j++) {
			for (int k = j + 1; k < mylist.size(); k++) {
				Integer a = Integer.parseInt(String.valueOf(mylist.get(j)));
				Integer b = (Integer) mylist.get(k);
				if (a + b == 6) {
					System.out
							.println("pair of numbers whoes addition is 6= " + mylist.get(j) + " and " + mylist.get(k));
				}
			}

		}

	}

}
