package arraydemo;

import java.util.Arrays;

public class TwoDimArryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] c = new char[2][];
		c[0] = new char[2];
		c[1] = new char[3];

		c[0][0] = 'A';
		c[0][1] = 'B';

		for (char s : c[0]) {
			System.out.println(s);
		}

		c[1][0] = 'C';
		c[1][1] = 'D';
		c[1][2] = 'E';

		for (char s : c[1]) {
			System.out.println(s);
		}
		System.out.println("-------------------------------- ");

		for (char[] s : c) {
			System.out.println(s);
		}

		char[][] arr1 = { { 'A', 'B', 'C' }, { 'X', 'Y', 'Z' } };

		for (char[] a : arr1) {
			System.out.println(a);
		}
	}

}
