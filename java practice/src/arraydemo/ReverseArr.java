package arraydemo;

import java.util.Arrays;

public class ReverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "Hi", "Hello", "Bye", "Say", "Priti", "Test" };
		String[] str2 = new String[str.length];

		String temp = null;
		int j = 0;
		for (int i = str.length - 1; i >= 0; i--) {
			str2[j] = str[i];
			j++;

		}
		System.out.println(Arrays.toString(str2));
	}

}
