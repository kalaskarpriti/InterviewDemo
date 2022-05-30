package patternProgram;

public class NumPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;

		for (int i = 1; i < num; i++) {
			int count = 1;
			for (int j = i; j <= num; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(count++ + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(count-- + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= num; i++) {
			int count1 = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < num; j++) {
				System.out.print(count1++ + " ");
			}
			for (int j = i; j <= num; j++) {
				System.out.print(count1-- + " ");
			}
			System.out.println();
		}

	}

}
