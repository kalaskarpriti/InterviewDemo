package programPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 4, 4, 7, -1, 5 };
		// Write Even number program

		// Using arrays

		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
                arr1[i]=arr[i];
			}
			else {
				arr1[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		//Print number directly without array format
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				System.out.println("Even number: "+arr[j]);
			}
			else {
				System.out.println("Odd numbers: "+arr[j]);
			}
		}
		
		//Using list
		List myList=new ArrayList();
		for(int k=0;k<arr.length;k++) {
			if(arr[k]%2==0) {
				myList.add(arr[k]);
			}
		}
		System.out.println(myList);

	}

}
