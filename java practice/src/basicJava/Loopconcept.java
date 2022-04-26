package basicJava;

public class Loopconcept {

	public static void main(String[] args) {

		int k = 1;
		int k2 = 1;

		// Print number pyramid
		for (int i = 0; i <= 4; i++) {
			{
				for (int j = 4; j > i; j--) {
					System.out.print(k);
					System.out.print("\t");
					k++;
				}
				System.out.println("\n");
			}
		}
		System.out.println("----------------------------------------");

		for (int i3 = 0; i3 <= 3; i3++) {
			for (int j3 = 0; j3 <= i3; j3++) {
				System.out.print(k2);
				k2++;
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		System.out.println("------------------------------------------");

		for (int i4 = 1; i4 <= 4; i4++) {
			for (int j4 = 1; j4 <= i4; j4++) {
				System.out.print(j4);
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		System.out.println("------------------------------------------");
		
		int k3 = 3;
		for (int i5 = 0; i5 <3; i5++) {
			for (int j5 = 0; j5 <= i5; j5++) {
				System.out.print(k3);
				k3 = k3 + 3;
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("--------------------------------------------");
		// Print pyramid
		for (int i1 = 0; i1 <= 4; i1++) {
			for (int j1 = 0; j1 <= i1; j1++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		System.out.println("--------------------------------------");

		for (int i2 = 4; i2 >= 0; i2--) {
			for (int j2 = 0; j2 <= i2; j2++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

}
