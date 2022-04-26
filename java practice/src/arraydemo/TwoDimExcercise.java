package arraydemo;

import java.util.Arrays;

public class TwoDimExcercise {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30 }, { 40, 70, 55, 34 } };
		System.out.println(arr.length);
		System.out.println(Arrays.deepToString(arr));
		// System.out.println(Arrays.deepToString(arr).replace("],",
		// "]\n").replace("[[", "[").replace("]]", "]"));

		for (int a : arr[0]) {
			System.out.println(a);
		}
		for (int a : arr[1]) {
			System.out.println(a);
		}
		int total = 0;
		for (int[] a : arr) {
			for (int y : a) {
				total = total + y;
			}
		}
		System.out.println(total);

	}

}
