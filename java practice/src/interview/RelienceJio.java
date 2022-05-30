package interview;

import java.util.Arrays;

public class RelienceJio {

	public static void main(String[] args) {

		String[] arr = { "AACCC6016B", "AACCC6016B", "AACCC6016b" };
		String[] arr1 = { "29AACCC6016B1Z4", "29AACCC6017B1Z4", "29AACCC6016B1Z4" };
		String[] arr2 = new String[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i].substring(2, 12);
			if (arr2[i].equalsIgnoreCase(arr[i])) {
				System.out.println("true");
			} else
				System.out.println("false");
		}
		System.out.println(Arrays.toString(arr2));

		String[] str = { "aabb", "aabc", "aabbdaaa", "aaabbbeeecccdd", "abcds" };
		for (int i = 0; i < str.length; i++) {
			char[] mychar = str[i].toCharArray();
			int count = 0;
			for (int j = 0; j < mychar.length; j++) {
				int k = j + 1;
				if (k < mychar.length && mychar[j] == mychar[k]) {
					count++;
					mychar[j + 1] = 0;
				}
			}
			System.out.println(count);
		}

	}

}
