package programPractice;
import java.util.LinkedHashSet;

public class Demo2 {

	public static void main(String[] args) {
		// input
		int[] arr = { 2, 4, 5, 3, 8, 9,2 };
		// output 2,3,8
		int[] arr2 = { 2, 3, 8 };
		LinkedHashSet<Integer> myset = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++)
				if (arr[i] == arr2[j]) {
					myset.add(arr[i]);
     		}
		}
		System.out.println(myset);
		
		//factorial of num
		int x=5;
		int factorial=1;
		for (int j=1;j<x+1;j++) {
			factorial= factorial*j;
		}
		
		System.out.println(factorial);
	}
}
