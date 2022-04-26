package collectionPract;

import java.util.ArrayList;
import java.util.List;

public class FindDigit {

	public static void main(String[] args) {
		String inputString = "I am software Tester and having 5 year of experince,"
				+ " 3 years in functional , 2 years in automation";
		char[] charFormat = inputString.toCharArray();
		StringBuffer str = new StringBuffer();
		int sum = 0;
		for (int i = 0; i < charFormat.length; i++) {
			char temp = charFormat[i];

			if (Character.isDigit(temp)) {
				str.append(temp);
			}
		}
		for (int j = 0; j < str.length(); j++) {
			int a = Integer.parseInt(String.valueOf(str.charAt(j)));
			sum = sum + a;
			System.out.println(str.charAt(j));
		}

		System.out.println(sum);

	}
}
