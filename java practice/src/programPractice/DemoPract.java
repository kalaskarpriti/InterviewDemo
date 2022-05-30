package programPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DemoPract {

	public static void main(String[] args) {
		// programe to print repeated string in nitin

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Print number here");
		// Integer num = Integer.valueOf(sc.nextLine());

		int num = 5;

		for (int i = 1; i < num; i++) {
			int cp = 0;
			for (int j = 1; j <= i; j++) {
				cp++;
				System.out.print(cp + " ");
			}

			for (int j = i; j < num; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < num; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(cp-- + " ");
			}

			System.out.println();
		}

		for (int i = 1; i <= num; i++) {
			int cp = 0;
			for (int j = i; j <= num; j++) {
				cp++;
				System.out.print(cp + " ");
			}

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= num; j++) {
				System.out.print(cp-- + " ");
			}

			System.out.println();
		}

	}
}
