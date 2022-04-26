package stringDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Priti kalaskar");
		System.out.println(sb.reverse());

		String name = "My name is priti";
		ArrayList<Character> nameList = new ArrayList<Character>();
		for (char c : name.toCharArray()) {
			nameList.add(c);
		}

		Collections.reverse(nameList);
		System.out.println(nameList.toString().replaceAll("[,\\[\\]]", "").replaceAll("  ", "@").replaceAll(" ", "").replaceAll("@"," "));
	

	}

}
