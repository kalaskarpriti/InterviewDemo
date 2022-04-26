package arraydemo;

import java.util.Arrays;

public class OneDimArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[2];
		int[] b = { 10, 30, 20, 40 };
		System.out.println(Arrays.toString(b));
		a = b; // here we do not swap or change array element we just changing reference from a
				// to b.
		int[] c = new int['a'];
		char[] c1 = new char[2];
		// System.out.println(a); // reference veritable value will print
		// System.out.println(c1);
		a[0] = 10;
		a[1] = 20; 

		for (int s : a) {
			System.out.println(s);
		}

		/*
		 * int[] a1; a1= {20,30,60}; this is not allowed to declare array and then
		 * initialize it seperately like this
		 */

		int[] arr = new int[4];
		int[] arr1 = { 22, 45, 67,'c' };

		System.out.println(Arrays.toString(arr1));

	}

}
