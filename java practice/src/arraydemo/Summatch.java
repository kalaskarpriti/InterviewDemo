package arraydemo;

public class Summatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, -1, 2, 0, 3, -4, 1, 5, 6 };
		int output = 5;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				int a = arr[i] + arr[j + 1];
				if (a == output) {
					 System.out.println("Pairs of elements whose sum is "+output+ " are: " +arr[i]
					 +" and " +arr[j+1]);

				}
			}
		}

	}

}
