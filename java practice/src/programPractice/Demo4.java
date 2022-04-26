package programPractice;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 7, 5, 8, 9, 15, 10,20 };
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			myList.add(arr[i]);
		}

		Collections.sort(myList);
		myList.remove(arr.length - 1);
		myList.remove(0);
		System.out.println(myList);

		double aveg = 0;
		double sum = 0;
		for (Integer ele : myList) {
			sum = sum + ele;
			aveg = sum / myList.size();
		}
		System.out.println(sum);
		System.out.println(aveg);
	}

}
