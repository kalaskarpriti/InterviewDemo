package basicJava;

public class ArrayPractice {

	public static void main(String[] args) {

		// Array declaration type 1
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		System.out.println(a[0]);

		// Array declaration type 2
		int b[] = { 2, 4, 5, 6 };
		System.out.println(b[2]);

		// Print whole array
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// Multidimentional array

		int c[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(c[j][k]);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
