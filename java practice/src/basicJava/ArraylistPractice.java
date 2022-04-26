package basicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr1 = new ArrayList<String>();
		String[] arr = { "firstadd", "secondadd" };
		List<String> arr2 = Arrays.asList(arr);
		arr1.add("firstadd");
		arr1.add("secondadd");
		arr1.add("thirdadd");
		arr1.add("fourthadd");
		arr1.add(1, "ss");
		System.out.println(arr1);

		arr1.retainAll(arr2);
		Collections.sort(arr1);

		for (String str : arr1) {
			System.out.println(str);
		}
		ArraylistPractice num = new ArraylistPractice();
		List<Integer> evennumber = num.evennum();
		System.out.println(evennumber);

	}

	public List<Integer> evennum() {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i <= 50; i++) {
			list.add(i);
		}

		for (int j = 0; j <= 50; j++) {
			int k = j % 2;
			if (k == 0) {
				list1.add(j);
			}
		}

		list.retainAll(list1);
		return list;

	}

}
