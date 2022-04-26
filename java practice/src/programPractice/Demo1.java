package programPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) {

		String input = "Hey Good Morning";
		// Ouput= Hey dooG Morning;
		String[] word = input.split(" ");
		System.out.println(input);

		StringBuilder builder = new StringBuilder();
		builder.append(word[1]).reverse();

		System.out.println(word[0] + " " + builder + " " + word[2]);

		String input1 = "abcdefgh";
		// Output= abcfedgh
		char[] charArr = input1.toCharArray();
		List<Character> myList = new ArrayList<Character>();
		for (int i = 0; i < charArr.length; i++) {

			myList.add(charArr[i]);

		}
		System.out.println(input1);
		ListIterator<Character> itr=myList.listIterator();
		while(itr.hasNext()) {
			  char charval = (char) itr.next();
			 if(charval=='d') {
				 itr.set('f');
			 }
			 if(charval=='f') {
				 itr.set('d');
			 }
		}
		System.out.println(myList.toString().replaceAll("[,\\[\\]]","").replaceAll(" ",""));
	}
}
