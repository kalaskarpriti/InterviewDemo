package programPractice;

public class Demo9 {

	public static void main(String[] args) {
		String str = "asdfgasdasdlklkldsdada";
		char[] mychar = str.toCharArray();
		int[] arr = new int[mychar.length];

		for (int i = 0; i < mychar.length; i++) {
			int count = 1;
			for (int j = i + 1; j < mychar.length; j++) {
				if (mychar[i] == mychar[j]) {
					count++;
					mychar[j] = 0;
				}
				arr[i] = count;
			}
		}
		System.out.println(mychar);
		for (int k = 0; k < arr.length; k++) {
			if (mychar[k] != 0) {
				System.out.println("Frequency of " + mychar[k] + " is = " + arr[k]);
			}
		}

	}

}
