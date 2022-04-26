package arraydemo;

import java.util.Arrays;

public class ArrayIsEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 30, 25, 45, 20 };
		int[] arr1 = { 10, 30, 25, 45, 20 };

		boolean isEqualOrNot = true;

		if (arr.length == arr1.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arr1[i]) {
					isEqualOrNot = true;
				} else {
					isEqualOrNot = false;
				}
			}
			if (isEqualOrNot == true) {
				System.out.println("Array is Equal");
			} else {
				System.out.println("Array is not Equal");
			}
		} else {
			System.out.println("Array is not equal in lenght");
		}

		// Method two.
		boolean isTrue = Arrays.equals(arr, arr1);
		if (isTrue == true) {
			System.out.println("Array is Equal");
		} else {
			System.out.println("Array is not Equal");
		}

	}

}
