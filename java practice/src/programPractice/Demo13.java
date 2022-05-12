package programPractice;

import java.util.Arrays;

public class Demo13 {

	public static void main(String[] args) {
		// sorting without using collections
		int[] arr = { 2, 7, 5, 6, 1, 0, 4, 4 };
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		char[] arr1 = { 'a', 'l', 'f', 't', 'b', 'e' };

		for (int k = 0; k < arr1.length; k++) {
			char temp;
			for  (int l = k + 1; l < arr1.length; l++){
				if (arr1[k] > arr1[l]) {
					temp = arr1[k];
					arr1[k] = arr1[l];
					arr1[l] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
