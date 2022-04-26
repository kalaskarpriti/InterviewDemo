package arraydemo;

import java.util.Arrays;

//sort array

public class PeakElementArrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 11, 4, 5, 6, 4, 13 };
		int max = 0;

		for (int j = 0; j < arr.length; j++) {
			for (int i = j; i < arr.length - 1; i++) {
				if (arr[j] < arr[i + 1]) {
					max = arr[i + 1];
					arr[i + 1] = arr[j];
					arr[j] = max;

				}
			}
		}
		System.out.println(max);
		System.out.println(Arrays.toString(arr));
		System.out.println("Max number from Array is = " + arr[0]);
		System.out.println("2nd Largest number from Array is = " + arr[1]);

	}

}
