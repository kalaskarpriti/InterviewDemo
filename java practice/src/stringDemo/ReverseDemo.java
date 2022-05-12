package stringDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Priti kalaskar");
		System.out.println(sb.reverse());

		// Without reverse function
		String val = "Hi this is Priti";
		String newstr = "";
		for (int i = 0; i < val.length(); i++) {
			newstr = val.charAt(i) + newstr;
		}
		System.out.println(newstr);

		// Using List
		String name = "My name is priti";
		ArrayList<Character> nameList = new ArrayList<Character>();
		for (char c : name.toCharArray()) {
			nameList.add(c);
		}

		Collections.reverse(nameList);
		System.out.println(nameList.toString().replaceAll("[,\\[\\]]", "").replaceAll("  ", "@").replaceAll(" ", "")
				.replaceAll("@", " "));

	}

}
