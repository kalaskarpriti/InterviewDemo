package basicJava;

public class MatrixNum {

	public static void main(String[] args) {

		int a[][] = { { 2, 3, 5 }, { 3, 1, 5 }, { 7, 2, 8 }, { 1, 2, -1 } };
		int min = a[0][0];
		int max = a[0][0];
		int mincolumn = 0;
		int z = 0;
		int max1 = a[0][mincolumn];

		// print minimun number from matrix
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					mincolumn = j;
				}

			}

		}
		System.out.println("Manimum number in the matrix is: " + min);

		// print maximum number from matrix

		for (int k = 0; k < 4; k++) {
			for (int l = 0; l < 3; l++) {

				if (a[k][l] > max) {
					max = a[k][l];
				}
			}
		}
		System.out.println("Maximum number in the matrix is: " + max);

		// Print max number of min value coulumn
		while (z < 4) {
			if (max1 < a[z][mincolumn]) {
				max1 = a[z][mincolumn];
			}
			z++;
		}
		System.out.println("Maximun number of min column is: " +max1);
	}
}
