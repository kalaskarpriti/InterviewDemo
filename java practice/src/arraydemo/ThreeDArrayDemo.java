package arraydemo;

import java.util.Arrays;

public class ThreeDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] arr = new int[2][][];
		System.out.println(arr[0]);
		arr[0] = new int[1][2];
		arr[1] = new int[2][3];

		int[][][] arr1 = { { { 10, 20 }, { 20, 30, 40 } }, { { 50, 60, 55 }, { 44, 66 }, { 55, 77, 89 } } };

		arr[0][0][0] = 1;
		arr[0][0][1] = 2;
		arr[1][0][0] = 3;
		arr[1][0][1] = 4;
		arr[1][0][2] = 5;
		arr[1][1][0] = 6;
		arr[1][1][1] = 7;
		arr[1][1][2] = 8;
		System.out.println(arr1.length);
		System.out.println(Arrays.deepToString(arr));

		System.out.println(Arrays.deepToString(arr1));

		int[][] arr2 = { { 10, 30, 45 }, {} };
		System.out.println(arr2);
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[0]);

	}

}
