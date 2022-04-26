package arraydemo;

import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayProgram.arrreplace();
		ArrayProgram.duplicatearr();
		ArrayProgram.arrayFrequency();
		ArrayProgram.rotatArr();

	}

	public static void arrreplace() {
		int[] arr = { 20, 46, 33, 47 };
		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		System.out.println("Replaced Array Arr1=" + Arrays.toString(arr1));
	}

	public static void arrayFrequency() {

		int[] originalArr = { 10, 20, 50, 50, 30, 10, 20, 30, 40, 50 };
		int[] freqArr = new int[originalArr.length];
		int value = -1;
		for (int i = 0; i < originalArr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < originalArr.length; j++) {
				if (originalArr[i] == originalArr[j]) {
					count++;
					freqArr[j] = value;
				}
			}
			if (freqArr[i] != value) {
				freqArr[i] = count;
			}
		}
		for (int k = 0; k < freqArr.length; k++) {
			if (freqArr[k] != value) {
				System.out.println("Freq of " + originalArr[k] + " is = " + freqArr[k]);
			}
		}
	}

	public static void rotatArr() {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(arr));
		int[] arr1 = new int[arr.length];
		int n = 3;

		for (int j = 0; j < n; j++) {
			int i;
			int first = arr[0];
			for (i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[i] = first;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void duplicatearr() {
		int[] arr = { 1, 3, 4, 3, 8, 5, 1, 2, 4 };
		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					arr1[i] = arr[i];
				}
			}

		}

		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] != 0) {
				System.out.print(" " + arr1[k]);
			}
		}
		System.out.println();

	}
}
